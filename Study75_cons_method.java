package Study0426;

import java.util.Scanner;

public class Study75_cons_method 
{

	public static void main(String[] args) 
	{
		DW04266 dw = new DW04266();
	}
}

class DW04266
{
	Scanner sc = new Scanner(System.in);
	int age;
	String name;
	
	DW04266()
	{
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		while (true) 
		{
			
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("���� : ");
			cnt = sc.nextInt();
			
			if(cnt == 1)
			{
				input();
				System.out.println();
			}
			if(cnt == 2)
			{
				output();
				System.out.println();
			}
			if(cnt == 3)
			{
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.out.println();
				break;
			}
		}
	}
	
	void input()
	{
		System.out.print("����: ");
		age = sc.nextInt();
		System.out.print("�̸�: ");
		name = sc.next();	
	}
	
	void output()
	{
		System.out.println(age+ " / " +name);
	}
}
