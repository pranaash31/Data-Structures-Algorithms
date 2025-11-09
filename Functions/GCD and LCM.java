import java.util.Scanner;

public class GCDandLCM{

static int findGCD(int a, int b){
if(b==0) return a;
return findGCD(b, a%b);
}

static int findLCM(int a,int b){
return (a*b)/findGCD(a,b);
}
 
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int ans = findLCM(a,b)
System.out.println(ans);
}
}