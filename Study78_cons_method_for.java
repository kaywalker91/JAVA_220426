package Study0426;

import java.util.Scanner;

public class Study78_cons_method_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt;
		
		System.out.print("�ݺ� ���� : ");
		cnt = sc.nextInt();
		
		Test hello = new Test(cnt);
	}
}

class Test
{
	Test(int cnt)
	{
		String temp = output(cnt);
		System.out.println(temp+" ���� ���ſϷ�! ���� ���� ��!!!");
	}
	
	String output(int repeat)
	{
		for(int i=0; i<repeat; i++)
		{
			System.out.println("�ȳ�");
		}	
	
	return "�ݺ��Ϸ�";
	}
}
