package lec1;

//WAP to create class Number with only one private instance variable as a double primitive type, include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in this class and all above methods should return boolean primitive type like for isPositive() should return “Positive = True”.

import java.util.Scanner;

public class num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Number is zero : " + isZero(num));
        System.out.println("Number is Positive : " + isPositive(num));
        System.out.println("Number is Negative : " + isNegative(num));
        System.out.println("Number is Odd : " + isOdd(num));
        System.out.println("Number is Even : " + isEven(num));
        System.out.println("Number is Prime : " + isPrime(num));
        System.out.println("Number is Armstrong : " + isArmstrong(num));

    }

    static boolean isZero(int num){
        if(num==0){
            return true;
        }
        else{
            return false;
        }
    }


    static boolean isPositive(int num){
        if(num>0){
            return true;
        }
        else{
            return false;
        }
    }


    static boolean isNegative(int num){
        if(num<0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isOdd(int num){
        if(num%2!=0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isPrime(int num){
        int count = 0;
       for(int i = 2; Math.pow(i,2)<=num;i++){
           if(num%1==0){
               count++;
           }

       }
        if (count == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isArmstrong(int num){
     int sum = 0;
     while(num>0){
         int r = num %10;

         sum = sum+(r*r*r);
         num = num/10;
     }
     if(sum == num){
         return true;
     }
     else{
         return false;
     }

    }
}
