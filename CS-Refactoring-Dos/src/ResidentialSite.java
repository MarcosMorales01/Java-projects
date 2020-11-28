package formTemplateMethod.BeforeRefactoring;

public class ResidentialSite extends Site {

    public double getBillableAmount(){
        double base = getUnits() * getRate();
        double tax = base * getTaxRate();
        return base + tax;
    }
}
