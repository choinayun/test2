package test2;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {

	StudentDTO dto = new StudentDTO();
	
	ArrayList<StudentDTO> arr;
	
	public StudentServiceImpl() {
		arr = new ArrayList<StudentDTO>(); }
	
	@Override
	public void saveWorker(StudentDTO dto) { // ��� 
		
	}

	@Override
	public void delete(String phNum) { // ����
		
	}

	@Override
	public StudentDTO search(String name) { // �˻�
	
		return null;
	}

	@Override
	public void output() { // ���
	
	}

	
}
