// import java.util.Scanner;
public class Fibonacci {
    //Fibonacci is like a rabbit breeding problem. Start with 0 and 1. Each new number is the SUM of the two before it. 0, 1, 0+1=1, 1+1=2, 1+2=3, 2+3=5...
    //F(0)=0, F(1)=1 F(n) = F(n-1) + F(n-2)
    //Pattern: When each value depends on the previous values, keep 2-3 running variables instead of arrays. This is the foundation of dynamic programming!
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a no.:");
        // int n=sc.nextInt();
        int n=6;
        int a=0;//F(0)
        int b=1;//F(1)
        if (n==0){
            System.out.println(a);
        }
        else if (n==1){
            System.out.println(b);
        }
        else{
            for (int i=2;i<=n;i++){
                int c=a+b;//F(n) = F(n-1) + F(n-2)
                a=b;//F(n-2) = F(n-1)
                b=c;//F(n-1) = F(n)
            }
            System.out.println(b);
        }
        // sc.close();

    }
}
//And every next number is the sum of the previous two:
//F(0)=0, F(1)=1 
// F(n)=F(n−1)+F(n−2) for n≥2

// So the sequence looks like this:

// Index: 0  1  2  3  4  5  6  7 ...
// Value: 0  1  1  2  3  5  8 13 ...

// Explanation:

// Start: 0, 1

// Next: 0 + 1 = 1

// Next: 1 + 1 = 2

// Next: 1 + 2 = 3

// Next: 2 + 3 = 5

// Next: 3 + 5 = 8