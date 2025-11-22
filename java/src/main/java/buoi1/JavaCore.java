package buoi1;

import java.util.Scanner;
// newbies
public class JavaCore {
    public static void main(String args[]) { // args có thể đặt tên khác nó chỉ là biến
        Scanner sc = new Scanner(System.in);
        //String S = sc.next(); //nhap dau cach co van de (tu sau do se luu vao buffer)
//        int n  = sc.nextInt(); // dư 1 enter
//    String S = sc.nextLine(); // nhập có cẩ dấu space
//     System.out.println(S);
//        sc.nextLine(); // xử lí trôi lệnh
//        for (int i = 0; i < n; i++){
//            String s = sc.nextLine();
//            float gpa = sc.nextFloat();
//            System.out.println("Hello " + s + " " + gpa);
//            sc.nextLine(); // xu li troi lenh
//        }
//        Character c = sc.next().charAt(0); // nhập 1 kí tự
        String s = "Nguyen van trung";
//        String rs = s.concat(c.toString());
//        s.toUpperCase(); // không đổi
//        s = s.toUpperCase(); // in hoa
//        s = s.concat(s); // nối chuỗi
//        System.out.print(s);
//        String t = "Nguyen van";
//        String cut = s.substring(0, 6);
//        System.out.println(s.contains(t)); // kiểm tra t in s ko
        String t = new String("Nguyen van trung");  //!=s -> false (string pool java) nếu dung == do khác bộ nhớ
// nếu dùng new -> Heap mỗi biến ở một vùng nhớ khác
        String g = "Nguyen van trung";
        System.out.println(s.equals(g)); // so sánh giống hay khác
        //compareTo -> trả về âm nusu < == 0 nếu bằng dương nếu >
        System.out.println(s.compareTo(g));
        // duyệt
        for(char c: g.toCharArray()){
            if(Character.isDigit(c)){ // kiểm tra coi phải number ko
                System.out.println(c);
            }
        }
    }
}

