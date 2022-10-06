package case_student.data.facility;

public class CheckHouse extends CheckFacilyty {
    public static void checkServiceCodeHouse(String serviceCode) throws facilytyException {
        final String regex = "^HO[0-9]{4}$";
        if (!serviceCode.matches(regex)){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
    public static void checkFloorHouse(int floorHouse) throws facilytyException {
        if (floorHouse<0){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
    public static void checkRoomHouse(String roomHouse) throws facilytyException {
        final String regex = "^([A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâẩắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
        if (!roomHouse.matches(regex)) {
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
}
