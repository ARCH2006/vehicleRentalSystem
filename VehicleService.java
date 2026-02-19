import java.util.ArrayList;

public class VehicleService {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    
    public void Add_Vehicles(int vehicle_id,
    double price_per_hr,
    Vehicle_type vehicle_type,
    boolean isAvailable)
    {
        Vehicle newvVehicle = new Vehicle(vehicle_id, price_per_hr, vehicle_type, isAvailable);
        vehicles.add(newvVehicle);

    }
    public void View_vehicles(){
        for(Vehicle v:vehicles ){
            System.out.println(v.vehicle_id);
            System.out.println("-"+v.price_per_hr);
            System.out.println("-"+ v.vehicle_type);
            if(v.isAvailable){
                System.out.println("-Available");
            }
            else{
                 System.out.println("-Not Available");
            }

        }
    }
    public void searchVehiclesbytype(Vehicle_type type){
         for(Vehicle v:vehicles ){
            if(v.vehicle_type.equals(type))
            {
                System.out.println(v.vehicle_id);
            System.out.println("-"+v.price_per_hr);
            System.out.println("-"+ v.vehicle_type);
            if(v.isAvailable){
                System.out.println("-Available");
            }
            else{
                 System.out.println("-Not Available");
            }

            }
         }
    }
    public void searchVehiclesbyprice(double price){
         for(Vehicle v:vehicles ){
            if(v.price_per_hr <= price)
            {
                System.out.println(v.vehicle_id);
            System.out.println("-"+v.price_per_hr);
            System.out.println("-"+ v.vehicle_type);
            if(v.isAvailable){
                System.out.println("-Available");
            }
            else{
                 System.out.println("-Not Available");
            }

            }
         }
    }
    public double getpricebyVehicleId(int vehicle_id){
        double gn_price = 0;
        for(Vehicle v:vehicles ){
            if(v.vehicle_id ==vehicle_id){
                gn_price =  v.price_per_hr;
                break;
            }
        }
        return gn_price;

        
    }





    
}
