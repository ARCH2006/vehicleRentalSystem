import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO VEHICLE RENTAL SYSTEM");
        Scanner sc = new Scanner(System.in);

       
        boolean base = true;
      
         VehicleService admin_VehicleService = new VehicleService();
         RentalService rentalServices = new RentalService(); 

        while(base){
             System.out.println("1.ADMIN\n2.Customer\n3.exit");
              int choice = sc.nextInt();
            switch(choice){
                case 1:             
                     boolean enter = true;
                    while(enter){
                    System.out.println("1.Add Vehicle\n2.View Vehicles\n3.View Bookings\n4.Update Vehicle\n5.exit");
                     int Admin_choice = sc.nextInt();
                     sc.nextLine();
                     switch (Admin_choice) {
                        case 1:
                            System.out.print("enter vehicle id");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.print("enter vehicle type");
                            String type = sc.nextLine();
                            //Vehicle_type vehicle_type = Vehicle_type.valueOf(type);
                            System.out.print("Enter price per day");
                            double price= sc.nextDouble();
                            sc.nextLine();
                            System.out.print("enter vehicle availabity");
                            boolean availabity = sc.nextBoolean();
                            sc.nextLine();
                            admin_VehicleService.Add_Vehicles(id,
                                        price,
                                        Vehicle_type.valueOf(type),
                                        availabity);
                                                                
                            break;
                        case 2:
                            admin_VehicleService.View_vehicles();
                            break;
                        case 3:
                            rentalServices.veiw_bookings();
                            break;
                        case 5:
                            enter = false;
                            break;
                        default:
                            break;
                     }
                    }
                    break;

                case 2:
                    //UserService customerService =  new UserService();

                    System.out.println("Enter user id: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Enter user name: ");
                    String userName = sc.nextLine();
                    System.out.println("Enter user age: ");
                    int userAge = sc.nextInt();
                     sc.nextLine();
                    UserService.register_new_User(userId, userName, userAge);

                    boolean customerMenu = true;
                while(customerMenu) {
                    System.out.println("1.View Vehicles\n2.search vehicle by name\n3.search vehicle by price\n4.Rentvehicle\n5.exit");
                    int Customer_choice = sc.nextInt();
                    sc.nextLine();
                    switch(Customer_choice) {
                        case 1:
                             System.out.println("view available vehicle\n");
                            admin_VehicleService.View_vehicles();
                            break;
                        case 2:
                            System.out.print("Enter vehicle type to search: ");
                            String searchType = sc.nextLine();
                            
                            System.out.print("vehicle in type"+searchType+"are:\n");
                            admin_VehicleService.searchVehiclesbytype(Vehicle_type.valueOf(searchType));
                            break;
                        case 3:
                            
                            System.out.print("Enter price range: ");
                            double searchPrice = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("vehicle in price range"+searchPrice+"are:\n");
                            admin_VehicleService.searchVehiclesbyprice(searchPrice);
                            break;
                        case 4:
                            System.out.println("view available vehicle\n");
                            admin_VehicleService.View_vehicles();
                            System.out.print("Enter vehicle id to rent: ");
                            int rentId = sc.nextInt();
                            System.out.print("Enter rental days: ");
                            int days = sc.nextInt();
                            rentalServices.rent_vehicle(userId,rentId, days);
                            break;
                        case 5:
                            customerMenu = false;
                            base = false;
                            break;
                        default:
                            break;
                    }
                }
                break;
            case 3:
                base = false;
                break;
            }
        }
        sc.close();
        
        
    }
    
}
