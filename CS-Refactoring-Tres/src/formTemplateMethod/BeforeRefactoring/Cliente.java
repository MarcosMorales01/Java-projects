package formTemplateMethod.BeforeRefactoring;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Cliente {

    public Cliente() {
        Site site = new ResidentialSite();
        site.setRate(10.5);
        site.setTaxRate(.1);
        site.setUnits(100);
        System.out.println(site.getBillableAmount());
        
        Site site2 = new ResidentialSite();
        site2.setRate(10.5);
        site2.setTaxRate(.1);
        site2.setUnits(100);
        System.out.println(site2.getBillableAmount());
    } 
    
    public static void main(String[] args) {
        new Cliente();
    }
}
