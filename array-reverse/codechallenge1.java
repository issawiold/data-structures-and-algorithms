import java.util.Arrays;

public class codechallenge1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int[] mirrorarr1 = mirrormyarray(arr1);
        int arr2[] = {89, 2354, 3546, 23, 10, -923, 823, -12};
        int[] mirrorarr2 = mirrormyarray(arr2);
        int arr3[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        int[] mirrorarr3 = mirrormyarray(arr3);
        System.out.println("original" + Arrays.toString(arr1));
        System.out.println("reversed" + Arrays.toString(mirrorarr1));
        System.out.println("original" + Arrays.toString(arr2));
        System.out.println("reversed" + Arrays.toString(mirrorarr2));
        System.out.println("original" + Arrays.toString(arr3));
        System.out.println("reversed" + Arrays.toString(mirrorarr3));}

    public static int[] mirrormyarray(int[] arr) {
        int[] arrmirror = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arrmirror[j] = arr[i];
            j++;
           }

        return arrmirror;}





        
            }
