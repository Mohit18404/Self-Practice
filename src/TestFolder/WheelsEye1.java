package TestFolder;

/*
 * @author: mohit5.kumar
 * @created: 20/04/19
 */
public class WheelsEye1 {
    int method(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            int count1=0;
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                count1++;
                if(sum==0 && count<count1){
                    count=count1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        WheelsEye1 wheelsEye1=new WheelsEye1();
        int array[]={15,-2,2,-8,1,7,10,23};
        int i=wheelsEye1.method(array);
        System.out.println(i);
    }
}
