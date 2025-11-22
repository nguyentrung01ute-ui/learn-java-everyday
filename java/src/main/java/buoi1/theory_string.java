package buoi1;
/*
Hàm length(): Trả về số kí tự trong xâu đang có.
Hàm charAt(): String tương tự như mảng, chỉ số bắt đầu từ 0, hàm charAt(index) trả về kí tự ở chỉ số index.
Hàm toUpperCase(): Trả về xâu ở dạng in hoa, hàm này không thay đổi xâu ban đầu.
Hàm toLowerCase():Trả về xâu ở dạng in thường, hàm này không thay đổi xâu ban đầu.
Hàm concat(): Nối 2 xâu thanh 1 xâu.
Hàm compareTo() : so sánh 2 xâu theo thứ tự từ điển, nếu 2 xâu bằng nhau trả về 0, trả về số âm nếu xâu hiện tại nhỏ hơn xâu cần so sánh, ngược lại trả về số dương.
Hàm  compareToIgnoreCase() : sẽ bỏ qua in hoa in thường khi so sánh.
Hàm contains():Kiểm tra sự tồn tại của xâu con.
Hàm substring(start,end):giúp tách xâu con.
Hàm equals() :So sánh 2 xâu và trả về true hoặc false
isDigit(char c) : Kiểm tra chữ số
isLowerCase (char c) : Kiểm tra chữ in thường
isUpperCase(char c): Kiểm tra in hoa
isAlphabetic(char c): Kiểm tra chữ cái
toLower(char c) : Chuyển thành chữ in thường
toUpper(char c): Chuyển thành chữ in hoa

*/
import java.util.Scanner;
public class theory_string {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        String S = "Java Python Cpp";
        String t = "Hello World";
        System.out.println(S.charAt(2)); //->v
        S = S.toUpperCase();
        System.out.println(S); //-> JAVA PYTHON CPP

        String k = S.concat(t);
        System.out.println(k); // -> JAVA PYTHON CPPHello World

        for(int c : S.toCharArray()){
            if(Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}
