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
		System.out.print("레벨 입력:");
		inputlv = sc.nextInt();
		
		if(inputlv<level)
		{
			System.out.println("입장불가능합니다.");
		}
		else
		{
			System.out.println("입장가능합니다.");
		}

	}

}
