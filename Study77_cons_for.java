package Study0426;

public class Study77_cons_for 
{

	public static void main(String[] args) 
	{
		Contest1 a = new Contest1();
		Contest1 a2 = new Contest1("����");
	}
}

class Contest1
{
	Contest1()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("�����Ǿ ��̳׿�!");
		}		
	}
	
	Contest1(String name)
	{
		System.out.println("���� ������ �����Դ´�!");
	}
}