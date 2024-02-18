package model.entities;

public class OrderItem {
    
    private Integer quantity;
    private Double price;

    // Creating association
    Product product;

    public OrderItem() {} // Empty construtor...

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    // Getters and Settres
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Double subTotal() { // Calculate the total of some product
        return price*quantity;
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
