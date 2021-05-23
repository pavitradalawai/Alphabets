import java.util.Scanner;

class AlphaT{

public static void main(String [] a){

Scanner s=new Scanner(System.in);

System.out.println("Enter the number of rows");

int row=s.nextInt();

int M=row/2;

for(int i=0; i<row; i++){
for(int j=0; j<row; j++){

if(i==0 || j==M){
System.out.print("* ");
}else
System.out.print("  ");
}
System.out.println();
}
}
}