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
class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, int salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher: [Name: " + name + ", qualification: " + qualification + ", status: " + status + ", salary: " + salary + "]";
    }
}
