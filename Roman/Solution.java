// import java.util.Scanner;

class Solution {
    
    /*
    My name: Bao Tran
    Partner's Name: Rayna, 1918 (Discord Username)
     */

    public String intToRoman(int num) {
        StringBuilder value = new StringBuilder();

        final int[] NUM= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; 
        final String[] ROMAN= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < NUM.length && num > 0; i++) {
            while (num >= NUM[i]) {
                value.append(ROMAN[i]);
                num -= NUM[i];
            }
        }
        return value.toString();
    }

    /* 
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution.intToRoman(scanner.nextInt()));
        scanner.close();
    }
    */
}