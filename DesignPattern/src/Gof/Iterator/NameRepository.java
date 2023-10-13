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
public class NameRepository implements Container {
    private Student[] students;

    public NameRepository(Student[] students) {
        this.students = students;
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public Object previous() {
            if (this.hasPrevious()) {
                return students[--index];
            }
            return null;
        }

        @Override
        public void moveToLast() {
            index = students.length - 1;
        }

        @Override
        public void moveToFirst() {
            index = 0;
        }
    }

    public void printStudentsWithNameStartingFrom(String startingValue) {
        Iterator iterator = getIterator();
        iterator.moveToLast();

        while (iterator.hasPrevious()) {
            Student student = (Student) iterator.previous();
            if (student.getName().startsWith(startingValue)) {
                System.out.println(student);
            }
        }
    }

    public void printAllStudents() {
        Iterator iterator = getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

