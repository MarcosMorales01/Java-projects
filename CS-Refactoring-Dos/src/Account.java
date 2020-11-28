package moveMethod.BeforeRefactoring;

public class Account {

    private AccountType type;
    private int daysOverdrawn;

    private double overdraftCharge(){
        return type.getOverdraftCharge(this.daysOverdrawn);
    }

    public double bankCharge(){
        double result = 4.5;
        if(daysOverdrawn > 0){
            result += overdraftCharge();
        }
        return result;
    }
    
    public static void main(String[] args) {
        /*
        Account account = new Account();
        AccountType accountType = new AccountType();
        accountType.setType("normal");
        account.setType(accountType);
        account.setDaysOverdrawn(10);
        System.out.println(account.bankCharge());
        */
        Account account = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();
        
        AccountType accountType = new AccountType();
        accountType.setType("normal");
        AccountType accountType2 = new AccountType();
        accountType2.setType("normal");
        AccountType accountType3 = new AccountType();
        accountType3.setType("normal");
        AccountType accountType4 = new AccountType();
        accountType4.setType("normal");
        
        account.setType(accountType);
        account.setDaysOverdrawn(1);
        account2.setType(accountType2);
        account2.setDaysOverdrawn(5);
        account3.setType(accountType3);
        account3.setDaysOverdrawn(10);
        account4.setType(accountType4);
        account4.setDaysOverdrawn(6);
        System.out.println(account.bankCharge());
        System.out.println(account2.bankCharge());
        System.out.println(account3.bankCharge());
        System.out.println(account4.bankCharge());
        
    }

    private void setType(AccountType type) {
        this.type = type;
    }

    private void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }
    
}
