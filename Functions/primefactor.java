//Prime factor defn
//For example, the prime factors of 12 are: 2, 2, and 3 (since 12=2×2×3).

import java.util.Scanner;

public class primefactor{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter N: ");
int n = scan.nextInt();
int temp = n;

System.out.println("Prime Factors: ");
for(int i=2; i*i<=temp;i++){
while(n%i==0){
System.out.println(i);
n /= i;
}
}
if(n>1) System.out.println(n);
}
}


OUTPUT:
Enter N:
12
Prime Factors:
2
2
3