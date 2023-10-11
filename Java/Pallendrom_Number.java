import java.util.*;

public class Pallendrom_Number {

     public static void main(String []args) {
         
        Scanner kb = new Scanner(System.in);
        System.out.println("***Pallendrom Number***\nEnter an integer number: ");
        int n = kb.nextInt();
        kb.close();

        int nd = 0, temp = -1, c = 0, R = 1;
        
        for(int i = 0; nd == 0; i++){
            temp = (int) (n / Math.pow(10,i));         
            if(temp == 0){
                nd = i;
            }
        }

        int arr[] = new int[nd];
        
        for(int i = nd; i > 0; i--){
            temp = (int) (n % Math.pow(10,i));
            arr[c] = (int) (temp/ Math.pow(10,i-1));
            c++;
        }
        
        if(nd/2 > 0){
            for(int i = 1; nd/2 - i >= 0; i++){
                if(arr[nd/2 - i] != arr[nd/2 + i]){
                    R = -1;
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
        
        if(R == 1)
        System.out.println("YES");
        else
        System.out.println("NO");
     }
}
