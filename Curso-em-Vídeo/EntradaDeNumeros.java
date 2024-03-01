package entradadenumeros;

import java.util.Scanner;


public class EntradaDeNumeros {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int cc = 0;
        int pares = 0,impares = 0,totValores = 0,acima100 =0,media;
        System.out.println("Vá me digitando valores e use o 0 para interromper:");
        while (true){
            System.out.println("Valor " + cc + ": ");
            int valor = t.nextInt();
                if (valor != 0){
                    cc++;
                    if (valor % 2 == 0){
                        pares++;
     
                }else{
                        impares++;
                    }
                if(valor>100){
                    acima100++; 
                }totValores +=valor;
                continue;
            }break;
        }
        if(cc!=0){
            media = totValores / cc;
        }
        
        System.out.println("Total de Valores Inseridos: " + cc);
        System.out.println("Valores Pares: " + pares);
        System.out.println("Valores Impares: " + impares);
        System.out.println("Valores a cima de 100: " + acima100);
        System.out.println("Média dos valores: " + media );
    }
    
}
