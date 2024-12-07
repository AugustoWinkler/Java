package idadeemdias;

import java.util.Scanner;

public class IdadeEmDias {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Anos: ");
        int anos = t.nextInt();
        System.out.println("Meses: ");
        int meses = t.nextInt();
        System.out.println("Dias: ");
        int dias = t.nextInt();
        
        int idadeDias = (anos*365) + (meses*30) + dias;
        System.out.println("Você tem: " + idadeDias + " Dias vividos");
    }
    
}
