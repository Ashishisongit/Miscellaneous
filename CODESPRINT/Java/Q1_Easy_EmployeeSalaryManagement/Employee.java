public class Employee {

    private String name;
    private int employeeId;
    private double basicSalary;
    private int performanceRating;
    private double bonus;
    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.performanceRating = 1;
    }

    public void setPerformanceRating(int rating) {
        this.performanceRating = rating;
        if (performanceRating == 1) {
                bonus = 0.0;
        }

        else if (performanceRating == 2) {
                bonus = 0.05;
        }
        else if (performanceRating == 3) {
                bonus = 0.1;
        }
        else if (performanceRating == 4) {
                bonus = 0.2;
        }
        else if (performanceRating == 5) {
                bonus = 0.25;
        }
        else if (performanceRating > 0) {
                performanceRating = 3;
                bonus = 0.1;
        }
        else if (performanceRating == 0) {
                performanceRating = 4;
                bonus = 0.2;
        }

    }

    public double calculateBonus() {
        return bonus * basicSalary;
    }

    public double calculateFinalSalary() {
        return bonus * basicSalary + basicSalary; 
    }

    public static void main(String[] args) {

        // Test Case 1
        Employee emp1 =
                new Employee("Rahul", 101, 50000);

        emp1.setPerformanceRating(4);

        System.out.println(
                "Bonus: " + emp1.calculateBonus()
        );

        System.out.println(
                "Final Salary: " + emp1.calculateFinalSalary()
        );

        // Test Case 2
        Employee emp2 =
                new Employee("Priya", 102, 40000);

        emp2.setPerformanceRating(5);

        System.out.println(
                "Bonus: " + emp2.calculateBonus()
        );

        System.out.println(
                "Final Salary: " + emp2.calculateFinalSalary()
        );

        // Test Case 3
        Employee emp3 =
                new Employee("Amit", 103, 60000);

        emp3.setPerformanceRating(2);

        System.out.println(
                "Bonus: " + emp3.calculateBonus()
        );

        System.out.println(
                "Final Salary: " + emp3.calculateFinalSalary()
        );
    }
}