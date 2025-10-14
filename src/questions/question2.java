// write a java program to check strings are anagrams or not using hashmap
// write a java program to count the frequency of each word in a given sentence using hashmap
// write a java program to find the shortest string in a list of string

package questions;

import java.util.HashMap;
import java.util.Scanner;

public class question2 {

    public static boolean anagram(String S1, String S2){
        if(S1.length()!=S2.length()){
           return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : S1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch : S2.toCharArray()){
            if(!map.containsValue(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();


        if(anagram(S1,S2)){
            System.out.println(S1+ " and " + "are anagrams");
        }
        else{
            System.out.println(S1+ " and " + "are not  anagrams");
        }
        }
    }

