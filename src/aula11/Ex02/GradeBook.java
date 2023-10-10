package aula11.Ex02;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private HashSet<Student> students = new HashSet<>();

    public GradeBook(){}


    public HashSet<Student> getStudents() {
        return this.students;
    }

    public void load(String fileName) throws IOException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(new FileReader(file));

        while (scanner.hasNext()){
            String[] line = scanner.nextLine().split("\\|");

            List<Double> grades = new ArrayList<Double>();

            grades.add(Double.parseDouble(line[1]));
            grades.add(Double.parseDouble(line[2]));
            grades.add(Double.parseDouble(line[3]));

            Student student = new Student(line[0], grades);
            getStudents().add(student);

        }
    }

    public void removeStudent(String name){
        for (Student student : students) {
            if (student.getName().equals(name)){
                students.remove(student);
                break;
            }
        }
    }

    public void addStudent(Student student){
        getStudents().add(student);
    }

    public Student getStudent(String name){
        for (Student student : students) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String name){
        List<Double> grades = new ArrayList<Double>();

        for (Student student : students) {
            if (student.getName().equals(name)){
                grades = student.getGrades();
            }
        }

        SimpleGradeCalculator calculator = new SimpleGradeCalculator();

        double averageGrade = calculator.calculate(grades);

        return averageGrade;
    }

    public void printAllStudents(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
