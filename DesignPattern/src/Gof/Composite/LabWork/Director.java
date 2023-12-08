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
class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, int salary) {
        super(name, salary);
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

    @Override
    public String toString() {
        return "Director: [Name: " + name + ", subordinates: " + subordinates + "]";
    }
}
