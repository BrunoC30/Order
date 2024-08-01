package application;
import java.util.Scanner;

import entities.*;

import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name : ");
    String clientName= sc.nextLine();
    System.out.print("Enter your email : ");
    String clientEmail = sc.nextLine();
    System.out.print("Enter BirthDate : ");
    LocalDate BirthDate = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    
    Client client1 = new Client(clientName, clientEmail, BirthDate);
    System.out.println("ENTER ORDER DATA:");
    System.out.print("STATUS: ");
    OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());
   
    Order order1 = new Order(LocalDateTime.now() , status, client1);

    System.out.print("how many items to this order");
    
    
    
    int n = sc.nextInt();
    
    for(int i=1;i<=n;i++){
        
        System.out.println("product #"+i);
        sc.nextLine();
        System.out.print("Enter product name: ");
        String proName = sc.nextLine();
        System.out.print("Enter prodct price: ");
        int proPrice = sc.nextInt();
        System.out.print("Enter quantity: ");
        int qtt = sc.nextInt();
       
        Product product= new Product(proName, proPrice);
       OrderItem item = new OrderItem(qtt, product);
    
       order1.addOrderItem(item);
    }

    System.out.println(order1);

    sc.close();
}
}
