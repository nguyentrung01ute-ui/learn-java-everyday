package buoi1;
import java.util.Scanner;
import java.lang.StringBuilder;
public class StringBuilder1 {
    public static void main(String[] args) {
        String s = "Nguyen Van A";
        StringBuilder sb = new StringBuilder("");
        String[] arr = s.split("\\s+"); // Tách chuỗi s bằng mọi khoảng trắng liên tiếp.
        for(String c : arr){
            sb.append(Character.toUpperCase(c.charAt(0)));
            for(int j = 1; j < s.length(); j++){
                sb.append(Character.toLowerCase(c.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
