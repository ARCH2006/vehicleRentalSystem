import java.time.LocalDateTime;
import java.util.ArrayList;

public class RentalService {
    ArrayList<Rental> rentals = new ArrayList<>();
    int rent_id = 0;
    
    public void rent_vehicle(int user_id,int vehicle_id,int time){
        
        rent_id +=1;
        VehicleService vService = new VehicleService();
        double price = vService.getpricebyVehicleId(vehicle_id) * time;
        rentals.add(new Rental(rent_id, user_id, vehicle_id, LocalDateTime.now(), time, price));

    }
    public void veiw_bookings(){
        for(Rental r:rentals){
            
            System.out.println(r.getbooking_id()+"\n"+r.getUserId()+"\n"+r.getVehicleId()+"\n"+r.getDateTime()+"\n"+ r.get_rent_days()+"\n"+ r.get_rent_price());
            
        }
    }
    
}
