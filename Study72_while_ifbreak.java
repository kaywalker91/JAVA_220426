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
			
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("���� : ");
			cnt = sc.nextInt();
			
			if(cnt == 1)
			{
				System.out.println("�ԷµǾ����ϴ�.");
			}
			if(cnt == 2)
			{
				System.out.println("��µǾ����ϴ�.");
			}
			if(cnt == 3)
			{
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
	
		}

	}

}
