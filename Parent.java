/**
 * parent class implements Clonable interface
 */
public class Parent implements Cloneable{

    /**
     * defauld constructor
     */
    public Parent() {
        super();
    }


    /**
     * hashcode
     * @return integer
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * equals method
     * @param obj object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * clone method
     * @return super clone
     * @throws CloneNotSupportedException is exception
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * show information
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
