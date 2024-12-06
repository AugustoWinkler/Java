/* 
 * Imprime Escada
 */



public class Teste {
    public static void main(String[] args) {
    	
    	System.out.println("TESTE");
    
    	for(int i = 0 ; i<=5; i++) {
    		
    		for (int o = 0 ; o<=i; o++) {
    			System.out.print(" ");
    		}
    		System.out.println(" ");
    		for(int a = 0 ; a<=i; a++) {
    			System.out.print(" #");
    			
    		}
    		for (int o = 0 ; o<=i; o++) {
    			System.out.print(" ");
    		}

    	}
    }
		
}

