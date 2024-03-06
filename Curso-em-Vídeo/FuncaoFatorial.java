
package funcaofatorial;



class Fatorial{
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f*=c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula =s;
    }
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
    
}

public class FuncaoFatorial {

    public static void main(String[] args) {
        Fatorial f = new Fatorial() ;
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
        
    }
    
}
