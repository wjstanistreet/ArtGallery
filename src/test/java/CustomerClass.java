import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
// The test file uses the classes(blueprints) to create the objects for testing
public class CustomerClass {
    
    // instantiate the other objects outside the scope of the setup tes
    private Customer abdullah;
    
    @BeforeEach
    public void setUp(){
        // then use setup to construct each object 
        abdullah = new Customer("Abdullah");
        abdullah.setWallet(1000000000.00);
    }
    
    @Test
    public void canBuyArtwork() {
        // move these initiations should be moved to before setUp() and constructors to within setUp() 
        Gallery gallery = new Gallery("Tate");

        Artist leo = new Artist("Leo");

        Artwork artwork1 = new Artwork("Mona Lisa", leo, 860.0, "mona lisa 360");
        Artwork artwork2 = new Artwork("Vitruvian Man", leo, 20.0, "Vitruvian Man 12");

        ArrayList<Artwork> testArray = new ArrayList<Artwork>();
        testArray.add(artwork1);
        testArray.add(artwork2);

        gallery.setStock(testArray);
        
        // have multiple asserts to check if the behaviour of the tested method is accurate and working correctly
        // e.g. check if the wallet has gone down by the price, check if the customer has acquired the artwork in their collection, check if the gallery's collection has decreased 
        assertThat(abdullah.buyArtwork(artwork1, gallery)).isEqualTo("Transaction complete");
    }
}
