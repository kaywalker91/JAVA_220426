package Study0426;

import java.util.Scanner;

public class Study72_while_ifbreak 
{

	public static void main(String[] args) 
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
				System.out.println("입력되었습니다.");
			}
			if(cnt == 2)
			{
				System.out.println("출력되었습니다.");
			}
			if(cnt == 3)
			{
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
	
		}

	}

}
