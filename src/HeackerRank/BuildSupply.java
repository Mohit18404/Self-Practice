package HeackerRank;

/*
 * @author: mohit5.kumar
 * @created: 15/03/19
 */
public class BuildSupply {
    int[] function(int[] array,int number,int position){
        int temp=array[position];
        array[position]=number;
        int next=0;
        for (int i=position+1;i<array.length;i++){
            next=array[i];
            array[i]=temp;
            temp=next;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array=new int[20];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=7;
        array[6]=8;
        BuildSupply buildSupply=new BuildSupply();
        int[] a=buildSupply.function(array,6,5);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]+" ");
    }
}
