package pkg1;

public class assig 
{
	public void assign(int a,int b)
	{
		int c=a+b;
		System.out.println("this program is just for testing purpose ="+c);
	}
	public int mul(int p,int q)
	{
		int f=p*q;
		System.out.println("multiply="+f);
		return f;
	}
	public static void main(String[] args) 
	{
		assig stu=new assig();
		stu.assign(2,3);
		stu.mul(2,4);
	}
}
