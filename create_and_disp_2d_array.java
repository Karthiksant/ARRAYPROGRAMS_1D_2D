package array_2d_strings;
// copy of 2d array pending
public class create_and_disp_2d_array 
{
	public static void main(String[]args)
	{
		int [] [] ar= {{1,2},{2,3}}	;
		
		int loa=ar.length;
		for(int i=0;i<loa;i++)
		{ int losa=ar[i].length;
		int [] [] n=new int [loa][losa];
			for(int j=0;j<losa;j++)
			{
				n[i][j]=ar[i][j];
				System.out.println(n[i][j]);
			}	
		}
	}
}
