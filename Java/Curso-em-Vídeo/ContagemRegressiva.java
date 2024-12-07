package contagemregressiva;



import java.util.Scanner;

public class ContagemRegressiva {


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número para iniciar  a contagem regressiva: ");
        int numero = t.nextInt();
        while (numero>=0){
            System.out.println(numero);
            numero--;
            
        }
        
    }
    
}
