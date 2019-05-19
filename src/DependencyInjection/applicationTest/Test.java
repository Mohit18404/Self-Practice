package DependencyInjection.applicationTest;

import DependencyInjection.testBean.MySpringBeanWithDependency;
import DependencyInjection.writer.NiceWriter;
import DependencyInjection.writer.Writer;

public class Test {
    private MySpringBeanWithDependency mySpringBeanWithDependency = MySpringBeanWithDependency.getInstance();

    public static void main(String[] args) {
        Test t=new Test();
        NiceWriter niceWriter=new NiceWriter();
        Writer writer=new Writer();
        t.mySpringBeanWithDependency.setWriter(niceWriter);
        t.mySpringBeanWithDependency.run();
        t.mySpringBeanWithDependency.setWriter(writer);
        t.mySpringBeanWithDependency.run();


    }
}
