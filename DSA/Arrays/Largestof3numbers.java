import java.util.Scanner;
public class Largestof3numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(a, Math.max(b,c));
        System.out.print("largest of 3 numbers is: "+max);


    }
}
//i can also use if-else statements to find the largest of 3 numbers but using Math.max is more efficient and cleaner.