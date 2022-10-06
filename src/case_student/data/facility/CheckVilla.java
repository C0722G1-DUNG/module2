package case_student.data.facility;

public class CheckVilla extends CheckFacilyty {
    public static void checkServiceCodeVila(String serviceName) throws facilytyException {
        final String regex = "^(VL[0-9]{4})$";
        if (!serviceName.matches(regex)) {
            throw new facilytyException("vui lòng nhập lại sđt đang sai định dạng");
        }
    }

    public static void checkSwimmingArea(int swimmingArea) throws facilytyException {
        if (swimmingArea < 30) {
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }

    public static void checkFloorVilla(int floorVilla) throws facilytyException {
        if (floorVilla < 0) {
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }

    public static void checkRoomVilla(String roomVilla) throws facilytyException {
        final String regex = "^([A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+[ ])+[A-ZĐ][a-záàảãạăâẩắằấầặẵẫậéèẻẽẹếềểễệóòêỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+$";
        if (!roomVilla.matches(regex)) {
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
}
