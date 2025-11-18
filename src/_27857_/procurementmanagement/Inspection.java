package _27857_.procurementmanagement;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;

    public Inspection(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                      String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, String orderDate, double totalAmount,
                      String deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        if(inspectorName == null || inspectorName.isEmpty()) throw new IllegalArgumentException("Error: Inspector name required");
        if(status == null || (!status.equals("Passed") && !status.equals("Failed"))) throw new IllegalArgumentException("Error: Status must be Passed/Failed");
        this.inspectorName = inspectorName;
        this.status = status;
        this.remarks = remarks;
    }

    public String getInspectorName() { return inspectorName; }
    public void setInspectorName(String inspectorName) { if(inspectorName == null || inspectorName.isEmpty()) throw new IllegalArgumentException("Error: Inspector name required"); this.inspectorName = inspectorName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { if(status == null || (!status.equals("Passed") && !status.equals("Failed"))) throw new IllegalArgumentException("Error: Status must be Passed/Failed"); this.status = status; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}

