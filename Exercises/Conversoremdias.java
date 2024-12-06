
/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses edias e 
*mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
*(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Conversoremdias {
	public static void main(String[] args) {
		Scanner t =  new Scanner(System.in);
		int ano, mes, dia, resultado;
		
		System.out.println("Anos:");
		ano = t.nextInt();
		
		System.out.println("Meses:");
		mes = t.nextInt();
		
		System.out.println("Dias:");
		dia = t.nextInt();
		
		resultado = ((ano*365) + (mes*30) + dia);
		System.out.println("Dias totais: " + resultado);
		
		
	}
}
