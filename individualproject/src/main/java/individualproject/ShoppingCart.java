package individualproject;

import java.util.*;


/**
 * @author <Phung Hoang Long - s3965673>
 */

public class ShoppingCart {
    

    private String customerName;
    private ArrayList<Product> cartItems;
    private static ArrayList<ShoppingCart> shoppingCarts = new ArrayList<>();
    private static ArrayList<Product> giftProducts = new ArrayList<>(); // placeholder for gift products

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
        this.cartItems = new ArrayList<>();
        shoppingCarts.add(this);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public static ArrayList<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public static ArrayList<Product> getGiftProducts() {
        return giftProducts;
    }

    public boolean addItem(Product product) {
        if (product != null) {
            cartItems.add(product);
            return true;
        }
        return false;
    }

    public boolean removeItem(Product product) {
        if (product != null) {
            return cartItems.remove(product);
        }
        return false;
    }

    public double cartAmount() {
        double totalAmount = 0;
        for (Product product : cartItems) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

    public static ShoppingCart getCart(int index) {
        if (index >= 0 && index < shoppingCarts.size()) {
            return shoppingCarts.get(index);
        }
        return null;
    }

    public static int getCartCount() {
        return shoppingCarts.size();
    }

    public static void editProduct(Product product, double newPrice) {
        if (product != null) {
            product.setPrice(newPrice);
            for (ShoppingCart cart : shoppingCarts) {
                for (Product cartProduct : cart.getCartItems()) {
                    if (cartProduct.equals(product)) {
                        cartProduct.setPrice(newPrice);
                    }
                }
            }
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, String description, double price, double price2) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
