
package calcmedia;

import java.util.Scanner;


public class CalcMedia {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero;
        int quantidade = 0;
        int contador = 1;
        System.out.println("Digite um valor inteiro para calcular a média:");
            numero = t.nextInt();
            quantidade += numero;
            
        while (true){
            System.out.println("Outro valor ou 999 para interromper.:");
            numero = t.nextInt();
                if (numero != 999){
                    quantidade += numero;
                    contador++;
                }else{
                    break;
                }
        }
        System.out.println("A dos valores inseridos é: " + (quantidade/contador));
    }
    
}
