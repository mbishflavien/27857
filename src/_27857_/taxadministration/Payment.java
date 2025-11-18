package _27857_.taxadministration;

public class Payment extends TaxAssessment {
    private String paymentDate;
    private double paymentAmount;

    public Payment(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                   String categoryName, double rate, String code, String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome, String assessmentDate, double assessedTax,
                   String paymentDate, double paymentAmount) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);
        if(paymentDate == null || paymentDate.isEmpty()) throw new IllegalArgumentException("Error: Payment date required");
        if(paymentAmount <= 0) throw new IllegalArgumentException("Error: Payment amount must be > 0");
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { if(paymentDate == null || paymentDate.isEmpty()) throw new IllegalArgumentException("Error: Payment date required"); this.paymentDate = paymentDate; }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) { if(paymentAmount <= 0) throw new IllegalArgumentException("Error: Payment amount must be > 0"); this.paymentAmount = paymentAmount; }
}

