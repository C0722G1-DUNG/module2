package case_student.data.person;

public class CheckEmployee extends CheckPerson {
    public static  void checkWave(double wave) throws PersonException {
        if (!(wave>10.000&&wave<50.000)){
            throw new PersonException("vui lòng nhập lại name đang sai định dạng");
        }
    }
}
