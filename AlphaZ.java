class Z{
public static void main(String[]args){
int i,j,n=6;
int p = 1;
int q = 4;
for(i=0; i<=n; i++){
for(j=0; j<=n; j++){
if(i==0 || i==n)
	System.out.print("*");
else if (i==p && j==q){
	System.out.print("*");
	p=p+1;
	q=q-1;
}
else
System.out.print("  ");
}
System.out.println();
}
}
}