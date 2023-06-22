package array_2d_strings;

public class array_2d_all_prog
{
	public static void main(String[]args)
	{
		int [] [] ar= {{3,8,2},{9,1}}	;
		sortD_lt(ar[0]);
		disp(ar[0]);	
	}
		public static void disp2d(int [] ar)
		{	int loa=ar.length;
			for(int i=0;i<loa;i++)
			{
				for(int j:ar)
				{
					System.out.print(j+" ");
				}
		    }
		}
		public static void disp(int [] ar)
		{	int loa=ar.length;
				for(int j:ar)
				{
					System.out.print(j+" ");
				}
		}
		public static  void sortA_rt(int [] ar)
		{
			int loa=ar.length;
			for(int k=0;k<loa;k++)
			{
				for(int i=0;i<loa-1;i++)
				{ 
					if(ar[i]>ar[i+1])
					{ int temp=ar[i];
						ar[i]=ar[i+1];
						ar[i+1]=temp;
					}			
				}
			}
		}
		public static  void sortD_lt(int [] ar)
		{
			int loa=ar.length;
			for(int k=0;k<loa;k++)
			{
				for(int i=loa-1;i>0;i--)
				{ 
					if(ar[i]>ar[i-1])
					{ int temp=ar[i];
						ar[i]=ar[i-1];
						ar[i-1]=temp;
					}			
				}
			}
		}
}
