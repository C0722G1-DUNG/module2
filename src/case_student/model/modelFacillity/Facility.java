package case_student.model.modelFacillity;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double area;
    private double cost;
    private int maxPeople;
    private String type;
    public Facility() {
    }
    public Facility(String serviceCode, String serviceName, double area, double cost, int maxPeople, String type) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.type = type;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", type='" + type + '\'' ;
    }
    public abstract String getInfo();
}
