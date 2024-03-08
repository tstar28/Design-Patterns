package DesignPatterns.AbstractPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String role){
        if(role.trim().equalsIgnoreCase("JavaDeveloper"))
          return new JavaDeveloper();
        else if(role.trim().equalsIgnoreCase("WebDeveloper"))
         return new WebDeveloper();
        else 
         return null;
    }
}
