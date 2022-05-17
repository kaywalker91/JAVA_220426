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
			
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택 : ");
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
				System.out.println("프로그램이 종료되었습니다.");
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
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("이름: ");
		name = sc.next();	
	}
	
	void output()
	{
		System.out.println(age+ " / " +name);
	}
}
