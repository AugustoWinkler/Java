/* 
 * Imprime Escada
 */



public class Escadainvertida {
    public static void main(String[] args) {
    
    	for(int i = 14 ; i>=0; i--) {
    		System.out.println("");
    		for (int o = i ; o>=0; o--) {
    			System.out.print(" ");
    		}
    		while (true){
    			System.out.println("■");
    			break;
    		}
    	}
    }
		
}

