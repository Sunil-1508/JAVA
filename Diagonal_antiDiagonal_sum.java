
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Diagonal_antiDiagonal_sum 
{ public static void main(String args[])throws Exception {
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader b= new BufferedReader(isr);
    int r,c,s=0,as=0,max;
    r=Integer.parseInt(b.readLine());
    c=Integer.parseInt(b.readLine());
	int a[][],x[][];
	a=new int[r][c];
	x=new int[r][c];
	System.out.print("Enter matrix  ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=Integer.parseInt(b.readLine());
		}
	}
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print(a[i][j]+"  ");
		}
		System.out.println("");
	}

	for(int i=0;i<r;i++) {
		max=a[0][i];
		for(int j=0;j<c;j++) {
			if(max<a[j][i]) max=a[j][i];
		}	
		System.out.println("max in column "+(i+1)+" is "+max);
	}
		
}
}



