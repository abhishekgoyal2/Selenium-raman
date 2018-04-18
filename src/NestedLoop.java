
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int k;
		int j;
		while(i<3)
		{
			for(j=0;j<4;j++)
			{
				k=0;
				do
				{
					System.out.println("i-------> " + i  +  "  j----> " + j +  "  k----> " +  k  );
					k++;
				}while(k<5);
			}
			
			i++ ;
		}
	}

}
