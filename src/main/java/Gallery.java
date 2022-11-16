import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;
    
    public Gallery(String name){
        this.name = name;
        this.till = 0.00;
        this.stock = new ArrayList<>();
    }
    
    // removes.artwork from stock
    public void reduceArtwork(Artwork artwork){
        for (Artwork art : this.stock) {
            if (art.getTitle().equals(artwork.getTitle())){
                // remove from stock
                this.stock.remove(art);
                this.till = this.till + artwork.getPrice();
            } else {
                break;
            }
        }
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getTill(){
        return this.till;
    }
    
    public void setTill(double till){
        this.till = till;
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    public void setStock(ArrayList<Artwork> stock) {
        this.stock = stock;
    }
}
