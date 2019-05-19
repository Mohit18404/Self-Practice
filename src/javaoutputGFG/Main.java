package javaoutputGFG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * @author: mohit5.kumar
 * @created: 16/03/19
 */
class Writer
{
    public void write()
    {
        System.out.println("Writing...");
    }
}
class Author extends Writer
{
    public void write()
    {
        System.out.println("Writing book");
    }
}
class Main extends Author{
    /*public void write() {
        System.out.println("Writing code");
    }*/

    public static void main(String[] args)
    {
        Author a = new Main();
        a.write();
    }
}

