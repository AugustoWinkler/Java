/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
 *  A média dos 
 *  números 4, 5 e 6. 
 *  A soma das duas médias. 
 *  A média das médias. 
 */


public class Somamédia {
    public static void main(String[] args) {
        double n1, n2, n3, m1, m2;

        // Cálculo da primeira média
        n1 = 8;
        n2 = 9;
        n3 = 7;
        m1 = (n1 + n2 + n3) / 3;

        System.out.println("A média dos números: " + n1 + ", " + n2 + " e " + n3 + " é: " + m1);

        // Cálculo da segunda média
        n1 = 4;
        n2 = 5;
        n3 = 6;
        m2 = (n1 + n2 + n3) / 3;

        System.out.println("A média dos números: " + n1 + ", " + n2 + " e " + n3 + " é: " + m2);

        // Soma das duas médias e média das médias
        System.out.println("A Soma entre as médias é: " + (m1 + m2) + " e a média das médias é: " + ((m1 + m2) / 2));
    }
}
