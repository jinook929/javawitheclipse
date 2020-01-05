import javax.swing.JOptionPane;

public class AccountingMethodApp {

	public static double valueOfSupply, vatRate, expenseRate;//, vat, total, expense, income;
	public static double[] dividendRates = new double[3];
	
	public static void main(String[] args) {
		
		String enteredValue = JOptionPane.showInputDialog("Value of Supply : ");
		valueOfSupply = Double.parseDouble(enteredValue);
		vatRate = 0.1;
		expenseRate = 0.3;
		
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		print();

	}

	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		
		for(int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividend " + (i + 1) + " (" + (dividendRates[i] * 100) + "%) : " + getDividend(dividendRates[i]));			
		}
	}

	public static double getDividend(double dividendRate) {
		return getIncome() * dividendRate;
	}
	
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
