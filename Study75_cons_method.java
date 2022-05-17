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
			
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택 : ");
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
				System.out.println("프로그램이 종료되었습니다.");
				System.out.println();
				break;
			}
		}
	}
	
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
