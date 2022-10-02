import java.util.*;
import java.lang.*;

public class Reverse_Word {

     public static void main(String []args) {
        System.out.println("Hello World");
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();
        char[] arr= new char[word.length()];
        System.out.println("Your Word: "+word+"\n");
        
        for(int i=0; i<word.length(); i++){
            
            arr[word.length()-1-i] = word.charAt(i);
        }
        System.out.print("Reverse Word: ");
        
        for(int i=0; i<word.length(); i++){
            
            System.out.print(arr[i]);
        }
     }
}
