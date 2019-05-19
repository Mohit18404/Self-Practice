package abstraction.abstractClass;

/*
 * @author: mohit5.kumar
 * @created: 06/04/19
 */
public class UserServiceImpl implements UserService{
    @Override
    public void display() {
        System.out.println("display");
    }
    @Override
    public void show() {
        System.out.println("show");
    }
}
