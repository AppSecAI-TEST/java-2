package function;
import java.util.Scanner;

public class DaeSeung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		int yes = 1;
		int cnt = 0;
		int total = 0;
		double avg = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.println("��                    ���� �Է�                                                      ��");
		System.out.println("����������������������������������������������������������������������������������������������");

		while(true)
		{
			System.out.println("\t����� ������ �Է��ϼ���.");
			do 
			{
				System.out.print("����:");
				grade = scan.nextInt();
				if(grade<0||grade>100)
					System.out.print("��ȿ���� ���� ���Դϴ�.0-100������ ���� �Է����ּ���.");
			}
			while(grade<0||grade>100);
			System.out.print("����� ������"+grade+"�� �Դϴ�.");
			total += grade;
			cnt++;
			do
			{
				if(yes>2||yes<=0)
					System.out.println("��ȿ���� ���� ���Դϴ�.1,2 ���� �Է����ּ���.");
				System.out.println("������ ��� �Է��Ͻðڽ��ϱ�? ��:1 �ƴϿ�:2");
				yes = scan.nextInt();
			}
			while(yes>2||yes<=0);
			if(yes == 2)
				break;
			
		}
		avg = total / (double)cnt;
		System.out.println("\t����� ������"+total+"�� �Դϴ�.");
		System.out.println("\t����� �����"+avg+"�� �Դϴ�.");
	}
}
