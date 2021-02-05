/**
 * class Singleton
 */
public class Singleton2{


    /**
     * private static Singleton variable reference
     */
    private static Singleton2 uniqueInstance;
    /**
     * name variable
     */
    private String name;

    /**
     * constructor
     * @param name is name variable
     */
    private Singleton2(String name){
        this.name=name;
    }

    /**
     *
     *  private static Singleton method
     *  create instance
     *  but only one object
     *  secounds call return first reference
     *  @param name is name variable
     *  @return Singleton reference
     *
     *
     * */
    public static  Singleton2 getInstance(String name){


        if(uniqueInstance==null){
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton2(name);
                }
            }
        }
        return uniqueInstance;
    }
    /**
     * get name variable
     * @return name is String
     */
    public String getName() {
        return name;
    }

    /**
     * update name variable
     * @param name is name variable
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * show information of class
     * @return String variable
     */
    @Override
    public String toString() {
        return this.name;
    }









}
