package numerosecreto;

import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        int numeroSecreto = (int)(1 + Math.random() * 5);
        System.out.println("Estou pensando em um numero secreto entre 1 e 5 tente adivinhar!");
        Scanner chute = new Scanner(System.in);
        int chuteUsuario = chute.nextInt();
        
        
        if(chuteUsuario == numeroSecreto){
            System.out.println("Parabéns você acertou eu pensei no numero: " + numeroSecreto);
        }else{
            System.out.println("Você errou, Eu pensei no número: " + numeroSecreto);
        }
    };
    
}
