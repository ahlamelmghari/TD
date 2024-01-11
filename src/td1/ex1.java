package td1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("donner trois elements :");
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        System.out.println("a="+a+ " b="+b+ " c="+c );
        int max=a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        System.out.println("le max est = "+max);

    }
}