package test2;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {

	StudentDTO dto = new StudentDTO();
	
	ArrayList<StudentDTO> arr;
	
	public StudentServiceImpl() {
		arr = new ArrayList<StudentDTO>(); }
	
	@Override
	public void saveWorker(StudentDTO dto) { // 등록 
		
	}

	@Override
	public void delete(String phNum) { // 삭제
		
	}

	@Override
	public StudentDTO search(String name) { // 검색
	
		return null;
	}

	@Override
	public void output() { // 출력
	
	}

	
}
