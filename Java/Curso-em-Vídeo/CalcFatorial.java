
package calcfatorial;

public class CalcFatorial {

 
    public static void main(String[] args) {
        int numero = 5;
        int contador = numero;
        int resultado = numero;
        
        System.out.print(numero + " Fatorial é igual: " + numero);
        while(contador>1){
          
            resultado *= --contador;
            System.out.print( " X " + contador);
        }
        System.out.println(" = " + resultado);
    }
    
}
