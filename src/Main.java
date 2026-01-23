import models.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product.name + ", Price " + product.price + ", Quantity " + product.quantity);

        System.out.println("Enter the number of products to be add in Stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println("Update data: "+ product.name + ", Price " + product.price + ", Quantity " + product.quantity);

        System.out.println("Enter the number of products to be removed in Stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: "+ product.name + ", Price " + product.price + ", Quantity " + product.quantity);

        sc.close();
    }
}