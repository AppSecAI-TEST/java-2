package oop;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Exam() {
		this(1,1,1);
	}
	public Exam(int kor,int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);


		System.out.println("��������������������������������������������������������");
		System.out.println("��                                ���� �Է�                                    ��");
		System.out.println("��������������������������������������������������������");
		//		System.out.print("����:");


		
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
		}
	
	public void print() {
		System.out.println("��������������������������������������������������������");
		System.out.println("��                                 ���� ���                                   ��");
		System.out.println("��������������������������������������������������������");

			total = kor + eng + math;
			avg = total/3;

			System.out.println("\t����:"+kor);
			System.out.println("\t����:"+eng);
			System.out.println("\t����:"+math);
			System.out.println("\t����:"+total);
			System.out.println("\t���:"+avg);
			System.out.println("------------------------------------------");
		
	}

}