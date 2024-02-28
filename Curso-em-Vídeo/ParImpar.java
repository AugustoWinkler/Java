package parimpar;

import java.util.Scanner;


public class ParImpar {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um valor Inteiro: ");
        int numero = t.nextInt();
        if((numero%2)==1){
            System.out.println("O Numero é Impar");
        }else{
            System.out.println("O Numero é Par");
        }
    }
    
}
