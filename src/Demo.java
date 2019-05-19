public class Demo {
    static int x = 11;
        private int y = 33;
        public void method1(int x)
        {

            Demo t = new Demo();
            this.x = 22;
            y = 44;

            System.out.println("Deno.x: " + Demo.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
            Demo t = new Demo();
            t.method1(5);
        }
}