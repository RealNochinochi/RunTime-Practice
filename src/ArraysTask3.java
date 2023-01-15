public class ArraysTask3 {
    public static void main(String[] args) {


        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (nums.length / 2); i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = nums.length / 2; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i += 2) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative += 1;
            } else {
                positive += 1;
            }
            continue;
        }
        System.out.print("Отрицательные числа - " + negative + " ");
        System.out.print("Положительные числа -" + positive + " ");
        System.out.println();
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else {
                continue;
            }
        }
        System.out.print("Максимальное число - " + max);
        System.out.println();

        int num1 = 7;
        for (int i = 7; i < 100; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 1000; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println();
        int x = 10;
        int y = 100;
        for ( ; x < y; x += 20, y --);
        System.out.println("x равен " + x + " ; y равен " + y);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма - " + sum);
    }
}
