import java.util.Scanner;

public class AllprimestillN{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter limit: ");
int n = scan.nextInt();

for(int i=2;i<=n;i++){
boolean prime = true;
for(int j=2;j*j<=i;j++){
if(i%j==0){
prime = false;
break;
}
}
if(prime) System.out.print(i + " ");
}
scan.close();
}
}


OUTPUT:
Enter limit:
10
2 3 5 7
