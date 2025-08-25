package lec1;

import java.util.Scanner;

public class command_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int sum = 0;
        for(int i = 1; i<=n ;i++){
            System.out.print("Enter no. to add: ");
            int a = sc.nextInt();
            sum = sum+a;

        }
        System.out.println("sum is "+ sum);

    }
}
