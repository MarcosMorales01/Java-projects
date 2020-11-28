package moveMethod.BeforeRefactoring;

public class AccountType {

    private String type;
    public boolean isPremium(){
        return type.equals("premium");
    }

    public void setType(String normal) {
        this.type = normal;
    }
    
    public double getOverdraftCharge(int daysOverdrawn) {
        if(isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        }else{
            return daysOverdrawn * 1.75;
        }
    }
}
