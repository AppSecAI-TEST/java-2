package function;

import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		for(int i =0; i<3; i++) {
		exams[i] = new Exam();
		}
		
		
		int menu;
		
		//1.���θ޴�����
		EXIT:
		while(true)
		{
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break EXIT;
			}
		}
		//2.�����Է�
		//3.�������
	}
	
	
	public static void printExam(Exam[] exams) {
		int total;
		double avg;
		
		total = exams[i].kor + exams[i].math + exams[i].eng;
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

	public static void inputExam(Exam[] exams) {
		int kor;
		int math;
		int eng;
		
		
		Scanner scan  = new Scanner(System.in);

		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.println("��                    ���� �Է�                                                      ��");
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.print("���� :");
		kor = scan.nextInt();
		System.out.print("���� :");
		eng = scan.nextInt();
		System.out.print("���� :");
		math = scan.nextInt();
		
	}

	public static int inputMenu() {
		int num;
		
		return 0;
	}

}
