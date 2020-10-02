import java.util.*;

public class HelloWorld{


     public static void main(String []args){

         
        Scanner kb = new Scanner(System.in);
        System.out.println("***Enter a word to replace vowels with ?***\n");
        String w1 = kb.nextLine();
         
        String w1n= "";

        System.out.println(w1);

         for(int i=0; i < w1.length(); i++){

             if(w1.charAt(i)=='a' || w1.charAt(i)=='e' || w1.charAt(i)=='i' || w1.charAt(i)=='o' || w1.charAt(i)=='u'){
                 
                 w1n = w1n + '?';
             }
             else{
                 w1n = w1n + w1.charAt(i);
             }
         }
         System.out.println(w1n);
     }
}
