import java.util.Scanner;
public class CountDigitsInaNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digits:");
        String n=sc.nextLine();
        int count=n.length();
        //int count=0;
        // while(n>0){
        //     n=n/10;
        //     count++;// int in java can only store upto 2,147,483,647 so we can use string or long instead for very large or large digits count
        System.out.println("no. of digits is:" + count);
        sc.close();
    }
    }
    

