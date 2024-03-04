package vetores;


public class Vetores {

    
    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        
        for(int cc=0; cc<=n.length -1; cc++){
            System.out.println("Na posição " + cc + "Temos o valor:" + n[cc]);
        }
        System.out.println("Possui o tamanho de: "  + n.length);    
    }
    
}
