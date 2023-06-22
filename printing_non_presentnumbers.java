package array_practise;

public class printing_non_presentnumbers 
{
	public static void main(String[]args)
	{	
		int [] ar= {4,5,99,6};
		int loa=ar.length;
		boolean b=true;
		for(int i=0;i<=20;i++)
		{
			for(int j=0;j<loa;j++)
			{ int elem=ar[j];
				if(elem==i) { b=false; break; }
				else { b=true; }				
			}	
			if(b) { System.out.println(i);}
		}
		System.out.println();
	}

}
