public class Fibonacci{
    public static void main(String[] args){

    }
    public static int fibonumber1(int n){
         if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int[] arr= new int [n]
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1]
    }
     public static int fibonumber2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonumber2(n - 1) + fibonumber2(n - 2);
        }
    }
}