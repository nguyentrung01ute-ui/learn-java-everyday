package buoi2;

public class output3 {
    public static void main(String[] args) {
        // 0 = zero padding
        // number = right justified padding
        int id = 22;
        System.out.printf("%04d \n", id); //-> 0022
        System.out.printf("%4d \n", id);
    }
}
