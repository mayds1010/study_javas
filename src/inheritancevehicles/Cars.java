package inheritancevehicles;

public class Cars extends Vans{
    int oneway_count = 0;
   
    Cars(){
        // System.out.println("Cars - constructor");
    }
    Cars(int oneway_count){
        this.oneway_count = oneway_count;
        // System.out.println("Cars - constructor");
    }
    public int speed(int kms, int hours){
        int result = kms / hours + oneway_count;
        return result;
    }
}
