package Study0426;

import java.util.Scanner;

public class Study71_method_ifelse 
{

	public static void main(String[] args) 
	{
		Level level = new Level();
		level.levelcheck();
	}
}

class Level
{
	Scanner sc = new Scanner(System.in);
		
	int level = 70;
	int inputlv;
		
	void levelcheck()
	{
		System.out.print("���� �Է�:");
		inputlv = sc.nextInt();
		
		if(inputlv<level)
		{
			System.out.println("����Ұ����մϴ�.");
		}
		else
		{
			System.out.println("���尡���մϴ�.");
		}

	}

}
