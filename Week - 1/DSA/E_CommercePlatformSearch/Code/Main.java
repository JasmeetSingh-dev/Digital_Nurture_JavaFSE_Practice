import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Shirt", "Apparel"),
            new Product(105, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchAlgo.linearSearch(products, "Keyboard");
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("Binary Search:");
        Product result2 = SearchAlgo.binarySearch(products, "Keyboard");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}