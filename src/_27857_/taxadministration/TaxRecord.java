package _27857_.taxadministration;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                     String categoryName, double rate, String code, String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome, String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount, String receiptNo) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax,
                paymentDate, paymentAmount);
        if(receiptNo == null || receiptNo.isEmpty()) throw new IllegalArgumentException("Error: Receipt number required");
        this.receiptNo = receiptNo;
        this.totalTax = computeTax();
    }

    public String getReceiptNo() { return receiptNo; }
    public void setReceiptNo(String receiptNo) { if(receiptNo == null || receiptNo.isEmpty()) throw new IllegalArgumentException("Error: Receipt number required"); this.receiptNo = receiptNo; }

    public double getTotalTax() { return totalTax; }

    public double computeTax() {
        return getSalary() * getRate() - getPaymentAmount();
    }
}

