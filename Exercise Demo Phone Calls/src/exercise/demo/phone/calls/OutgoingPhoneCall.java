package exercise.demo.phone.calls;

public class OutgoingPhoneCall extends PhoneCall {

    private double timeOfTheCallInMinutes;

    public OutgoingPhoneCall(double timeOfTheCallInMinutes, String phoneNumber) {
        super(phoneNumber);
        super.setPhonePrice(0.04);
        this.timeOfTheCallInMinutes = timeOfTheCallInMinutes;
    }

    public double getTimeOfTheCallInMinutes() {
        return timeOfTheCallInMinutes;
    }

    public void setTimeOfTheCallInMinutes(double timeOfTheCallInMinutes) {
        this.timeOfTheCallInMinutes = timeOfTheCallInMinutes;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public double getPhonePrice() {
        return phonePrice;
    }

    @Override
    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public void informationAboutTheCall() {
        System.out.println("Phone number: " + getPhoneNumber()
                + ", rate: " + getPhonePrice() + " per  call."
                + " Time of call in minutes: " + getTimeOfTheCallInMinutes());
    }

}
