import java.time.LocalDateTime;

public class Rental {
    private int booking_id;
    private int user_id;
    private int vehicle_id;
    private LocalDateTime date;
    private int rent_days;


    Rental(int booking_id,
     int user_id,
    int vehicle_id,
    LocalDateTime date,
    int rent_time){
        this.booking_id = booking_id;
        this.user_id = user_id;
        this.vehicle_id = vehicle_id;
        this.date = date;
        this.rent_days = rent_time;
    }

    public int getUserId(int user_id){
        return user_id;
    }
    public int getVehicleId(int vehicle_id){
        return vehicle_id;

    }

    
}
