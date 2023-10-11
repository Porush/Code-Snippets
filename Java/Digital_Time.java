import java.util.*;

public class Digital_Time {

     public static void main(String []args) {

       Scanner kb = new Scanner(System.in);
       int H = -1, M = -1, S = -1, temp;
       int arr[][] = new int[3][9];
       String line;
       String[] lineArr;
       line = kb.nextLine();
       lineArr = line.split(",");
       
       for(int i = 0; i < 9; i++){
         arr[0][i] = Integer.parseInt(lineArr[i]);
       }
       
       for(int i = 0; i < 9; i++){
           for(int j = 0; j < 9; j++){
               if(i != j){
                    temp = arr[0][i]*10 + arr[0][j];
                    if(temp > H && temp >= 0 && temp <= 24){
                        H = temp;
                        for(int x = 0; x < 9; x++){
                            arr[1][x] = 0;
                        }
                        arr[1][i] = arr[1][j] = -1;
                    }
                    
                    //temp = arr[j]*10 + arr[i];
                    //if(temp > M && temp >= 0 && temp <= 24){
                    //    M = temp;
                    //}
               }
           }
       }
       
       for(int i = 0; i < 9; i++){
           for(int j = 0; j < 9; j++){
               if(i != j && arr[1][i] != -1 && arr[1][j] != -1){
                    temp = arr[0][i]*10 + arr[0][j];
                    if(temp > M && temp >= 0 && temp < 60){
                        M = temp;
                        for(int x = 0; x < 9; x++){
                            arr[2][x] = 0;
                        }
                        arr[2][i] = arr[2][j] = -1;
                    }
               }
           }
       }
       
       for(int i = 0; i < 9; i++){
           for(int j = 0; j < 9; j++){
               if(i != j && arr[2][i] != -1 && arr[2][j] != -1 && arr[1][i] != -1 && arr[1][j] != -1){
                    temp = arr[0][i]*10 + arr[0][j];
                    if(temp > S && temp >= 0 && temp < 60){
                        S = temp;
                    }
               }
           }
       }
       
       if(H == -1 || M == -1 || S == -1)
       System.out.print("Impossible");
       else
       System.out.print(H+":"+M+":"+S);
     }
}