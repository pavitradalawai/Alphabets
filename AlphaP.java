import java.util.*;

class AlphaP{

public static void main(String[] args){
int i=7;
int j=7;
int n=7;


for(i=0;i<=n;i++){
for(j=0;j<=5;j++){

if(j==0 || (j==4 && (i==1 || i==2)) ||(i==0 || i==3) &&(j>0 && j<4))
System.out.print("*");
	
else
System.out.print(" ");

}
System.out.println();
}
}
}