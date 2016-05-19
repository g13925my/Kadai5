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
    	StringBuilder sb = new StringBuilder();
    		//public static String toEnglishNumber(String input) throws NumberFormatException {
    		final String[] eNum1 = {"zero", "one", "two", "three", "four",
    		"five", "six", "seven", "eight", "nine",
    		"ten", "eleven", "twelve", "thirteen", "fourteen",
    		"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    		 final String[] eNum2 = {"twenty", "thirty", "forty", "fifty", "sixty",
    		    		"seventy", "eighty", "ninety"};
    		/*if (n < 0 || n > 99) {
    		throw new NumberFormatException();
    		}*/
    		if (n < 20) {
    	    number = eNum1[n];
    		} 
    		else if(n <= 99  && n % 10 == 0) {
    		number = eNum2[n/10-2];
    		}else if(n%10 !=0){
    			String no2=eNum2[n/10-2];
    			String no1=eNum1[n%10];  
    			sb.append(no2);
    			sb.append(no1);
    			String a=sb.toString();
    			number = a;
    		}
    		else if(n==100){
    		 number = "onehundret";
    		}	
    			/*number = new StringBuffer(eNum2[input.charAt(0) - 50]);
    		}
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
