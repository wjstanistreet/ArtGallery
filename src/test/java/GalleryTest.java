import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryTest {
    
    private Gallery gallery;
    
    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Tate");
        
    }
    
    @Test
    public void hasTill() {
        assertThat(gallery.getTill()).isEqualTo(0.0);
        
        gallery.setTill(1000.00);
        assertThat(gallery.getTill()).isEqualTo(1000.0);
    }
    
    @Test
    public void canSetTill() {
        gallery.setTill(100000.00);
        assertThat(gallery.getTill()).isEqualTo(100000.0);
    }
    
    @Test
    public void hasStock() {
        Artist leo = new Artist("Leo");
        
        Artwork artwork1 = new Artwork("Mona Lisa", leo, 860.0, "mona lisa 360");
        Artwork artwork2 = new Artwork("Vitruvian Man", leo, 20.0, "Vitruvian Man 12");

        ArrayList<Artwork> testArray = new ArrayList<Artwork>();
        testArray.add(artwork1);
        testArray.add(artwork2);
        
        gallery.setStock(testArray);
        
        assertThat(gallery.getStock().size()).isEqualTo(2);
        
    }
    
    @Test
    public void canSetStock() {
        Artist leo = new Artist("Leo");

        Artwork artwork1 = new Artwork("Mona Lisa", leo, 860.0, "mona lisa 360");
        Artwork artwork2 = new Artwork("Vitruvian Man", leo, 20.0, "Vitruvian Man 12");

        ArrayList<Artwork> testArray = new ArrayList<Artwork>();
        testArray.add(artwork1);
        testArray.add(artwork2);

        gallery.setStock(testArray);
        
        assertThat(gallery.getStock().size()).isEqualTo(2);
    }
    
    @Test
    public void canReduceArtwork(){
        Artist leo = new Artist("Leo");

        Artwork artwork1 = new Artwork("Mona Lisa", leo, 860.0, "mona lisa 360");
        Artwork artwork2 = new Artwork("Vitruvian Man", leo, 20.0, "Vitruvian Man 12");

        ArrayList<Artwork> testArray = new ArrayList<Artwork>();
        testArray.add(artwork1);
        testArray.add(artwork2);

        gallery.setStock(testArray);
        
        gallery.reduceArtwork(artwork1);
        
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }
}
