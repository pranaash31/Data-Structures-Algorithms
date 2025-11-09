import java.util.Scanner;

public class Strongnumber{
static int factorial(int n){
int fact = 1;
for(int i=1;i<=n;i++) fact = fact*i;
return fact;
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
int n = scan.nextInt();
int sum = 0, temp = n;

while(temp>0){
int digit = temp % 10;
sum += factorial(digit);
temp /= 10;
}
if(sum == n) System.out.println(n + "is Strong number");
else System.out.println(n + "is NOT Strong numbertry ");
}
}


OUTPUT
Enter a number:       1! + 4! + 5! = 145
145
145is Strong








