package test2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StudentServiceImpl impl = new StudentServiceImpl();
		
		int num, age;
		String name, phNum, addr;
		
		while(true) {
			
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("5. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
				case 1 : 
					
					StudentDTO dto = new StudentDTO();
					
					System.out.println("이름");
					name = input.next();
					System.out.println("나이");
					age = input.nextInt();
					System.out.println("전화번호");
					phNum = input.next();
					System.out.println("주소");
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
