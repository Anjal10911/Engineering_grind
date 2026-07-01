import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        // int[] arr={10, 5, 8, 12, 15};
        for(int x:arr){
            if(x>first){
                second=first;
                first=x;
            } else if(x>second && x!=first){
                second=x;
            } 
        } 
        System.out.println(second);

    }
}
