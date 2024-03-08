import java.io.Serializable;

public class King implements Serializable,Cloneable {
    //Eager way of init private static volatile King k = new King();
    private static volatile King k;
    private King(){
        
    }
    public static King getObject(){
        if(k==null){                           // this will make my pattern thead safe 
            synchronized(King.class){
                if(k==null)
                  k = new King();
            }
        }
        return k;
    }
    // break 2
    //to prevent from it override readresolve method
    protected Object readResolve(){
        return k;
    }
    public Object clone() throws CloneNotSupportedException{
       // return super.clone();
       //break 3 return the same object
       return k;
    }
}

//break1
//to prevent from break 1 we can use enum
// enum King{
//     k;
// }
//either throw run time exception
/*
 * King(){
 * if(k!=null) throw RuntimeException("you are breaking singelton pattern")
 * }
 */
