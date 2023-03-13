package service;

import java.io.IOException;

public interface StudentService {
	public void AddStudentRecords()throws NumberFormatException, IOException;
	public void UpdateStudentRecords()throws NumberFormatException, IOException;
	public void DeleteStudentRecords()throws NumberFormatException, IOException;
	public void ShowStudentRecords()throws NumberFormatException, IOException;

}
