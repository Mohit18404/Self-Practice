package HeackerRank;

public class Heack2 {
    public void test(){
        boolean b1=true;
        boolean b2=fix(b1);
        System.out.println(b1+" "+b2);
    }

    public boolean fix(boolean b1) {
        // TODO Auto-generated method stub
        b1=false;
        return b1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Heack2 B= new Heack2();
        B.test();
    }

}