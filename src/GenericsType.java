import java.lang.reflect.Type;

public class GenericsType<XZV> {
    private XZV t;

    public XZV get(){
        return this.t;
    }

    public void set(XZV t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10);
        System.out.println(type.get());//valid and autoboxing support
        System.out.println(type1.get());
        /*Students students=new Students("mohit","12346");
        GenericsType<Students> type2=new GenericsType();
        type2.set(students);
        System.out.println(type2.get().studentname);*/

    }
}
