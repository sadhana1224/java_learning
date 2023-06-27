package codekata;

import java.util.Scanner;
import java.util.Arrays;
class Strings123{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of numbers (N):");
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        StringBuilder largestNumber = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            largestNumber.append(numbers[i]);
        }

        System.out.println(largestNumber);
    }
}