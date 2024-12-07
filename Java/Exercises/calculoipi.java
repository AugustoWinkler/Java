/* Escrever um algoritmo que lê: - 
 *
 *a porcentagem do IPI a ser acrescido no valor das peças  - 
 *o código da peça 1, 
 *valor unitário da peça 1, quantidade de peças 1  - 
 *o código da peça 2, 
 *valor unitário da peça 2, quantidade de peças 2 
 *O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
 *Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class calculoipi {
    public static void main(String[] args) {
    	
    	List<Peca> pecas = new ArrayList<>();
    	
    	Scanner t = new Scanner(System.in);
    	double ipi= 0;
    	double total =0;
    	
    	System.out.println("Valor IPI: ");
    	ipi = t.nextDouble();
    	
    	for(int i = 1; i<=2; i++) {
    		int id, quantidade;
    		double valor;
    		
    		System.out.println("Id: " + i);
    		id = t.nextInt();
    		System.out.println("Valor: " + i);
    		valor = t.nextDouble();
    		System.out.println("Quantidade: " + i);
    		quantidade = t.nextInt();
    		
    		 Peca novaPeca = new Peca(id, valor, quantidade);
             pecas.add(novaPeca);
    		
    	}
    	
    	for(Peca peca: pecas) {
    		System.out.println(String.format("Id peça: %s valor: %s quantidade %s", peca.id , peca.valor , peca.quantidade));
    		total+=(peca.valor*peca.quantidade);
    	}
    	
    	System.out.println(total * (ipi / 100 + 1));
    	
    	t.close();
    	
    }
   
}

class Peca {
	
	public int id;
	public double valor;
	public int quantidade;
	
	
	public Peca(int id, double valor, int quantidade) {
		this.id = id;
		this.valor = valor;
		this.quantidade = quantidade;
	}
		
}

