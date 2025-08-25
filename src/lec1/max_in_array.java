package lec1;

import java.util.Scanner;

public class max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 2, 9, 1, 14, 3};

                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("Maximum element = " + max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element = " + min);
            }
        }



