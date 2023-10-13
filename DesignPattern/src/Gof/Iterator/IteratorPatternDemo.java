/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Iterator;

/**
 *
 * @author fa20-bse-069
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Student[] students = {
            new Student("001", "Muhammad Ali", "Male", "1234567890"),
            new Student("002", "John Doe", "Male", "9876543210"),
            // Add more students as needed
        };

        NameRepository nameRepository = new NameRepository(students);

        System.out.println("Students with name starting from 'Muhammad':");
        nameRepository.printStudentsWithNameStartingFrom("Muhammad");

        System.out.println("\nAll Students:");
        nameRepository.printAllStudents();
    }
}

