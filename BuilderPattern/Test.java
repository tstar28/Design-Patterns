package DesignPatterns.BuilderPattern;

public class Test {
    public static void main(String[] args){
        User u = new User.UserBuilder().setId(123).setCity("Buladshahr").setName("Tushar Singh").build();
        System.out.println(u);
    }
}
