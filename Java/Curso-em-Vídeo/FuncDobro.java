
package funcdobro;

import java.util.Scanner;



public class FuncDobro {

    static int Dobro(int a) {
        return a * 2;
    }
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um valor para ver seu Dobro");
        int num = t.nextInt();
        int resultado = Dobro(num);
        System.out.println("O dobro do valor é: " + resultado);
        
    }
    
}
