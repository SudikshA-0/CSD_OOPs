
package lec1;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h = 100;
        int l =1;
        int odd = 0;
        int sum = 0;
        for(int i = l; i<=h ;i++){
            if(i%2!=0){
                sum = sum +i;
                odd ++;
            }
        }
        System.out.print("no of odds are: ");
        System.out.println(odd);
        System.out.print("sum is: ");
        System.out.println(sum);



    }
}
