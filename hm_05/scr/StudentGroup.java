
public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s) {
        if (s.subject.equals(groupSubject) && freePlaces > 0) {
            students[freePlaces-1] = s;
            freePlaces--;
        }
    }

    void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    void printStudentsInGroup() {
            //for(int i=0;i<students.length;i++){
            for(Student student : students) {
                System.out.println("Student name is: " + student.name + ", Student grade is: " + student.grade + " , Student group is: " + student.subject);
                //System.out.println("Student name is: " + students[i].name + ", Student grade is: " + students[i].grade + " , Student group is: " + students[i].subject);
            }
    }



}

