import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.:");
        int n=sc.nextInt();
        for (int N=1;N<=n;N++){
            for (int i=1;i<=10;i++){
                System.out.println(N+"x"+i+"="+N*i);
            }
        }
        }
        // sc.close(); 

    }//for i from 1 to 10: print (n × i)
    // for N from 1 to n: for i from 1 to 10: print (N × i)