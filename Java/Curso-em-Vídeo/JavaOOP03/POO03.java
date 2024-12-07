
package poo03;


public class POO03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; Ponta é private
        c1.carga = 80; //Protected
        //c1.tampada = true; //Protected
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
