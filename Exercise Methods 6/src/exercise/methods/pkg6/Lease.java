
package exercise.methods.pkg6;


public class Lease {
    
    String tenantName;
    int apartmentNumber;
    float monthlyRentAmount;
    int termOfLease;
    
    public Lease(){
    this("XXX",0,1000,12);
    }

    public Lease(String tenantName, int apartmentNumber, float rentAmount, int termOfLease) {
        this.tenantName = tenantName;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRentAmount = rentAmount;
        this.termOfLease = termOfLease;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public float getRentAmount() {
        return monthlyRentAmount;
    }

    public void setRentAmount(float rentAmount) {
        this.monthlyRentAmount = rentAmount;
    }

    public int getTermOfLease() {
        return termOfLease;
    }

    public void setTermOfLease(int termOfLease) {
        this.termOfLease = termOfLease;
    }
    
    public void addPetFee(){
        monthlyRentAmount+=10;
        explainPetPolicy();
    
    }
    
    public void explainPetPolicy(){
        System.out.println("The pet fee is 10$ added to the rent amount.");

    }
}
