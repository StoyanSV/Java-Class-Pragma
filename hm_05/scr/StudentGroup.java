public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s) {
        if (s.subject.equals(groupSubject) && freePlaces > 0) {
            students[students.length - 1] = s;
            freePlaces--;
        }
    }

    void emptyGroup() {
        new StudentGroup();
    }

    String theBestStudent(){

    }


}

