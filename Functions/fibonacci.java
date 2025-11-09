import java.util.Scanner;

public class fibonacci{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("How many terms? ");
int n = scan.nextInt();
int a = 0, b = 1;
System.out.println(a + " " + b);
for(int i=2;i<n;i++){
int c = a+b;
System.out.print(c);
a=b;b=c;
}
}
}