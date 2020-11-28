package formTemplateMethod.BeforeRefactoring;

/**
 * En este ejemplo tenemos dos subclases de la clase site que tienen un método muy
 * similar en ambas
 */
public abstract class Site {

    private double rate;
    private double taxRate;
    private double units;

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    public abstract double getBillableAmount();
    
    //public 
}
