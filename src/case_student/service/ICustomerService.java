package case_student.service;

import java.io.IOException;

public interface ICustomerService {
    void DisplayListCustomers() throws IOException;
    void AddNewCustomer() throws IOException;
    void EditCustomer() throws IOException;
}
