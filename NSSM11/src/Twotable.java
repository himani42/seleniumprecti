
public class Twotable {
	int n;
	int i=1;
	int r;
public  void calculation(int n)
{

	for(int i=1;i<=10;i++)
	{
		 r=n*i;
	
		System.out.println(r);
	}
}
public  void  calculationOne(int n)
{
	
	while(i<=10)
	{
		r=n*i;
		System.out.println(r);
		i++;
		}
	
			//System.out.println("hi print me");
}
public  void calculationThree(int n)
{
	System.out.println(i);
   
	do
	{
		
		r=n*i;
        i++;
		System.out.println("print my statemet"+r);
	
	}while(i<=10);
	
}

public static void main(String[] args) {
	Twotable n=new Twotable();
	
n.calculation(4);
System.out.println(n.i);
System.out.println();
n.calculationOne(5);
System.out.println(n.i);
System.out.println();
n.calculationThree(6);


}
}
