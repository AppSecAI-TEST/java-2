package capsule;

import java.util.Scanner;

public class ExamProgram {

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
				Exam.inputExam(exams);
				break;
			case 2:
				Exam.printExam(exams);
				break;
			case 3:
				break EXIT;
			
			}
		}

	}

	public static int inputMenu() {
		int num;
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.println("��                    ���� �޴�                                                      ��");
		System.out.println("����������������������������������������������������������������������������������������������");
		
		System.out.print("\n1.�����Է�\n2.���� ���\n3.����\n\n���� >");
		num = scan.nextInt();
		return num;
	}
}