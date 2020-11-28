package formTemplateMethod.BeforeRefactoring;

public class LifelineSite extends Site{
    public double getBillableAmount(){
        double base = getUnits() * getRate() * 0.5;
        double tax = base * getTaxRate() * 0.2;
        return base + tax;
    }
}
