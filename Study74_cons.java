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

class Construct // Construct은 클래스명 생성자명이 똑같다
{
		int age = 40;
		double weight =86.5;
		
	Construct()
	{
		System.out.println("나의 정보 / 나이: " +age+ " 몸무게: " +weight);
	}
	Construct(int age)
	{
		System.out.println("나의 정보 / 나이: " +age+ " 몸무게: " +weight);
	}
	Construct(int age,double weight)
	{
		System.out.println("나의 정보 / 나이: " +age+ " 몸무게: " +weight);
	}
}
