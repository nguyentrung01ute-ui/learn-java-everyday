package buoi2;

public class string {
    public static void main(String[] args) {
        String name = "Bro code";
        int  length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int Lastindex = name.lastIndexOf("o"); // chữ o sau cùng

//        name = name.toLowerCase();
//        name = name.toUpperCase();
        name = name.trim(); // xóa hết dấu space
//        name = name.replace("o", "a");
//        System.out.print(name.isEmpty()); // kiểm tra rỗng

 /*       if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name doesn't contain any space");
        }
*/
        if(name.equals("password")) { // name.equalsIgnoreCase() không biệt chứ hoa hay chữ thường
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
