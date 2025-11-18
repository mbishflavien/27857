### Object-Oriented Management Systems

A collection of six fully implemented OOP systems designed to demonstrate inheritance, encapsulation, validation, and real-world modeling in Java.
Each system follows a strict 10-class inheritance hierarchy, includes input handling (Scanner), and provides a final class with a computation/report method.

Repository Structure
OOP-Management-Systems/
│
├── StockManagementSystem/
│   └── src/stockmanagement/
├── FlightBookingSystem/
│   └── src/flightbooking/
├── TaxAdministrationSystem/
│   └── src/taxadministration/
├── ProcurementManagementSystem/
│   └── src/procurement/
├── AttendanceManagementSystem/
│   └── src/attendance/
└── PayrollManagementSystem/
    └── src/payroll/


Each system includes:

-10 Java classes (one per file)
-Validations in constructors & setters
-A final class implementing a report or calculation method
-A runnable Main.java using Scanner

## 1. Stock Management System
Class Flow:

Entity → Warehouse → Category → Supplier → Product → StockItem → Purchase → Sale → Inventory → StockReport (final)

Key Features:

Tracks stock, suppliers, categories, purchases & sales
Validates emails, codes, prices, quantities
Final report summarizes inventory & sales totals

## 2. Flight Booking System
Class Flow:

Entity → Airport → Airline → Flight → Pilot → CabinCrew → Passenger → Booking → Payment → Ticket (final)

Key Features:

Validates flight numbers, airport codes, emails, passenger data
Booking + payment handled via Scanner
Final Ticket calculates fare with taxes/discounts

## 3. Tax Administration System
Class Flow:

Entity → TaxAuthority → TaxCategory → Taxpayer → Employer → Employee → TaxDeclaration → TaxAssessment → Payment → TaxRecord (final)

Key Features:
Valid TINs, tax rates, emails
Income & assessment validation
Final tax record computes payable tax (rate × salary − payments)

## 4. Procurement Management System
Class Flow:

Entity → Organization → Department → Supplier → Product → PurchaseOrder → Delivery → Inspection → Invoice → ProcurementReport (final)

Key Features:
Validates TINs, prices, quantities, codes
Order, delivery, inspection, invoice process
Final report sums all invoice amounts

## 5. Attendance Management System
Class Flow:

Entity → Institution → Department → Course → Instructor → Student → ClassSession → AttendanceRecord → LeaveRequest → AttendanceSummary (final)

Key Features:
Tracks classes, attendance, and leave requests
Validates emails, session data, student info
Final summary calculates attendance percentage

## 6. Payroll Management System (RSSB)
Class Flow:

Entity → Organization → Department → Employee → PayrollPeriod → SalaryStructure → Deduction → Allowance → Payroll → Payslip (final)

Key Features:
RSSB rules: 8-digit number, 5% contribution, etc.
Validations for salary, allowances, loan deductions
Final Payslip computes:
Gross salary
Total deductions
Net salary
RSSB + PAYE


## Learning Outcomes

Across all systems, students learn:

✔ Inheritance across large class chains
✔ Encapsulation using private fields
✔ Data validation using exceptions
✔ Java constructors with checks
✔ User input with Scanner
✔ Final class method (report / calculation)
✔ Organized multi-package Java project structure

## Contributing

Feel free to:

-Fork the repo
-Add more systems
-Improve validations
-Implement persistence (files/DB)

## License

This project is provided for academic and learning purposes.
