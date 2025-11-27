package Products;

public class Product {
    private String name;
    private int price, quantity;
    private static int totalProducts = 0;

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts += 1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getTotalProducts(){
        return totalProducts;
    }

    public int getTotalValue(){
        return price*quantity;
    }
}
