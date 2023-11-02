package InterviewTricky;

import java.util.Arrays;
import java.util.Scanner;

public class shuffle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        
        String input = sc.nextLine();

      
        String[] inputValues = input.replaceAll("\"", "").split(" ");

        int n = Integer.parseInt(inputValues[0]);
        int k = Integer.parseInt(inputValues[1]);
        
        

        String[] arr = new String[n];

    
        for (int i = 2; i < inputValues.length; i++) {
            arr[i - 2] = inputValues[i];
        }
        System.out.println(Arrays.toString(arr));

        String[] arrtemp = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrtemp[i] = arr[i];
        }

        if (k >= 0) {
            for (int j = 0; j < k; j++) {
                for (int i = 0; i < arrtemp.length - 1; i++) {
                    arrtemp[i] = arrtemp[i + 1];
                }
            }

            for (int j = n - k; j < n; j++) {
                arrtemp[j] = arr[j - (n - k)];
            }
        }

        System.out.println(Arrays.toString(arrtemp));
    }
}