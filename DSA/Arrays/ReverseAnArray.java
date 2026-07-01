import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int left=0, right=arr.length-1;
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        while(left<=right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp; 
            left++;
            right--;
        } 
        System.out.println("Reversed array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
            sc.close(); 

    }

}
