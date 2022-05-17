package Study0426;

import java.util.Scanner;

public class Study78_cons_method_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt;
		
		System.out.print("반복 숫자 : ");
		cnt = sc.nextInt();
		
		Test hello = new Test(cnt);
	}
}

class Test
{
	Test(int cnt)
	{
		String temp = output(cnt);
		System.out.println(temp+" 변수 수신완료! 오늘 수업 끝!!!");
	}
	
	String output(int repeat)
	{
		for(int i=0; i<repeat; i++)
		{
			System.out.println("안녕");
		}	
	
	return "반복완료";
	}
}
