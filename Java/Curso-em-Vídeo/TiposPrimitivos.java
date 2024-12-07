/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Augusto Winkler
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Nome do Aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a Nota do Aluno:");
        float nota = teclado.nextFloat();
        //System.out.print("A Nota é: " + nota);
        //println cria um salto de linha.
        //System.out.println("A Nota é: " + nota);
        //printf é Print formatado %.xf muda a quantidade de Casas Flutuantes e \n quebra a linha
        //System.out.printf("A Nota de %s é: %.1f \n", nome,  nota);
        //format é igual printf
        System.out.format("A Nota de %s é: %.1f \n", nome,  nota);
        
    }
    
}
