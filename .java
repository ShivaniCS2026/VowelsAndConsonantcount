import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      int count = 0;
      int count1 = 0;
      
      
      for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (Character.isLetter(ch)) {
               if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' ||ch == 'i' || ch == 'O' || ch == 'o' || ch == 'u' || ch == 'U'){
               count= count + 1;
               
        }
             else {
             count1 = count1 + 1;
            
              }
            }
      }
        System.out.println("Vowels: "+ count);
        System.out.println("Consonants: "+ count1);
      
    }
}
