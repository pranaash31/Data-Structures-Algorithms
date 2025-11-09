import java.util.Scanner;

public class Primebtwtwonum{
static Boolean isPrime(int n){
if(n<=1) return false;
for(int i=2; i*i <= n;i++){
if(n%i==0) return false;
}
return true;
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter two numbers (Start end):");
int low = scan.nextInt(), high = scan.nextInt();

System.out.println("Primes: ");
for(int i=low; i<= high; i++){
if (isPrime(i)) System.out.print(i + " ");
}

}
}

OUTPUT
Enter two numbers (Start end):
2
50
Primes:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47