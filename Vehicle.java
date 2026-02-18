public class Vehicle {
    int vehicle_id;
    double price_per_hr;
    Vehicle_type vehicle_type;
    boolean isAvailable;

    Vehicle( int vehicle_id,
    double price_per_hr,
    Vehicle_type vehicle_type,
    boolean isAvailable){
        this.vehicle_id=vehicle_id;
        this.price_per_hr = price_per_hr;
        this.vehicle_type = vehicle_type;
        this.isAvailable= isAvailable;
    }
   






    
}
 enum Vehicle_type{
        CAR,BIKE,AUTO
        
    }
