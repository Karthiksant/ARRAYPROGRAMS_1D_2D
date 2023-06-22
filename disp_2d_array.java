package array_2d_strings;

public class disp_2d_array
{
	public static void main(String[]args)
	{
		int [] [] ar= {{8,2},{9,1}}	;
		for(int i=0;i<ar.length;i++)
		{
			for(int j:ar[i])
			{
				System.out.println(j+" ");
			}
		}			
	}
}
