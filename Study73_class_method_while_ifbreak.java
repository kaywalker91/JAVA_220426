package Study0426;

import java.util.Scanner;

public class Study73_class_method_while_ifbreak 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		DW0426 dw = new DW0426();
		
		while (true) 
		{
			
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("���� : ");
			cnt = sc.nextInt();
			
			if(cnt == 1)
			{
				dw.input();
				System.out.println();
			}
			if(cnt == 2)
			{
				dw.output();
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
}


class DW0426
{
	Scanner sc = new Scanner(System.in);
	int age;
	String name;
	
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
