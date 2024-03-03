
package contadorfor;

import java.util.Scanner;


public class ContadorFor {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos contar, você escolhe o inicio o fim e o passo!");
        System.out.print("Inicio:");
        int inicio = teclado.nextInt();
        System.out.print("Fim:");
        int fim = teclado.nextInt();
        System.out.print("Passo:");
        int passo = teclado.nextInt();
        
        for(int i = inicio; i<=fim; i+=passo){
            System.out.println(i);
        }
            
               
        
    }
    
}
