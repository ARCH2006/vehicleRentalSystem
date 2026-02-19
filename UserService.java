import java.util.ArrayList;

public class UserService {
    public static ArrayList<User> users_list = new ArrayList<>();
static{ 
    users_list.add(new User(1, "admin",0,"ADMIN"));
}

    public static void register_new_User(int id, String name,int age){
        User new_user = new User(id,name,age,"Customer");
        users_list.add(new_user);
        
    }





}
