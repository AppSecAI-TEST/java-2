package function;
import java.io.IOException;
import java.util.Scanner;

	class Hello
		{
		 public static void main(String[] args) throws IOException
	    {
			int kor;
			int math;
			int eng;
			int total;
			double avg;
			
			Scanner scan  = new Scanner(System.in);

//			kor = 89;
//			math = 84;
//			eng = 92;
			//ctrl+shift+f = �ڵ� ����
			//alt+���Ʒ� = ���̵�
			//tap, shift+tap = �鿩����, �����
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.println("��                    ���� �Է�                                                      ��");
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.print("���� :");
			kor = scan.nextInt();
			System.out.print("���� :");
			eng = scan.nextInt();
			System.out.print("���� :");
			math = scan.nextInt();
			
			total = kor + math + eng;
			avg = total/3;
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.println("��                    ���� ���                                                      ��");
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %10d\n", eng);
			System.out.printf("���� : %-10d\n", math);
			System.out.printf("���� : %2$d %d %2$d\n", 1, 2); //2$�� 2��° ���ڸ� �������� �ʹٴ¶�
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.flush();
	    }	
		}
