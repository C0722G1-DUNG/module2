package case_student.service;

import java.io.IOException;

public interface IfacilityService {
    void displayListFacility() throws IOException;
    void addNewHouse() throws IOException;
    void addNewRoom();
    void addNewVilla();
    void displayListFacilityMaintenance();
}