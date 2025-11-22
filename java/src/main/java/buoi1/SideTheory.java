package buoi1;
/* Các Hàm Chuyển Đổi Xâu Thành Số Và Ngược Lại
* Lớp BigInteger Trong Java:
 */
import java.math.BigInteger;
import  java.util.Scanner;
public class SideTheory {
    public static void main(String[] args) {
        int n = 1243252;
        String s = "" + n;
        System.out.println(s); // xaaus kis tu

        // convert to number
        System.out.println(Integer.parseInt(s));
        String s1 = "393993939393939939393939";
        String s2 = "3935555593939939393939";
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        System.out.println(num1.add(num2));
    }
}
