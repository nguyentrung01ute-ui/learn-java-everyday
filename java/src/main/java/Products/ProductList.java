package Products;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductList {
    private ArrayList<Product> list = new ArrayList<Product>();
    private Scanner sc = new Scanner(System.in);

    // Create
    public void addProduct(){
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập price: ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        list.add(new Product(name, price, quantity));
        System.out.println("Đã thêm sản phẩm!");
    }
    // Read
    public void disPlay(){
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("\n--- DANH SÁCH SẢN PHẨM ---");
        for(int i = 0; i < list.size(); i++){
            Product p = list.get(i);
            System.out.println((i + 1) + ".");
            System.out.println("Tên: " + p.getName());
            System.out.println("Giá: " + p.getPrice());
            System.out.println("Số lượng: " + p.getQuantity());
            System.out.println("Tổng giá trị: " + p.getTotalValue());
            System.out.println("------------------------");
        }
    }
    // Update
    public void updateProduct(){
        disPlay();

        System.out.print("Chọn sản phẩm cần sửa: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        if (index < 0 || index >= list.size()) {
            System.out.println("Không hợp lệ!");
            return;
        }

        System.out.print("Nhập tên mới: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá moi: ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng mới: ");
        int quantity = Integer.parseInt(sc.nextLine());

        Product p = list.get(index);
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        list.get(index).setQuantity(quantity);
        System.out.println("Đã cập nhật!");
    }

    //Delete
    public void deleteProduct(){
        disPlay();

        System.out.print("Chọn san phẩm cần xóa: ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index >= list.size()) {
            System.out.println("Không hợp lệ!");
            return;
        }

        list.remove(index);
        System.out.println("Đã xóa thành công!");
    }

    //Search
    public void searchProduct(){
        System.out.print("Nhập từ khóa: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("\nKết quả tìm kiếm:");
        for(Product p : list){
            if(p.getName().toLowerCase().contains(keyword)){
                System.out.println("Tên: " + p.getName());
                System.out.println("Giá: " + p.getPrice());
                System.out.println("Số lượng: " + p.getQuantity());
                System.out.println("------------------------");
            }
        }

    }

    // Filter theo giá <= X
    public void filterByPrice(){
        System.out.print("Nhập giá tối đa");
        int maxPrice = Integer.parseInt(sc.nextLine());
        System.out.println("\nSản phẩm có giá <= " + maxPrice + ":");

        for(Product p : list){
            if(p.getPrice() <= maxPrice){
                System.out.println("\nSản phẩm có giá <= " + maxPrice + ":");
            }
        }
    }
    // Sort theo giá tăng dần
    public void sortByPrice(){
        Collections.sort(list, Comparator.comparing(Product::getPrice));
        System.out.println("đã sắp xếp theo giá!");
    }
}
