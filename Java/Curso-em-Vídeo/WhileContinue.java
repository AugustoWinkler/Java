package whilecontinue;


public class WhileContinue {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while(cc<10){
            cc++;
            if(cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if(cc ==7){
                break;
            }
             System.out.println("cambalhota" + cc);
        }
    }
    
}
