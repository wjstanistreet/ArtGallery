import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerClass {
    
    private Customer abdullah;
    
    @BeforeEach
    public void setUp(){
        abdullah = new Customer("Abdullah");
        abdullah.setWallet(1000000000.00);
    }
    
    @Test
    public void canBuyArtwork() {
        Gallery gallery = new Gallery("Tate");

        Artist leo = new Artist("Leo");

        Artwork artwork1 = new Artwork("Mona Lisa", leo, 860.0, "mona lisa 360");
        Artwork artwork2 = new Artwork("Vitruvian Man", leo, 20.0, "Vitruvian Man 12");

        ArrayList<Artwork> testArray = new ArrayList<Artwork>();
        testArray.add(artwork1);
        testArray.add(artwork2);

        gallery.setStock(testArray);
        
        assertThat(abdullah.buyArtwork(artwork1, gallery)).isEqualTo("Transaction complete");
    }
}
