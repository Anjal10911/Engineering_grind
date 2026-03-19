import java.util.Scanner;
public class CheckIfPrime {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.:");
        int n=sc.nextInt();
        boolean isprime=(n>1);//Key trick: i*i <= n is faster than i <= Math.sqrt(n). Why check up to √n? Because factors come in pairs — if 2×50=100, once you find 2, you know 50 too. Checking past √n is redundant!
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        System.out.println(isprime?"prime":"not a prime");



    }
} 
//       OR  boolean isPrime=true;
//         if (n<=1){
//             isPrime=false;
//         }   else {
//             for (int i=2;i*i<=n;i++){   // we can also use i<=Math.sqrt(n) but using i*i is more efficient as it avoids the overhead of calculating the square root.
//                 if (n%i==0){
//                     isPrime=false;
//                     break;
//                 }
//             }   


//     }      if (isPrime){
//             System.out.println("prime");
//         }
//         else{
//             System.out.println("not a prime");
//         }
//         sc.close();
//     } 
// }
    

// //A prime number has no divisors except 1 and itself. To check, try dividing from 2 up. If ANYTHING divides it evenly, it's NOT prime. But you only need to go up to √n — because if n has a factor bigger than √n, the other factor is smaller than √n and you'd have found it already!
// //Check divisors from 2 to √n if none divide evenly → PRIME √n = Math.sqrt(n) or i*i <= n