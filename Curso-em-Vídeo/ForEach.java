
package foreach;

import java.util.Arrays;


public class ForEach {

   
    public static void main(String[] args) {
        int num[] = {9,2,4,6,10,5};
        Arrays.sort(num);
        for(int valor: num){
            System.out.println(valor);
        }
    }
    
    
}
