import java.util.Scanner;

public class Daeseung2 {

	public static void main(String[] args) {
		int grade = 0;
		int total = 0;
		int yes = 0;
		int cnt = 0;
		double avg = 0;
		int menu;
		
		Scanner scan = new Scanner(System.in);
		IMOUT:
		
		while(true)
		{
			System.out.println("\t������������������������������");
			System.out.println("\t��     ���θ޴�        ��");
			System.out.println("\t������������������������������");
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.���� �� ���");
			System.out.println("\t3.����");
			System.out.print("\t����:");
			menu = scan.nextInt();
			
			IMPORT2:
				IMPORT3:
			switch(menu)
			{
			case 1:
				System.out.println("\t������������������������������");
				System.out.println("\t��     �����Է�        ��");
				System.out.println("\t������������������������������");
				while(true)
				{
				do
				{
				if(grade<0||grade>100)	
				System.out.println("\t�Է¹����� ������ϴ�. 0-100���̰��� �Է����ּ���.");
				System.out.print("\t������ �Է����ּ���.");
				grade = scan.nextInt();
				}
				while(grade<0||grade>100);
				System.out.println("\t����� ������"+grade+"�� �Դϴ�.");
				total += grade;
				cnt++;
				do
				{
				System.out.print("\t��� �Է��Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
				yes = scan.nextInt();
				if(yes>2||yes<=0)
				System.out.println("\t�Է¹����� ������ϴ�. 1,2���� �Է����ּ���.");
				switch(yes) {
				case 1:
					break;
					
				case 2:
					break IMPORT2;
				}
				
				}while(yes<=0||yes>2);
				
				}
				
			case 2:
				avg = total/cnt;
				System.out.println("\t������������������������������");
				System.out.println("\t��   ���� �� ���        ��");
				System.out.println("\t������������������������������");
				System.out.println("\t����� ������"+total+"�� �Դϴ�.");
				System.out.println("\t����� �����"+avg+"�� �Դϴ�.");
				
				do
				{
				System.out.print("\t����ȭ������ �����ðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
				yes = scan.nextInt();
				if(yes>2||yes<=0)
				System.out.println("\t�Է¹����� ������ϴ�. 1,2���� �Է����ּ���.");
				switch(yes) {
				case 1:
					break  IMPORT3;
					
				case 2:
					break;
				}
				
				}while(yes<=0||yes>2);
				
				
			
			case 3:
				break IMOUT;
			default :
				System.out.println("\t1,2,3�߿����� �������ּ���.");
	
			}	
		}
	}
}
