package vetorbusca;

import java.util.Arrays;


public class VetorBusca {

    
    public static void main(String[] args) {
        int vet[]= {3,7,6,5,4,9,8,7,1};
        for(int v:vet){
            System.out.println(v);
        }
        var p = Arrays.binarySearch(vet,6);
        System.out.println("Encontrei o valor na posição: " + p);
    }
    
}
