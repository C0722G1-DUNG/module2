package case_student.data.person;

public class CheckCustomer extends  CheckPerson {
    public static void checkAddress(String address) throws PersonException {
 final String regex = "^DC[0-9]+$";
 if (!address.matches(regex)){
     throw new PersonException("vui lòng nhập lại name đang sai định dạng"); }
    }
}
