//Informar um saldo e imprimir o saldo com reajuste de 1%. 


public class Ajustesaldo {
    public static void main(String[] args) {
        int saldo;
        
        saldo = 500;
        double saldoComReajuste = saldo + (saldo * 1.0 / 100);
        System.out.println("Saldo: " + saldo + " Saldo com Reajuste de 1%: " + saldoComReajuste);
    	
    }
}
