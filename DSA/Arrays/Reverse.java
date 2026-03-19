public class Reverse {
    public static void main(String args[]){
        int N=12345;
        // int rev=0;
        while(N!=0){
           // int rem=N%10;gives the last digit of the number
           // rev=rev*10+rem; this will give the reverse of the number
        int digit=N%10;
            N=N/10;// this will remove the last digit of the number
            System.out.print(digit);
        }
        // System.out.println(rev);
    }
}
