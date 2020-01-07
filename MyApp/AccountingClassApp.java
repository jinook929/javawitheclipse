import javax.swing.JOptionPane;

class Accounting {
	
	public String enteredValue = JOptionPane.showInputDialog("Enter the Value of Supply : ");
	public double valueOfSupply, vatRate, expenseRate;
	public double[] dividendRates = new double[3];
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		
		for(int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividend " + (i + 1) + " (" + (dividendRates[i] * 100) + "%) : " + getDividend(dividendRates[i]));			
		}
		
		System.out.println("=====     =====     =====");
	}

	public double getDividend(double dividendRate) {
		return getIncome() * dividendRate;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting();
		
		a1.valueOfSupply = Double.parseDouble(a1.enteredValue);
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		a1.dividendRates[0] = 0.5;
		a1.dividendRates[1] = 0.3;
		a1.dividendRates[2] = 0.2;
		
		a1.print();
		
		Accounting a2 = new Accounting();
		
		a2.valueOfSupply = Double.parseDouble(a2.enteredValue);
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		
		a2.dividendRates[0] = 0.4;
		a2.dividendRates[1] = 0.3;
		a2.dividendRates[2] = 0.3;
		
		a2.print();

	}


