import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x ;
        char y ;
        // enter the integer number
        x=input.nextInt();
        // make casting
        y=(char) x;
        System.out.println(y);
    }
}