package Study0426;

public class Study74_cons 
{

	public static void main(String[] args) 
	{
		Construct sc1 = new Construct();
		Construct sc2 = new Construct(22);
		Construct sc3 = new Construct(15,100.1);

	}

}

class Construct // Construct�� Ŭ������ �����ڸ��� �Ȱ���
{
		int age = 40;
		double weight =86.5;
		
	Construct()
	{
		System.out.println("���� ���� / ����: " +age+ " ������: " +weight);
	}
	Construct(int age)
	{
		System.out.println("���� ���� / ����: " +age+ " ������: " +weight);
	}
	Construct(int age,double weight)
	{
		System.out.println("���� ���� / ����: " +age+ " ������: " +weight);
	}
}
