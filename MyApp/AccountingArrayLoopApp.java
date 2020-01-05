import javax.swing.JOptionPane;

public class AccountingArrayLoopApp {

	public static void main(String[] args) {

		String draftValue = JOptionPane.showInputDialog("Value of Supply : ");
		double valueOfSupply = Double.parseDouble(draftValue);
		double vatRate = 0.1;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		
		double expenseRate = 0.3;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
//		double[] dividendRates = {0.5, 0.3, 0.2};
		double[] dividendRates = new double[3]; 
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;


//		double dividend1 = income * dividendRates[0];
//		double dividend2 = income * dividendRates[1];
//		double dividend3 = income * dividendRates[2];
		
		System.out.println("=== Price ===");
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("\nTotal price: " + total);
		
		System.out.println("\n=== Profit Division ===");
		
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income + "\n");
		
		for(int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividend " + (i + 1) + " : " + (income * dividendRates[i]));
		}
		
		System.out.println("\n=======================");
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend " + (i + 1) + " (" + (dividendRates[i] * 100) + "%) : " + (income * dividendRates[i]));
			i++;
		}
		
//		System.out.println("Dividend 1 : " + dividend1);
//		System.out.println("Dividend 2 : " + dividend2);
//		System.out.println("Dividend 3 : " + dividend3);
		
	}

}
