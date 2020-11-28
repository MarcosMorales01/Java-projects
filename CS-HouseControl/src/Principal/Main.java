package Principal;

public class Main {
    
    public static void main(String[] ar){
        
        Room living  = new Room("Living");
        Room kitchen = new Room("Kitchen");
        Room bathroom = new Room("Bathroom");
        Room garage = new Room("Garage");
        
        Room bedroom1 = new Room("Bedroom1");
        Room bedroom2 = new Room("Bedroom2");
        Room bathroom1stf = new Room("Bathroom");
        
        
        //Living
        living.addDevice(new Device("1","Aire acondicionado", "LG", "pm07sp", true));
        living.addDevice(new Device("2","Luces", "Philips", "Hue", true));
        //Kitchen
        kitchen.addDevice(new Device("3","luces","Ahorradoras","34234", true));
        //Bathroom
        bathroom.addDevice(new Device("4","luce","simple","354676", true));
        //Garage
        garage.addDevice(new Device("5","lightbulb","the best","X3000",true));
        
        //Bedroom 1
        bedroom1.addDevice(new Device("6","Aire acondicionado", "Mabe" , "Mmt12cdbs3", true));
        bedroom1.addDevice(new Device("7","Luces","Philips","EcoVantage",true));
        
        //Bedroom 2
        bedroom2.addDevice(new Device("8","Aire acondicionado", "Hisense" , "AS-12CR5FVETD/1TR", true));
        bedroom2.addDevice(new Device("9","Luces","Ho Iluminacion","A19 60W Claro",true));
        
        //baño primer piso
        bathroom1stf.addDevice(new Device("10","Luces","Alefco","lw100",true));
        
        
        
        Level groundFloor = new Level("Ground Floor");
        Level firstFloor = new Level("First Floor");
        
        
        groundFloor.addRoom(living);
        groundFloor.addRoom(kitchen);
        groundFloor.addRoom(bathroom);
        groundFloor.addRoom(garage);
        
        firstFloor.addRoom(bedroom1);
        firstFloor.addRoom(bedroom2);
        firstFloor.addRoom(bathroom1stf);
        

        House myhouse = new House("MyHome");
        
        myhouse.addLevel(groundFloor);
        myhouse.addLevel(firstFloor);
        
        System.out.println(myhouse);
        
    }
    
}
