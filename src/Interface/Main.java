package Interface;

/*
 * @author: mohit5.kumar
 * @created: 18/03/19
 */
public class Main {

    public static void main(String[] args) {
        Test1 test1=new Test1(){
            public void display(){
                System.out.println("method to be called");
            }
        };
        test1.display();
    }
}
