package entities;

public class OrderItem {
    private int quantity;
    private double price;
    
    private Product product;

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

  public Product getProduct() {
      return product;
    }

  public double subTotal(){
   return product.getPrice()*quantity;
  }




  public int getQuantity() {
    return quantity;
  }




  public double getPrice() {
    return price;
  }
    
}
