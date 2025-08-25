//odd/even without modulo operator
// using div by 2 and multiply by 2
// subtracting -1
// bitwise
// multi by 5 = 0 at end (even) and multi by 5 = 5 at end(odd)
package lec1;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n =  sc.nextInt();
        int div = n/2;
        int num = div*2;
        if (num==n){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
