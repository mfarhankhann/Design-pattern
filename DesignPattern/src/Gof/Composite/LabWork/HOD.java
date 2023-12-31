/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Composite.LabWork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-069
 */
class HOD extends BaseEmployee {
    private List<IEmployee> subordinates;
    private String departmentName;

    public HOD(String name, int salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(IEmployee employee) {
        subordinates.remove(employee);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "HOD: [Name: " + name + ", department: " + departmentName + "]" + "\nSubordinates: " + subordinates;
    }
}