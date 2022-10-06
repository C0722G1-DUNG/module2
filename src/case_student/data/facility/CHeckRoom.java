package case_student.data.facility;

public class CHeckRoom extends CheckFacilyty {
    public static void checkServiceCodeRoom(String serviceCode) throws facilytyException {
        final String regex = "^RO[0-9]{4}$";
        if (!serviceCode.matches(regex)){
            throw new facilytyException("vui lòng nhập lại sđt đang sai định dạng");
        }
    }
}
