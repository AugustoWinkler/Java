package estruturascondicionaiscompostas;

import java.util.Scanner;


public class EstruturasCondicionaisCompostas {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ano de Nascimento:");
        int nasc = teclado.nextInt();
        int i = 2024 - nasc;
        
        if(i>18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade."); 
        }
        
        
        
    }
    
}
