import java.util.Scanner;

public class HelloStudy {

	public static void main(String[] args)
	{
		int kor=0, eng=0, math=0;
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int total;
		double avg ;
		int menu;

		Scanner scan = new Scanner(System.in);

		IMOUT:
		while(true)
		{
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.println("��                    ���� �޴�                                                      ��");
			System.out.println("����������������������������������������������������������������������������������������������");
			System.out.println("\t1.���� �Է�");
			System.out.println("\t2.���� ���");
			System.out.println("\t3.����");
			System.out.print("\t���� > ");
			menu = scan.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("����������������������������������������������������������������������������������������������");
				System.out.println("��                    ���� �Է�                                                      ��");
				System.out.println("����������������������������������������������������������������������������������������������");
//				System.out.print("����:");
//				kor = scan.nextInt();
				
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
					
					kors[i] = kor;
					engs[i] = eng;
					maths[i] = math;
					         
				}
				
				
			case 2:
				
				System.out.println("����������������������������������������������������������������������������������������������");
				System.out.println("��                     ���� ���                                               ��");
				System.out.println("����������������������������������������������������������������������������������������������");
				
				for(int i=0; i<3; i++)
				{
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
					total = kor + eng + math;
					avg = total/3;
					
					System.out.println("\t����:"+kor);
					System.out.println("\t����:"+eng);
					System.out.println("\t����:"+math);
					System.out.println("\t����:"+total);
					System.out.println("\t���:"+avg);
					System.out.println("------------------------------------------");
				}
				break;
			//ctrl+i �鿩����
			case 3:
				break IMOUT;
			default:
				System.out.println("\t����1,2,3�� �ϳ��� �Է����ּ���.");
			}
		}		
	}
}