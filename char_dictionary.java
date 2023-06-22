package array_practise;

public class char_dictionary 
{
	public static void main(String[]args)
	{		
		String name="karthik";
		char [] ar=name.toCharArray();
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

}
