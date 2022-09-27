package bt_themMvc.until;

public class CheckScore {
    public  static void falseScore(double a) throws StudentException{
            if (a>10||a<0){
                throw new StudentException("nhập sai điểm định dạng vui lòng nhập lại");
            }
    }
}
