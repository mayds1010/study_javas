package inheritancevehicles;

public class InheritanceVehiclesMain {
    public static void main(String[] args){

      Vehicles vehicles = new Vehicles();
    System.out.println("- Vehicles:");
    vehicles.speed(200, 2);
    vehicles.weight(10,20,30);
    
   
    Vans vans = new Vans();
    System.out.println("- Vans:");
    vans.speed(200, 2);
    vans.weight(10, 20, 30);
    vans.windows_count( 2);
   

    Cars cars = new Cars( 2);
    System.out.println("- Cars:");
    cars.speed(200, 2);
    cars.weight(10, 20, 30);
    System.out.println("Done");

} 
}
