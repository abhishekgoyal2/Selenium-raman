package Arrayandother;

import java.awt.SystemTray;

public class twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row =4 ;
		int column=5;
		
		int table[][] =new int[row][column];
		
		table[0][0]=1;
		table[0][1]=2;
		table[0][2]=4;
		table[0][3]=5;
		table[0][4]=10;

		table[1][0]=15;
		table[1][1]=20;
		table[1][2]=40;
		table[1][3]=25;
		table[1][4]=30;
		
		table[2][0]=15;
		table[2][1]=20;
		table[2][2]=40;
		table[2][3]=25;
		table[2][4]=30;
		
		int tabsize =table.length;
		
		System.out.println(tabsize) ;
		
		for(int i=0;i<row;i++)
		{

			for(int j=0;j<row;j++)
			{
			System.out.println(table[i][j]) ;
			
			
	}
	
	}
	
	}
}
	

