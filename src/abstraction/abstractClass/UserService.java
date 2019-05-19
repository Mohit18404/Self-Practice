package abstraction.abstractClass;

/*
 * @author: mohit5.kumar
 * @created: 06/04/19
 */
interface UserService {
    void display();
    void show();
    static void sum(){
        System.out.println("static method");
    }
    default void differ(){
        System.out.println("default");
    }
}
