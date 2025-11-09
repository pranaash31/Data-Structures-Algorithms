import java.util.Scanner;

public class Maxmin{

static int findMax(int a, int b, int c){
if(a >= b && a>=c) return a;
else if(b>=a && b>=c) return b;
else return c;
}

static int findMin(int a, int b, int c){
if(a<=b && a<=c) return a;
else if(b<=a && b<=c) return b;
else return c;
}

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();
System.out.println("Maximum = " + findMax(x,y,z));
System.out.println("Minimum = " + findMin(x,y,z));
}
}

OUTPUT
12
34
56
Maximum = 56
Minimum = 12