package inheritancevehicles;

public class Vans extends Vehicles{
    
    Vans(){
        // System.out.println("Vans - Vehicles");
    }
    public int windows_count(int oneway_count){
        int result = oneway_count * 3;
        System.out.println("windows_count:" + result);
        return result;
    }
}
