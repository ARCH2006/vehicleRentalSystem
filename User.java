public class User {
    int User_id;
    String Name;
    int age;
    String user_role;

    User(int User_id,
    String Name,int age,
    String user_role){
        this.User_id = User_id;
        this.Name = Name;
        this.age = age;
        this.user_role = user_role;
    }


    
}


 enum Role{
        ADMIN,
        CUSTOMER
    }


