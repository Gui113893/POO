package aula11.Ex02;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator{

    public SimpleGradeCalculator(){}

    public double calculate(List<Double> grades){
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }

        double averageGrade = sum / grades.size();

        return averageGrade;
    }
}
