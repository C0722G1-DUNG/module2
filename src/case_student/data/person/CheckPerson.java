package case_student.data.person;

import java.time.LocalDate;
import java.time.Period;

public class CheckPerson {
    public static void checkId(int id) throws PersonException {
        if (id > 10 || id < 1) {
            throw new PersonException("vui lòng nhập lại ID đang sai định dạng");
        }
    }

    public static void checkName(String name) throws PersonException {
        final String regex = "^([A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâẩắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
        if (!name.matches(regex)) {
            throw new PersonException("vui lòng nhập lại name đang sai định dạng");
        }
    }

    public static void checkPhone(String phone) throws PersonException {
        final String regex = "[0][0-9]{9}";
        if (!phone.matches(regex)) {
            throw new PersonException("vui lòng nhập lại sđt đang sai định dạng");
        }
    }

    public static void checkEmail(String email) throws PersonException {
        final String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+([.][A-Za-z0-9]+)$";
        if (!email.matches(regex)) {
            throw new PersonException("vui lòng nhập lại sđt đang sai định dạng");
        }
    }

    public static void checkCMND(String CMND) throws PersonException {
        final String regex = "^[0-9]{9}$";
        if (!CMND.matches(regex)) {
            throw new PersonException("vui lòng nhập lại sđt đang sai định dạng");
        }
    }

    public static void checkBirth(LocalDate birth) throws PersonException {
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(birth, localDate);
        boolean check=period.getYears()>=18&&period.getYears()<=100;
if (!check){
    throw new PersonException("vui lòng nhập lại sđt đang sai định dạng");
}
    }
}
