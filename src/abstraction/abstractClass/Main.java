package abstraction.abstractClass;

/*
 * @author: mohit5.kumar
 * @created: 06/04/19
 */
public class Main extends Car{
    @Override
    void stariring() {
        System.out.println("nice stairing");
    }

    @Override
    void wheel() {
        System.out.println("4 wheel");
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.stariring();
        main.wheel();
        main.seat();
    }
}
