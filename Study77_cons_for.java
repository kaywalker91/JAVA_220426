package Study0426;

public class Study77_cons_for 
{

	public static void main(String[] args) 
	{
		Contest1 a = new Contest1();
		Contest1 a2 = new Contest1("점심");
	}
}

class Contest1
{
	Contest1()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("생성되어서 즐겁네요!");
		}		
	}
	
	Contest1(String name)
	{
		System.out.println("오늘 점심은 자장면먹는다!");
	}
}