package test2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StudentServiceImpl impl = new StudentServiceImpl();
		
		int num, age;
		String name, phNum, addr;
		
		while(true) {
			
			System.out.println("1. ���");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("5. ����");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
				case 1 : 
					
					StudentDTO dto = new StudentDTO();
					
					System.out.println("�̸�");
					name = input.next();
					System.out.println("����");
					age = input.nextInt();
					System.out.println("��ȭ��ȣ");
					phNum = input.next();
					System.out.println("�ּ�");
					addr = input.next();
					
					dto.setName(name);
					dto.setAge(age);
					dto.setPhNum(phNum);
					dto.setAddr(addr);
					
					impl.saveWorker(dto);
					
					break;
				case 2 : break;
				case 3 : break;
				case 4 : break;
				case 5 :
					System.exit(0);
					break;
			}
			
		}
		
		
	}
}
