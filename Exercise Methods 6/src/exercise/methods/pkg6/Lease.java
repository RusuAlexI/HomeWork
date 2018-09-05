
package exercise.methods.pkg6;


public class Lease {
    
    private String tenantName;
    private int apartmentNumber;
    private float monthlyRentAmount;
    private int termOfLease;
    
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
    
    public static void explainPetPolicy(){
        System.out.println("The pet fee is 10$ added to the rent amount.");

    }

    @Override
    public String toString() {
        return "Lease{" + "tenantName=" + tenantName + ", apartmentNumber=" + apartmentNumber + ", monthlyRentAmount=" + monthlyRentAmount + ", termOfLease=" + termOfLease + '}';
    }
    
}
