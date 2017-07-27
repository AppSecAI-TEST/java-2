package oop.interf;

import java.util.Scanner;

import oop.interf.Exam;

public abstract class ExamConsole {

	private Exam exam = newExam();

	/*public ExamConsole(Exam exam) {
		this.exam= exam;
	}
	 */
	/*		public ExamConsole() {
		exam = new Exam();
	}
	 */

	/*public void setExam(Exam exam) {
		this.exam = exam;
	}
	 */

	public abstract Exam newExam();

	public void input() {

		int kor=0;
		int eng=0;
		int math=0;


		Scanner scan = new Scanner(System.in);

		System.out.println("��������������������������������������������������������");
		System.out.println("��                                ���� �Է�                             ��");
		System.out.println("��������������������������������������������������������");

		do
		{
			if(kor<0||kor>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
			kor = scan.nextInt();
		}    
		while(kor<0||kor>100);
		do
		{
			if(eng<0||eng>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
			eng = scan.nextInt();
		}    
		while(eng<0||eng>100);
		do
		{
			if(math<0||math>100)
				System.out.println("��ȿ���� ���� ���Դϴ�.0~100���� ���� �Է����ּ���.");
			System.out.print("����:");
			math = scan.nextInt();
		}    
		while(math<0||math>100);

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	//protected abstract void onInput(Exam exam);

	public void print() {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();

		System.out.println("��������������������������������������������������������");
		System.out.println("��                                 ���� ���                            ��");
		System.out.println("��������������������������������������������������������");
		System.out.println("\t����:"+kor);
		System.out.println("\t����:"+eng);
		System.out.println("\t����:"+math);
		System.out.println("\t����:"+total);
		System.out.println("\t���:"+avg);
		System.out.println("------------------------------------------");

	}

	protected abstract void onPrint(Exam exam);
	}




