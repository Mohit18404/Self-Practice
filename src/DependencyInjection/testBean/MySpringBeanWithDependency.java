package DependencyInjection.testBean;

import DependencyInjection.writer.IWriter;

public class MySpringBeanWithDependency {

    private IWriter writer;

    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void run() {
        String s = "This is my test";
        writer.writer(s);
        }
        static MySpringBeanWithDependency mySpringBeanWithDependency=null;
    private MySpringBeanWithDependency(){
    }
    public synchronized static MySpringBeanWithDependency getInstance(){
        if(mySpringBeanWithDependency == null)
            mySpringBeanWithDependency=new MySpringBeanWithDependency();
        return mySpringBeanWithDependency;
    }
}

