//Array traversal: i from 0 to length-1
public class AllArrayElements {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");


        } 

    }
}// Simpler for-each:
// for(int x : arr) {
//     System.out.print(x + " ");
// }
//Remember: Arrays are 0-indexed. First element is arr[0], last is arr[arr.length-1]. Getting arr[arr.length] causes ArrayIndexOutOfBoundsException!