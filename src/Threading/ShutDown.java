package Threading;

/*
 * @author: mohit5.kumar
 * @created: 27/04/19
 */
public class ShutDown {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            public void run()
            {
                System.out.println("Shutdown Hook is running !");
            }
        });
        System.out.println("Application Terminating ...");
    }
}
