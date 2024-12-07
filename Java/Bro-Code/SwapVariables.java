package BroCode;

public class SwapVariables {

	public static void main(String[] args) {
		String x = "Water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x =y;
		y=temp;
		
		System.out.println("X: " + x + "Y : " + y);

	}

}
