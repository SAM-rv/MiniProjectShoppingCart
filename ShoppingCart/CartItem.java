package ShoppingCart;
public class CartItem {
    private final Product p;
    private int quantity;

    public CartItem(Product p, int quantity) {
        this.p = p;
        this.quantity = quantity;
    }

    public Product getP() {return p;}
    public int getQuantity() {return quantity;}
    public int getTotalPrice(){return p.getPrice()*quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
}
