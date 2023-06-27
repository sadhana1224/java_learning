package codekata; //String 110...here correct but codekata failed

import java.util.Scanner;

public class PrintPosiOfBinaryRep {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int a = s.nextInt();
        System.out.println("Enter the number2:");
        int b = s.nextInt();

        int res = a * b;

        String binaryRep = Integer.toBinaryString(res);

        int position = -1;
        for (int i = 0; i < binaryRep.length(); i++) {
            if (binaryRep.charAt(i) == '1') {
                position = i + 1;
                //break;
            }
        }

        System.out.println("Position of the first 1 from left to right: " + position);
    }

}
