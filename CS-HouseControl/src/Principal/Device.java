package Principal;

public class Device {
    
    private String IDDevice;
    private String name;
    private String brand;
    private String model;
    private boolean status;
    
    public Device(String IDDevice, String name, String brand, String model, boolean status){
        this.IDDevice = IDDevice;
        this.name = name;
        this.brand =  brand;
        this.model = model;
        this.status = status;
    }
 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String toString(){
        return name+" "+brand+" "+model +" " +status;
    }
    
    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Device && obj!= null){
            Device otherDevice =(Device)obj;
            if( this.name.equals(otherDevice.name) &&
                    this.brand.equals(otherDevice.brand) && 
                    this.model.equals(otherDevice.model) ){
                flag = true;
            }
        }
        return flag;
    }
    
    public boolean toggleDevice(){
        this.status = !(this.status); 
        return status;
    }
    
    public boolean switchOffDevice(){
        status = false;
        return status;
    }
    
    public boolean switchOnDevice(){
        status = true;
        return status;
    }
    
}
