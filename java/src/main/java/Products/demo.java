package Products;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        ProductList store = new ProductList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("6. Lọc theo giá");
            System.out.println("7. Sắp xếp theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: store.addProduct(); break;
                case 2: store.disPlay(); break;
                case 3: store.updateProduct(); break;
                case 4: store.deleteProduct(); break;
                case 5: store.searchProduct(); break;
                case 6: store.filterByPrice(); break;
                case 7: store.sortByPrice(); break;
                case 0: return;
                default: System.out.println("Sai lựa chọn!");
            }
        }
    }
}
