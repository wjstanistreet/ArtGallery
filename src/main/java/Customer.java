public class Customer {
    private String name;
    private double wallet;
    
    public Customer(String name){
        this.name = name;
        this.wallet = 0.0;
    }
    
    // buyArtwork(artwork's nft)
    // check if customer can afford (if wallet >= price)
   
   // SRP: we can split the buyartwork method into a boolean 'check if the customer can afford' and a void buy artwork method. These can be called by the gallery 
    public String buyArtwork(Artwork artwork, Gallery gallery){
        if (this.wallet >= artwork.getPrice()){
            // reduce artwork (artworks nft) from galleries stock
            // reduce customers wallet
            this.wallet = this.wallet - artwork.getPrice();
            gallery.reduceArtwork(artwork);
            return "Transaction complete";
        } else {
            return "Insufficient funds";
        }
    }
    
    
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
