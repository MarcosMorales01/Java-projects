package Principal;

import java.util.ArrayList;

public class Room {
  
    private ArrayList<Device> devices;
    private String IDRoom;
    private String name;
      
    
    public Room(String IDRoom, String name, ArrayList<Device> devices){
        this.IDRoom = IDRoom;
        this.name = name;
        this.devices = devices;
        }
    
    public Room(String name){
        this.devices = new ArrayList<Device>();
        this.name = name;
        
    }
    
    public void addDevice(Device device){
        devices.add(device);
    }

    /**
     * @return the devices
     */
    public ArrayList<Device> getDevices() {
        return devices;
    }

    /**
     * @param devices the devices to set
     */
    
    public void setDevices(Device[] devices) {
        this.setDevices(devices);
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

    public String toString(){
        String output = "";
        output=output+name +"\n";
        for(int i = 0; i < this.devices.size(); i++){
            output = output+devices.get(i).toString()+"\n";
        }
        return output;
    }
    
    /**
     * @return the deviceCounter
     */
    public int getDeviceCounter() {
        return devices.size();
    }


    
    public int searchDevice(Device otherDevice){
        int i = 0;
        boolean  flag = false;
        for(i = 0; i < getDeviceCounter() && flag == false; i++){
            if(devices.get(i).equals(otherDevice)){
                flag = true;
                break;
            }
        }
        if(flag == false){
            i = -1;
        }
        return i;
    }
    
    public boolean  removeDevice(Device device){
        boolean flag = false;
        int pos =  searchDevice(device);
        
        if(pos != -1){
            devices.remove(pos);
        }
        
        return flag;
        
    }
    
    public void switchOffAllDevices(){
        for(int i = 0; i < getDeviceCounter(); i++){
            devices.get(i).switchOffDevice();
        }
    }
    
    public void switchOnAllDevices(){
        for(int i = 0; i < getDeviceCounter(); i++){
            devices.get(i).switchOnDevice();
        }
    }
    
    //Equals Room
    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Room && obj!= null) {
            Room otherRoom =(Room)obj;
            if(this.name == otherRoom.name) {
                flag = true;
            }
        }
        return flag;
    }

    
}

