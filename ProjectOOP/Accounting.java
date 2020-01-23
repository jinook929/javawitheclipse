
class Accounting {
    
    public double valueOfSupply;    
    public static double vatRate = 0.1;
    
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
 
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}