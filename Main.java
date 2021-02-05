/**
 * Main class
 * throw clone not supported exception
 */
public class Main {
    /**
     * main method
     * @param args command line argument
     * @throws CloneNotSupportedException is exception
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * Singleton
         */
        Singleton singleton = Singleton.getInstance("singleton");
        Singleton singleton1 ;


        singleton1 = (Singleton) singleton.clone();
        singleton1.setName("singleton1");


        System.out.println(singleton);
        System.out.println(singleton1);


    }
}
