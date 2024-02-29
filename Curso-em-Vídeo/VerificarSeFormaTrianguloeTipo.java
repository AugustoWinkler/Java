public class VerificarSeFormaTrianguloeTipoe {

   
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 5;
        c = 15;
        boolean formaTriangulo = false;
        String tipo;
        
        if (a+b>c && a+c>b && c+b>a){
            formaTriangulo = true;
        }
        if(!formaTriangulo){
            System.out.println("Os Valores não formam um Triangulo.");
        }else{
            if(a==b && b==c){
                tipo = "Equilátero";
            }else if(a==b || b==c || c==a){
                tipo = "Isósceles";
            }else{
                tipo = "Escaleno";
            }
            System.out.println("O tipo do Triangulo é: " + tipo);
        }
    }
    
}
