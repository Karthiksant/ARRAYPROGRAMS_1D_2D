package array_practise;

public class removing_dupllicates
{
	public static void sort(char [] ar1)
	{		
		char [] ar=ar1;
		for(char i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int loa=ar.length;
		for(int j=0;j<loa;j++ ) {
		for(int i=0;i<loa-1;i++ )
		{ char ch=ar[i],
			ch1=ar[i+1];
			if(ch>ch1)
			{ 
				char temp=ch;
				ar[i]=ch1;
				ar[i+1]=temp;			
			}			
		}						}
		for(char i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void remove_duplicate(char [] ar1)
	{		
		char [] ar=ar1;
		for(char i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int loa=ar.length;
		int c=0;
		for(int i=0;i<loa-1;i++ )
		{ char ch=ar[i],
			ch1=ar[i+1];
			if(!(ch==ch1))
			{ 
				c++;			
			}			
		}
		char [] new_ar=new char[c+1] ;
		int ins=0;
		char temp=ar[loa-1];
		for(int i=0;i<loa-1;i++ )
		{ char ch=ar[i],
			ch1=ar[i+1];
			if(!(ch==ch1))
			{ 
				new_ar[ins]=ar[i];
				ins++;
			}			
		}
		new_ar[ins]=temp;
		for(char i:new_ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[]args)
	{	String name="karthik";	
		char [] ar1=name.toCharArray();
			sort(ar1);
			remove_duplicate(ar1);
			
		System.out.println();
	}


}
