import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[Product ID: " + productId + ", Name: " + productName + ", Category: " + category + "]";
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int low = 0, high = sortedProducts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedProducts[mid].productId == targetId) {
                return sortedProducts[mid];
            } else if (sortedProducts[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = input.nextInt();
        input.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Product Name: ");
            String name = input.nextLine();
            System.out.print("Category: ");
            String category = input.nextLine();

            products[i] = new Product(id, name, category);
        }

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.print("Enter Product ID to search: ");
        int searchId = input.nextInt();

        Product resultLinear = linearSearch(products, searchId);
        if (resultLinear != null) {
            System.out.println("Linear Search Result: " + resultLinear);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        Product resultBinary = binarySearch(products, searchId);
        if (resultBinary != null) {
            System.out.println("Binary Search Result: " + resultBinary);
        } else {
            System.out.println("Product not found using Binary Search.");
        }

        input.close();
    }
}
