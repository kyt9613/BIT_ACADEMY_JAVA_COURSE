public class WhileKeyExample
{
	public static void main(String[] args) throws Exception
	{
		boolean run = true;
		int speed = 0;
		int keyCode = 10;
		
		while (run)
		{
			if (keyCode!=10 && keyCode!=13)
			{
				System.out.println("------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("------------------");
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49)
			{
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			}
			else if (keyCode == 50)
			{
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			}
			else if (keyCode == 51)
				run = false;
		}
		
		System.out.println("���α׷� ����");
	}
}