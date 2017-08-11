package study;

import java.util.Scanner;

public class GradeConsole {

	Grade exam = new Grade();

	static int menuCreate() {
		int num;

		System.out.println("┌─────────┐");
		System.out.println("│  ──메인메뉴──│");
		System.out.println("└─────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.print("선택>_");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		return num;

	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────┐");
		System.out.println("│  ──성적입력──│");
		System.out.println("└─────────┘");
		int kor=0;
		int eng=0;
		int math=0;

		do {
			if(kor<0||kor>100)
				System.out.println("0~100사이 값을 입력해주세요");
			System.out.print("국어:");
			kor = scan.nextInt();
		}
		while(kor<0||kor>100);

		do {
			if(eng<0||eng>100)
				System.out.println("0~100사이 값을 입력해주세요");
			System.out.print("영어:");
			eng = scan.nextInt();
		}
		while(eng<0||eng>100);

		do {
			if(math<0||math>100)
				System.out.println("0~100사이 값을 입력해주세요");
			System.out.print("수학:");
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

		System.out.println("┌─────────┐");
		System.out.println("│  ──성적출력──│");
		System.out.println("└─────────┘");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(avg);
	}
}
