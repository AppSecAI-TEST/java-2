package structured.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamWork {

	public static void main(String[] args) throws IOException {


		double i=0, ar[] = new double[20];        
		double total = 0;
		double avg = 0;

		FileInputStream in = new FileInputStream("res/data.txt");//���Ͻ�Ʈ�� ����.(���� ������.) 
		Scanner sc = new Scanner(in); //Scanner ����.(���Ͽ��� ���� �б�����) 
		while (sc.hasNext()) { //���� ���� ������ ��� �ݺ� 
			ar[(int) i] = sc.nextDouble(); //���� �о ar �迭�� ������. 
			i++; 
		} 
		in.close();  // ���Ͻ�Ʈ�� ����.
		sc.close();
		for(i=0; i<ar.length; i++){  //�迭�� ����Ȱ� ��� 
			total +=ar[(int)i];       
			System.out.println(ar[(int) i]+" ");} 
			System.out.println(total);
		avg = total/ar.length;
		System.out.printf("��� : %6.2f\n", avg);



	}
}
