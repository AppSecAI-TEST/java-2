package structured.data;

import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {

		
		Omok[] omoks = new Omok[10];
		//int ox=0, oy=0;
		//Omok omok=null; ���� �Է��ϸ� �������ݾ�
		Omok omok = new Omok(); //��ü������ �ݵ�� new�� �Է��ؼ� ����
		printBoard();
		input(omok);
		printBoard(omok);
		
	}

	private static void printBoard(Omok omok) {
		int oy=omok.y;
		int ox=omok.x;
		
		for(int y=0; y<15; y++)
		{
			for(int x =0; x<20 ;x++)
				if(x==ox&&y==oy)
					System.out.print("��");
				else
					System.out.print("��");
			System.out.println();
	}
	}
	private static void input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y:");
		omok.x=scan.nextInt();
		omok.y=scan.nextInt();
		scan.close();
	}

	private static void printBoard() {
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++)
				System.out.print("��");
			System.out.println();
	}
	}
}
	
	