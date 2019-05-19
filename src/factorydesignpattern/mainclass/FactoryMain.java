package factorydesignpattern.mainclass;
import factorydesignpattern.com.OS;

import factorydesignpattern.com.OSfactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSfactory oSfactory=new OSfactory();
        OS os=oSfactory.getInstance("ios");
        os.spec();
    }
}
