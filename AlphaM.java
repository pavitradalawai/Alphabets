import java.util.Scanner;
class AlphaM {  
public static void main(String args[]){     
 int i,j,n=7;
 Scanner sc = new Scanner(System.in);
          System.out.println("enter the  number");
         
        int row = sc.nextInt();

for( i=0;i<=n;i++){    

for( j=0 ;j<=n;j++){  
  
if  (j == 0|| j == n ||(( i==j) && j>0&& j<4) ||(i==1 && j==5)||(i==2 && j==4))

System.out.print(i + "" + j + " ");

else 
System.out.print("   ");       
}    
System.out.println();
}    
}}  