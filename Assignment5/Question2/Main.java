public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};
        int sum = 0;
        int largest = arr[0];

        for (int value : arr) {
            sum += value;
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}