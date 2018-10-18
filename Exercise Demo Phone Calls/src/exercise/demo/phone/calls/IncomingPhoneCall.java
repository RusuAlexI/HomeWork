package exercise.demo.phone.calls;

public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        super.setPhonePrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPhonePrice() {
        return phonePrice;
    }

    public void informationAboutTheCall() {
        System.out.println("Phone number: " + getPhoneNumber()
                + ", rate: " + getPhonePrice() + " per  call.");
    }
}
