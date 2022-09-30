package bt_themMvc.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;
    void displayStudent() throws IOException;
    void remostudet();
    void searchStudent();
    void sortStudent();
}
