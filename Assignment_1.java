import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){



    }

    public static void printHelloWorld() {

        System.out.println("Hello World");
    }

    public static void multiTable12(){
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int left = 0;
        int right = input.length() - 1;
        while (left < right){
            if(input.charAt(left) != input.charAt(right)){
                System.out.println("\"" + input + "\"" + " is NOT a palindrome");
                return false;
            }
            left++;
            right--;
        }
        System.out.println("\"" + input + "\"" + " is a palindrome");
        return true;
    }

    public static void merge(ArrayList a, ArrayList b) {
        // ArrayList<String> a = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        // ArrayList<String> b = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        int c1 = 0, c2 = 0;
        ArrayList<String> res = new ArrayList<String>();

        while(c1 < a.size() || c2 < b.size()) {
            if(c1 < a.size())
                res.add((String) a.get(c1++));
            if(c2 < b.size())
                res.add((String) b.get(c2++));
        }
        System.out.println(res);
    }

    public static void fibs100(){
        BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(0), c = BigInteger.valueOf(1);
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= 100; i++) {
            a = b;
            b = c;
            c = a.add(b);
            System.out.print(a+" ");
        }
    }

    public static void isLeapYear(int year) {
        if (year % 4 != 0) {
            System.out.println(year + " is NOT a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a leap year");
        } else {
            System.out.println(year + " is a leap year");
        }
    }


}
