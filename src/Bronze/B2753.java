package Bronze;

import java.util.Scanner;

public class B2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%400 ==0)||(year%4 ==0 && year%100 != 0)){
            System.out.println("1");
        }
        else{
            System.out.printf("0");
        }
    }
}
