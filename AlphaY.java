import java.util.*;

class AlphaY{

public static void main(String[] args){
int i=6;
int j=6;
int n=6;


for(i=0;i<=n;i++){	
for(j=0;j<=n;j++){
	
if((j==3 && i>2)|| (i==j && j<3)|| 
(i==0 && j==6) || (i==1 && j==5) || (i==2 && j==4))
	
System.out.print("*");

else
System.out.print(" ");

}
System.out.println();
}
}
}