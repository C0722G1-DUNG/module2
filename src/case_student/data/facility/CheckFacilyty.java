package case_student.data.facility;

public class CheckFacilyty {
    public static  void checkAge(double age) throws facilytyException {
        if (age<30){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
    public static void checkCost(double cost) throws facilytyException {
        if (cost<0){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
    public static void checkMaxPeople(int maxPeople) throws facilytyException {
        if (maxPeople<0||maxPeople>20){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
    public static void checkServiceName(String serviceName) throws facilytyException {
        final String regex = "^([A-ZĐ][a-záàảãạăâẩắằấầặẵẫêậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]+)$";
        if (!serviceName.matches(regex)){
            throw new facilytyException("vui lòng nhập lại mã dịch vụ đang sai định dạng");
        }
    }
}
