package factorydesignpattern.com;

public class OSfactory {
    public OS getInstance(String s)
    {
        if(s.equals("ios"))
            return new IOS();
        else if (s.equals("android"))
            return new Android();
        else
            return new Window();
    }
}
