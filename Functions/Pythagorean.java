import java.util.Scanner;

public class Pythagorean{
static Boolean isPythagorean(int a, int b, int c){
return (a*a+b*b == c*c) ||
       (a*a+c*c == b*b) ||
       (b*b+c*c == a*a);
}

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter three numbers: ");
int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
if(isPythagorean(x,y,z)) System.out.println("YES, its a Pythagorean triplet");
else System.out.println("NO");
}
} 

OUTPUT                            EXPLANATION: a^2 + b^2 = c^2
Enter three numbers:              3,4,5 => 3^2+4^2=5^2
3                                          9 + 16 = 25
4                                          25 = 25
5
YES, its a Pythagorean triplet