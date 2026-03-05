import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sixe of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter array values: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum=" + sum);

        System.out.println("Reversed:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        int max = 0, smax = 0;

        if (arr[0] < arr[1]) {
            max = arr[1];
            smax = arr[0];
        } else {
            max = arr[0];
            smax = arr[1];

        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > max) {
                smax=max;
                max = arr[i];

            } else if (arr[i] > smax) {
                smax = arr[i];
            }

        }

        System.out.println("Max: " + max);
        System.out.println("second Max: " + smax);

    

    int arr1[]={1,2,3,4};
    int arr2[]={5,6,7,8};

    int length=arr1.length+arr2.length;
    

    }
    
}