package buoi2;
import java.util.Scanner;
public class output_form {

    public static void main(String[] args) {
        String name = "Trung";
        char FirstLetter = 'T';
        int age = 20;
        double height = 60.5;
        boolean isEmployed  = true;

        System.out.printf("Hello %s \n", name); //-> Hello Trung
        System.out.printf("Your name starts with a %c \n", FirstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("you are %f inches tall \n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old \n", name, age);
        System.out.printf("%.2f \n", height);
    }
}
