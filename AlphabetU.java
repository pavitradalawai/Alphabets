import java.util.*;
class AlphabetU{
public static void main(String[] args){
int i,j,n=8;
for(i=0;i<=n;i++){
for(j=0;j<=n;j++){
if((j==0||j==n/2) && i!=8 || (i==8 && (j>0 && j<n/2)))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}