import java.time.LocalDateTime;

public class Rental {
    private int booking_id;
    private int user_id;
    private int vehicle_id;
    private LocalDateTime date;
    private int rent_days;
    private double rent_price;


    Rental(int booking_id,
     int user_id,
    int vehicle_id,
    LocalDateTime date,
    int rent_time,double rent_price){
        this.booking_id = booking_id;
        this.user_id = user_id;
        this.vehicle_id = vehicle_id;
        this.date = date;
        this.rent_days = rent_time;
        this.rent_price = rent_price;
    }
    public int getbooking_id(){
        return booking_id;
    }

    public LocalDateTime getDateTime(){
        return date;
    }
    public int get_rent_days(){
        return rent_days;
    }
    public double get_rent_price(){
        return rent_price;
    }

    public int getUserId(){
        return user_id;
    }
    public int getVehicleId(){
        return vehicle_id;

    }

    


    
}
