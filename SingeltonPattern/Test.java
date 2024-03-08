import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Test{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
        King k = King.getObject();
        System.out.println(k.hashCode());
        King k2 = King.getObject();
        System.out.println(k2.hashCode());

        //break 1 using java reflection API
        // try {
        //     Constructor<King> constructor = King.class.getDeclaredConstructor();
        //     constructor.setAccessible(true);
        //     King k3 = constructor.newInstance();
        //     System.out.println(k3.hashCode());
        // } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
        //     e.printStackTrace();
        // }

        //break 2 using serializing and deserializing
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        // oos.writeObject(k);
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // King k4 = (King) ois.readObject();
        // System.out.println(k4.hashCode());

        //break 3
        // King k5 = (King) k.clone();
        // System.out.println(k5.hashCode());
    }
}