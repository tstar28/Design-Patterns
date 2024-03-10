package DesignPatterns.BuilderPattern;

// use when we have to init values
// in this order of giving value does mattern
// if we use factory method then to much overload function we have to create based on parameters
public class User {
    private final int user_id;
    private final String user_name;
    private final String user_city;

    private User(UserBuilder u) {
        this.user_id = u.id;
        this.user_name = u.name;
        this.user_city = u.city;
    }
   // remove User(){} other wise final varaible will not be initialized
    public String getUser_city() {
        return user_city;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }
    @Override
    public String toString(){
        return this.user_id+" "+this.user_name+" "+this.user_city;
    }
    static  class UserBuilder{
        private int id;
        private String name;
        private String city;
        public  UserBuilder(){

        }
        public UserBuilder setId(int id){
            this.id = id;
            return this;
        }
        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public UserBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public User build(){
            User u = new User(this);
            return u;
        }
    }

}
