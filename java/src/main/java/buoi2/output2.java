package buoi2;

public class output2 {
    public static void main(String[] args) {
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        double price1  = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.println("+ = output a plus");
        System.out.printf("%+.2f \n", price1);
        System.out.printf("%+.2f \n", price2);
        System.out.printf("%+.2f \n", price3);

        System.out.println(", = comma grouping separator");
        System.out.printf("%,.2f \n", price1);
        System.out.printf("%,.2f \n", price2);
        System.out.printf("%,.2f \n", price3);

        System.out.println("( = negative numbers are enclosed in ()");
        System.out.printf("%(.2f \n", price1);
        System.out.printf("%(.2f \n", price2);
        System.out.printf("%(.2f \n", price3);

        System.out.println("space = display a minus if negative, space if positive");
        System.out.printf("% .2f \n", price1);
        System.out.printf("% .2f \n", price2);
        System.out.printf("% .2f \n", price3);
    }
}
