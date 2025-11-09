import java.util.Scanner;

public class Palindrome{
static boolean isPalindrome(int n){
int original = n;
int reversed = 0;
while(n>0){
int digit = n%10;
reversed = reversed * 10 + digit;
n /= 10;
}
return original == reversed;
}

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
if(isPalindrome(n)) System.out.println(n +"is Palindrome");
else System.out.println(n +"is NOT Palindrome");
}
}