package DesignPatterns.AbstractPattern;

public class Test {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee("JavaDeveloper");
        Employee e2 = EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println(e1.salary());
        System.out.println(e2.salary());
    }
}
