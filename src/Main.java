import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("N-2 school","Kyrgyzstan",LocalDate.of(1990,12,25));
        EducationCenter university = new Univerity("Manas","Kyrgyzstan",LocalDate.of(1994,10,13));
        EducationCenter college = new College("Ala-Too","Kyrgyzstan",LocalDate.of(1975,12,15));

        Student student1 = new Student("Yzaat","Kadyrkulov",'M', LocalDate.of(2005,12,8),2011,school);
        Student student2 = new Student("Beknazar","Joldoshbekov",'M', LocalDate.of(2005,5,1),2011,school);
        Student student3 = new Student("Eldos","Abasbekov",'M', LocalDate.of(2005,2,2),2011,school);
        Student student4 = new Student("Nursultan","Abdrasulov",'M', LocalDate.of(2005,2,3),2011,university);
        Student student5 = new Student("Maksat","Turusbekov",'M', LocalDate.of(2005,6,3),2011,university);
        Student student6 = new Student("Aidar","Myktybekov",'M', LocalDate.of(2005,2,4),2011,university);
        Student student7 = new Student("Adil","Abasbekov",'M', LocalDate.of(2005,8,4),2011,college);
        Student student8 = new Student("Sultan","Abdrasulov",'M', LocalDate.of(2005,2,3),2011,college);
        Student student9 = new Student("Nurkyz","Abasbekova",'J', LocalDate.of(2005,5,3),2011,college);
        Student student10 = new Student("Jaina","Mihridinova",'J', LocalDate.of(2005,6,2),2011,college);


       Student[] students ={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
       getAllStudents(students);


    }
    public static void getAllStudents(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }
}