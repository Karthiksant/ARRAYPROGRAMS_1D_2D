package array_1d_strings;

public class array_1d_strings
{
	public static String remdup(String str)
	{
		// program
		String name=str;
		int los=name.length();
		String res="";
		for(int j=0;j<los;j++)
		{
			char ch=name.charAt(j);
			if(!(res.contains(ch+"")))
			{
				res=res+ch;
			}		
		} return res;
	}
	public static String dict(String str)
	{
		String name=str;
		char [] ar=name.toCharArray();
		int loa=ar.length;
		for(int k=0;k<loa;k++)
		{
			for(int i=0;i<loa-1;i++)
			{
				char ch1=ar[i];
				char ch2=ar[i+1];
				if(ch1>ch2)
				{
					char temp=ch1;
					ar[i]=ch2;
					ar[i+1]=temp;
				}
				
			}
		}
		String res="";
		for(char i:ar)
		{ res=res+i;}
		return res;
		
	}
	public static void main(String[]args)
	{	//remove duplicate by contains 
		//arrange like dictionarywords
		String [] ar= {"karthik","kalyan","pavan"};	
		int loa=ar.length;
		for(int i=0;i<loa;i++)
		{
			String nme=ar[i];
			nme=remdup(nme);
			nme=dict(nme);
			ar[i]=nme;
		}
		for(String i:ar)
		{ System.out.print(" "+i);}
		
		System.out.println();		
	}
}
