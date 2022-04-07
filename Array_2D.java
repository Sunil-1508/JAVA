import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Array_2D 
{ public static void main(String args[])throws Exception {
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader b= new BufferedReader(isr);
    int r,c;
    r=Integer.parseInt(b.readLine());
    c=Integer.parseInt(b.readLine());
	int a[][],x[][];
	a=new int[r][c];
	x=new int[r][c];
	System.out.print("Enter matrix one ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=Integer.parseInt(b.readLine());
		}
	}
	System.out.print("Enter matrix two ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			x[i][j]=Integer.parseInt(b.readLine());
		}
	}
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print((x[i][j]+a[i][j])+"  ");
		}
		System.out.println("");
	}
	
}
}


