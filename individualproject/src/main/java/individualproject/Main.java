package individualproject;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the product: ");
        String name = scanner.nextLine();

        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        final Product product = new Product(name, price);

        System.out.println("Product created successfully!");
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());

        scanner.close();
    }
}
