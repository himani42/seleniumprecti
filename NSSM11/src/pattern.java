
public class pattern {
/*public  void paternIn()
{
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
			
		System.out.println();
	}
	
}*/
public  void paterndec()
{
for(int i=4;i>0;i--)	
{
	for(int j=1;j<=i;j++)
			{
	
		System.out.print(j);
	}
	System.out.println();
}
}

/*}public  void paternd()
{
for(int i=4;i>=4;i++)	
{
	for(int j=1;j<=i;j++)
			{
	
		System.out.print(i);
			}
	System.out.println();
}
}*/




public static void main(String[] args) {
	

pattern n=new pattern();
n.paterndec();
//System.out.println();
//n.paternd();
}
}
