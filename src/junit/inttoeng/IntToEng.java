package junit.inttoeng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {
 	
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String number = "";
    		//public static String toEnglishNumber(String input) throws NumberFormatException {
    		final String[] eNum1 = {"zero", "one", "two", "three", "four",
    		"five", "six", "seven", "eight", "nine",
    		"ten", "eleven", "twelve", "thirteen", "fourteen",
    		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    		 final String[] eNum2 = {"twenty", "thirty", "forty", "fifty", "sixty",
    		    		"seventy", "eighty", "ninety"};
    		if (n < 0 || n > 99) {
    		throw new NumberFormatException();
    		}
    		if (n < 20) {
    	    number = eNum1[n];
    		} else if(n <= 99 && n >= 20 && n % 10 == 0) {
    		number = eNum2[n/10-2];
    		if(n%10 !=0){
    			number= eNum2[n/10-2]+eNum1[n%10-1];	
    		}
    		}
    		/*number = new StringBuffer(eNum2[input.charAt(0) - 50]);
    		if (input.charAt(1) != '0') {
    		number.append("-").append(eNum1[input.charAt(1) - 48]);
    		}
    		}
    		return number.toString();
    		}
    		}*/
        return number;
    }
}
