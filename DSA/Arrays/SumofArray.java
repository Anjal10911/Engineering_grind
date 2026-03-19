public class SumofArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}//sum = 0; for each element: sum += element
//This accumulator pattern works for any aggregate: sum, product, count, min, max. Change += to *= for product!
//int sum = 0;
// for(int x : arr) {
//     sum += x;
// }
// System.out.println(sum);