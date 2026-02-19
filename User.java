public class User {
    private int User_id;
    private String Name;
    private int age;
    private String user_role;

    User(int User_id,
    String Name,int age,
    String user_role){
        this.User_id = User_id;
        this.Name = Name;
        this.age = age;
        this.user_role = user_role;
    }
    public int get_user_id(){
        return User_id;

    }
    public String getName(){
        return Name;
    }
    public String getuser_role(){
        return user_role;
    }
    public void Setid(int id){
        this.User_id = id;
    }
    public void SetName(String Name){
         this.Name = Name;
    }
    public void Setrole(String role){
        this.user_role = role;
    }
    public void setAge(int age){
        this.age = age;
    }



    


    
}


 enum Role{
        ADMIN,
        CUSTOMER
    }


