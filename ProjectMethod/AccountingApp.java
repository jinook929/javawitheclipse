
public class AccountingApp {

	public static double valueOfSupply = 10000.0;
	
	public static double VATRate = 0.1;
	
	public static double getVAT() {
		return valueOfSupply * VATRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public static void main(String[] args) {

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());

	}

}
