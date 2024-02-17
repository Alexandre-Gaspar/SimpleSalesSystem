package entities;

public class OrderItem {
    
    private int quantity;
    private double price;

    // Creating association
    Product product;

    public OrderItem() {} // Empty construtor...

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    // Getters and Settres
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double subTotal() { // Calculate the total of some product
        return getQuantity()*getPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName() + ", ");
        sb.append(product.getPrice() + ", ");
        sb.append("Quantity: " + getQuantity() + ", ");
        sb.append("Subtotal: " + subTotal() + "\n");

        return sb.toString();
    }

}
