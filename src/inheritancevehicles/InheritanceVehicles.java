package inheritancevehicles;

public class InheritanceVehicles {
    public static void main(String[] args){

      Vehicles vehicle = new Vehicles();
      Vans vans = new Vans();
      Cars cars = new Cars(4);

      System.out.println("Done");
} 
}
