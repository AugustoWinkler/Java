
package vetormes;

import java.util.Scanner;

public class VetorMes {

    
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","nov","Dez"};
        String tot[] = {"31","27","31","30","31","30","31","31","30","31","30","31"};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o mês representado por número?");
        int numeroMes = teclado.nextInt(); 
        System.out.println("O Mês: " + mes[numeroMes -1] + " Tem: " + tot[numeroMes -1] + " dias!");
        
        
    }
    
}
