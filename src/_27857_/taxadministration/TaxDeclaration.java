package _27857_.taxadministration;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;

    public TaxDeclaration(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                          String categoryName, double rate, String code, String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address,
                employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        if(declarationMonth == null || declarationMonth.isEmpty()) throw new IllegalArgumentException("Error: Declaration month required");
        if(totalIncome < 0) throw new IllegalArgumentException("Error: Total income must be ≥ 0");
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public String getDeclarationMonth() { return declarationMonth; }
    public void setDeclarationMonth(String declarationMonth) { if(declarationMonth == null || declarationMonth.isEmpty()) throw new IllegalArgumentException("Error: Declaration month required"); this.declarationMonth = declarationMonth; }

    public double getTotalIncome() { return totalIncome; }
    public void setTotalIncome(double totalIncome) { if(totalIncome < 0) throw new IllegalArgumentException("Error: Total income must be ≥ 0"); this.totalIncome = totalIncome; }
}

