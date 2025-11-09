public class Sumnatural{
static int sumNnatural(int n){
int sum = 0;
for(int i=1;i<=n;i++){
sum = sum+i;
}
return sum;
}
public static void main(String[] args){
int ans = sumNnatural(10);
System.out.println(ans);
}
}