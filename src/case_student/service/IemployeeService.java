package case_student.service;

import java.io.IOException;

public interface IemployeeService {
    void DisplayListEmployees() throws IOException;
    void AddNewEmployee() throws IOException;
    void  EditEmployee() throws IOException;

}
