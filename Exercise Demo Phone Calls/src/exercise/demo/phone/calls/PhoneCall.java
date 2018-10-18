package exercise.demo.phone.calls;

public abstract class PhoneCall {

    String phoneNumber;
    double phonePrice;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.phonePrice = 0;
    }

    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public abstract String getPhoneNumber();

    public abstract double getPhonePrice();

    public abstract void informationAboutTheCall();

}
