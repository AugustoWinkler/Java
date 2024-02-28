package votoobrigatório;

import java.util.Scanner;


public class VotoObrigatório {

  
    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        System.out.println("Digite seu ano de Nascimento:");
       int anoNascimento = t.nextInt();
       int anoAtual = 2024;
       int idade = anoAtual - anoNascimento;
       
       if (idade<16){
           System.out.println("Voto Proibido!");
       }else if((idade>=16 && idade<18) || idade>70){
               System.out.println("Voto Opicional");
           }else{
               System.out.println("Voto Obrigatório");
           }
       
       
       
       
       
       
    }
    
}
