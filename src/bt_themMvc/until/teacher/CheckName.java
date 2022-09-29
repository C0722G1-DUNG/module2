package bt_themMvc.until.teacher;

public class CheckName {
    public static void checkName(String str) throws TeacherException {
//        str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 32 || str.charAt(i) > 32 && str.charAt(i) < 65 || str.charAt(i) > 90 && str.charAt(i) < 97 || str.charAt(i) > 122) {
                throw new TeacherException("nhập sai định dạng,vui lòng nhập lại");
            }
            if (str.charAt(0) == 32&& str.isEmpty()==true ) {
                throw new TeacherException("tên nằm ngoài định dạng vui lòng nhập lại ");
            }
        }
    }
}
