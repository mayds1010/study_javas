package inheritancevehicles;

public class Vehicles extends Object {

    Vehicles(){
        // System.out.println("Vehicles - constructor");
    }
    public int speed(int kms, int hours){
        int result = kms / hours;
        System.out.println("speed:"+result);
        return result;
    }
    public int weight(int height, int width, int depth){
        int result = height * width * depth;
        System.out.println("weight:"+ result);
        return result;
    }
}
