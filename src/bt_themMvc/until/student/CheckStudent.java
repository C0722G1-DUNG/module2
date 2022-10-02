package bt_themMvc.until.student;

import bt_themMvc.until.teacher.TeacherException;

public class CheckStudent {
    public  static void falseScore(double a) throws StudentException {
            if (a>10||a<0){
                throw new StudentException("nhập sai điểm định dạng vui lòng nhập lại");
            }
    }
        public static void checkNameStudent(String str) throws StudentException {
        Boolean regex =str.matches("([A-Z][a-z]+[ ])+([A-z][a-z]+)") ;
//        cach 1


//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) < 32 || str.charAt(i) > 32 && str.charAt(i) < 65 || str.charAt(i) > 90 && str.charAt(i) < 97 || str.charAt(i) > 122) {
//                throw new TeacherException("nhập sai định dạng,vui lòng nhập lại");
//            }
//            if (str.charAt(0) == 32 ) {
//                throw new TeacherException("tên nằm ngoài định dạng vui lòng nhập lại ");
//            }
//        }


//        cah2
        if (!regex){
            throw  new StudentException("nhập sai định dạng vui lòng nhập lại");
        }

    }
    public  static  void CheckBirthStudent(int a) throws StudentException {
        if (a>30||a<1){
            throw  new StudentException("nhập sai ngày sinh vui lòng nhập lại");
        }
    }
}
