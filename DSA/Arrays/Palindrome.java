import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no.:");
        int N=sc.nextInt(); 
        int rev=0;//rev - will store the reversed number
        int temp=N;//temp - copy of the original number
        while (temp!=0){//Loop runs until the number becomes 0.
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if (rev==N){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}//Save original → reverse the number → compare original == reversed
