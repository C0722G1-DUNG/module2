package case_student.model.modelPerson;

public class Customer  extends Person {
 private String typeCustomer;
 private String Address;

    public Customer() {
    }
    public Customer(int id, String name, String birth, String gender, String CMND, String phone, String email, String typeCustomer, String address) {
        super(id, name, birth, gender, CMND, phone, email);
        this.typeCustomer = typeCustomer;
        Address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "typeCustomer='" + typeCustomer + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
    public String getINfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getBirth(),this.getGender(),this.getCMND(),this.getPhone(),this.getEmail(),this.getTypeCustomer(),this.getAddress());
    }
}
