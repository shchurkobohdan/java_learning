package n3.arrays;

public class ArrayTask8 {
    public static void main(String[] args) {
        int [] arr = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};
        int avg = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int k = 10; k <= 25; k++){
                if (arr[i] == k) {
                    sum += arr[i];
                    count++;
                    System.out.print(arr[i] + " ");
                }
            }
        }
        avg = sum / count;
        System.out.println(" = " + avg);
    }
}