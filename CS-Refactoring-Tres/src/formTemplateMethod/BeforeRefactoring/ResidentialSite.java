package formTemplateMethod.BeforeRefactoring;

public class ResidentialSite extends Site {

    public double getBillableAmount(){
        double base = getUnits() * getRate();
        double tax = base * getTaxRate();
        return base + tax;
    }
    
    private double getBase() {
        return getUnits()*getRate()*0.5; 
    }
    
    private double getTax() {
        return getBase()*getTaxRate()*0.2;
    }
}
