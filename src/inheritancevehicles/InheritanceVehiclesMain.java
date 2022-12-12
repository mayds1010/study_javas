package inheritancevehicles;

public class InheritanceVehiclesMain {
    public static void main(String[] args){

      Vehicles vehicles = new Vehicles();
      Vans vans = new Vans();
      Cars cars = new Cars(5);

      System.out.println("Done");
} 
}
