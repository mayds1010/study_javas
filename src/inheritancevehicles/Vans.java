package inheritancevehicles;

public class Vans extends Object {
    
    Vans(){
        System.out.println("Vans - constructor");
    }
    public int windows_count(int oneway_count){
        int result = oneway_count * 3;
        return result;
    }
}
