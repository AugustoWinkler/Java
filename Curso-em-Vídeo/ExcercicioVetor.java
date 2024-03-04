package excerciciovertor;

import java.util.Arrays;
import java.util.Scanner;

public class ExcercicioVertor {

    
    public static void main(String[] args) {
        int v[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        Arrays.fill(v,0);
        System.out.println("Olá, vamos preencher o vetor abaixo.");
        for(int i:v){
            System.out.print(" " + i);
        }
        while(true){
            System.out.println("Escolha a posição do Vetor:");
            int escolha = teclado.nextInt();
            System.out.println("Digite o valor que deseja adicionar: *999* para");
            if(escolha==999){
                break;
            }
            int valor = teclado.nextInt();
            v[escolha] = valor;
            for(int i:v){
            System.out.print(" " + i);
        }
            
        }
        System.out.println("Vetor final:");
        for(int i:v){
        System.out.print(" " + i);
        }
    }
    
}
