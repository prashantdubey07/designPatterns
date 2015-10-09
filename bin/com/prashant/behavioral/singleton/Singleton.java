import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author prashant kumar dubey
 *
 */
public class Singleton implements Serializable,Cloneable
 {
	/**
	 * serial version UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @category Singleton Object
	 * volatile : changes done in object will be reflected to all the threads
	 */
	private static volatile Singleton singleton;

	/**
	 * Constructor
	 */
	private Singleton() {

	}

	public synchronized static Singleton getInstance() {
		//first check whether object is null or not
		if (singleton == null) {
			// if object is null then get lock on the object
			synchronized(singleton){
				//second check whether object is null or not
				if (singleton == null)
				{
					//if its still null then create new Object
					singleton = new Singleton();
				}
			}
		}
		// return singleton object
		return singleton;
	}
	@Override
	// class should not create object through cloning
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
	// class should not create object through serialisation
	private void writeObject(ObjectOutputStream out) throws IOException {
		//throw new IOException();
    }
	// class should not create object through serialisation
    private void readObject(ObjectInputStream in) throws IOException {
    	// new IOException();
    }

    //return same object if serialization has been done
    public Object readResolve() throws ObjectStreamException {
    	return singleton;
    }
    
    
    
}
