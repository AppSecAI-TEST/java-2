package study;

import java.util.Scanner;

public class GradeConsole {

	Grade exam = new Grade();

	static int menuCreate() {
		int num;

		System.out.println("����������������������");
		System.out.println("��  �������θ޴�������");
		System.out.println("����������������������");
		System.out.println("\t1.�����Է�");
		System.out.println("\t2.�������");
		System.out.println("\t3.����");
		System.out.print("����>_");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		return num;

	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������");
		System.out.println("��  ���������Է¦�����");
		System.out.println("����������������������");
		int kor=0;
		int eng=0;
		int math=0;

		do {
			if(kor<0||kor>100)
				System.out.println("0~100���� ���� �Է����ּ���");
			System.out.print("����:");
			kor = scan.nextInt();
		}
		while(kor<0||kor>100);

		do {
			if(eng<0||eng>100)
				System.out.println("0~100���� ���� �Է����ּ���");
			System.out.print("����:");
			eng = scan.nextInt();
		}
		while(eng<0||eng>100);

		do {
			if(math<0||math>100)
				System.out.println("0~100���� ���� �Է����ּ���");
			System.out.print("����:");
			math = scan.nextInt();
		}
		while(math<0||math>100);


		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void output() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();

		System.out.println("����������������������");
		System.out.println("��  ����������¦�����");
		System.out.println("����������������������");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(avg);
	}
}
