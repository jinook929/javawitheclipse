//import javax.swing.JOptionPane;

public class AccountingIFApp {

	public static void main(String[] args) {

//		String draftValue = JOptionPane.showInputDialog("Value of Supply : ");
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		
		double expenseRate = 0.3;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1Rate, dividend2Rate, dividend3Rate;
		
		if(income > 10000) {
			dividend1Rate = 0.5;
			dividend2Rate = 0.3;
			dividend3Rate = 0.2;
		} else {
			dividend1Rate = 1;
			dividend2Rate = 0;
			dividend3Rate = 0;
		}
		double dividend1 = income * dividend1Rate;
		double dividend2 = income * dividend2Rate;
		double dividend3 = income * dividend3Rate;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);
		
	}

}
