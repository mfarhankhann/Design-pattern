/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Composite.LabWork;

/**
 *
 * @author fa20-bse-069
 */
public class EmployeeController {

    public static void main(String[] args) {

        // Create employees
        Teacher teacher1 = new Teacher("John Doe", 20000, "PhD", "Permanent");
        Teacher teacher2 = new Teacher("Jane Doe", 18000, "Masters", "Contract");

        DOO doo = new DOO("David Smith", 25000, "Manager");

        HOD hod1 = new HOD("Alice Johnson", 30000, "Finance");
        HOD hod2 = new HOD("Bob Smith", 32000, "HR");

        Director director = new Director("Michael Brown", 40000);

        // Add subordinates
        director.addSubordinate(hod1);
        director.addSubordinate(hod2);

        hod1.addSubordinate(teacher1);
        hod1.addSubordinate(teacher2);

        hod2.addSubordinate(doo);

        // Generate organogram
        printOrganogram(director);

        // Activate bonus
        activateBonus("Performance", 10);

        // Print updated salaries
        System.out.println("\n--- Updated Salaries ---");
        printOrganogram(director);
    }

    private static void printOrganogram(IEmployee employee) {
        System.out.println(employee);
        if (employee instanceof HOD) {
            for (IEmployee subordinate : ((HOD) employee).getSubordinates()) {
                printOrganogram(subordinate);
            }
        }
    }

private static void activateBonus(String bonusType, int bonusPercentage) {
    activateBonus(bonusType, bonusPercentage, director);
}

private static void activateBonus(String bonusType, int bonusPercentage, IEmployee employee) {
    employee.giveBonus(bonusPercentage);
    System.out.println(employee.getClass().getSimpleName() + ": " + employee.getName() + " received a " + bonusType + " bonus of " + bonusPercentage + "%.");
    if (employee.getClass() == HOD.class) { // Use .getClass() instead of instanceOf to avoid cast
        for (IEmployee subordinate : ((HOD) employee).getSubordinates()) {
            activateBonus(bonusType, bonusPercentage, subordinate);
        }
    }
}

    }


