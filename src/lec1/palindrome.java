package lec1;

//WAP to count the number of charcters in a given string, to reverse the string andcheck whether it is palindrome or not?
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().trim();
        int len = a.length();
        System.out.println("number of charcters: "+ len);

        StringBuilder b = new StringBuilder(a);
        b.reverse();
        if(a.equals(b.toString())){
            System.out.println("palindrome ");

        }
        else{
            System.out.println(" not a palindrome ");
        }




    }
}
