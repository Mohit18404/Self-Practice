package Collection;

import java.util.TreeSet;

/*
 * @author: mohit5.kumar
 * @created: 28/04/19
 */
public class Treeset
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Geeks");
        treeSet.add("for");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");

        for (String temp : treeSet)
            System.out.printf(temp + " ");

        System.out.println("\n");
    }
}