package DesignPatterns.PrototypePattern;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection c1 = new NetworkConnection(123);
        System.out.println(c1.getConnection());
        NetworkConnection c2 = c1;
        System.out.println(c2.getConnection());
    }
}
