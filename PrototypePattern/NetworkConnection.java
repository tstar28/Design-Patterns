package DesignPatterns.PrototypePattern;

import java.io.Serializable;
// this pattern mainly used for resuing object
// object creation may be costly that's why we can't affort to create it every time
public class NetworkConnection implements Serializable {
    public int id;
    public String con;
    NetworkConnection(int id) throws InterruptedException {
        this.id = id;
        this.con = getCon();
    }
    public String getCon() throws InterruptedException {
        Thread.sleep(5000);
        return "123.35.235.234";
    }
    public  String getConnection(){
        return this.con;
    }

    public NetworkConnection clone() throws CloneNotSupportedException {
        return (NetworkConnection) super.clone();
    }

}
