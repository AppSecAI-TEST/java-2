package study;

import java.util.Scanner;

public class GradeProgram {

	public static void main(String[] args) {

		GradeConsole console = new GradeConsole();
		
		//�����Է�
		//�������
		//����
		int menu;
		
		EXIT:
		while(true) {
			menu = inputmenu();
			switch(menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.output();
				break;
			case 3:
				break EXIT;
			}
		}
	}

	private static int inputmenu() {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n1.�����Է� \n2.������� \n3.����");
		num = scan.nextInt();
		return num;
	}

}
