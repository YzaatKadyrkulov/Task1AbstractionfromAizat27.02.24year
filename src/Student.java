import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private char gender;
    private LocalDate localDate;
    private int dateOfStart;
    private EducationCenter educationOnCenter;

    public Student(String name, String surName, char gender, LocalDate localDate, int dateOfStart, EducationCenter educationOnCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.localDate = localDate;
        this.dateOfStart = dateOfStart;
        this.educationOnCenter = educationOnCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", localDate=" + localDate +
                ", dateOfStart=" + dateOfStart +
                ", educationOnCenter=" + educationOnCenter +
                '}';
    }
}
