package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
private LocalDateTime Date;

public Order(LocalDateTime date, OrderStatus status, Client client) {
    Date = date;
    this.status = status;
    this.client = client;
}

private OrderStatus status;

private Client client;
List<OrderItem> orderItem = new ArrayList<>();

public void addOrderItem(OrderItem oi){
orderItem.add(oi);
}

public void removeOrderitem(OrderItem oi){
orderItem.remove(oi);
}

public String toString(){
    StringBuilder sb = new StringBuilder();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
sb.append("ORDER SUMMARY\n");
sb.append("Order momment: "+Date.format(fmt)+"\n");
sb.append("Order status: "+status+"\n");
sb.append("CLIENT: "+client.getName()+"- "+client.getEmail()+"\n");
sb.append("Order items\n");

int soma=0;
for(OrderItem o:orderItem){
    sb.append(o.getProduct().getName()+", ");
    sb.append("$"+o.getProduct().getPrice()+".00, ");
    sb.append("Quantity: "+o.getQuantity()+", ");
    sb.append("SubTotal: $"+o.subTotal()+".00\n");
    soma+= o.subTotal();
    sb.append("Total: "+soma);
}
 return sb.toString();
}

}
