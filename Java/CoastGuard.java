import java.util.*;

public class CoastGuard{

     public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        int R,C,k,f, un = 0;
        
        String line;
        String[] lineVector;

        line = kb.nextLine();
        lineVector = line.split(",");

        R = Integer.parseInt(lineVector[0]);
        C = Integer.parseInt(lineVector[1]);
        k = Integer.parseInt(lineVector[2]);

        int boat[][] = new int[k][3];
        
        for(int i = 0; i < k; i++){
            line = kb.nextLine();
            lineVector = line.split(",");
        
            boat[i][0] = Integer.parseInt(lineVector[0]);
            boat[i][1] = Integer.parseInt(lineVector[1]);
        }
        
        for(int i = 0; i < C; i++){
            for(int j = 0; j < R; j++){
                for(int t = 0; t < k; t++){
                    boat[t][2] = Math.abs(i - boat[t][0]) + Math.abs(j - boat[t][1]);
                }
                
                f = k;
                
                for(int t = 0; t < k; t++){
                    for(int p = t+1; p < k; p++){
                        if(boat[t][2] == boat[p][2]){
                            un++;
                            f = p;
                            break;
                        }
                    }

                    if(f != k){
                        break;
                    }
                }
            }
        }
        
        System.out.print(un);
     }
}