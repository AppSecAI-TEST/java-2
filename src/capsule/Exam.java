package capsule;

import java.util.Scanner;

public class Exam {
	
	private int kor;
	private int eng;
	private int math;
	
	public static void printExam(Exam[] exams) {
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.println("��                     ���� ���                                               ��");
		System.out.println("����������������������������������������������������������������������������������������������");
		
		for(int i=0; i<3; i++)
		{
			kor = exams[i].kor;
			eng = exams[i].eng;
			math = exams[i].math;
			
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

	public static void inputExam(Exam[] exams) {
		int kor=0;
		int eng=0;
		int math=0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("����������������������������������������������������������������������������������������������");
		System.out.println("��                    ���� �Է�                                                      ��");
		System.out.println("����������������������������������������������������������������������������������������������");
//		System.out.print("����:");
		
	
		for(int i=0;i<3;i++) {
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
			
			exams[i].kor = kor;
			exams[i].eng = eng;
			exams[i].math = math;
		
		}
		
}
}
