package study;

public class OmokProgram {

	public static void main(String[] args) {
		
		OmokConsole console = new OmokConsole();
		
		//�Ǹ����
		create();
		//���Է�
		console.input();
		//���Էµ� �����
		console.print();
}

	public static void create() {
		for(int x=0; x<20; x++) {
			for(int y=0; y<20; y++)
				System.out.print("��");
			System.out.println();

		}
		System.out.print("��ǥ�� �Է����ּ���(x , y):");
	}
}