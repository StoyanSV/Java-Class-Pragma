
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
        if (!s.subject.equals(groupSubject)) {
            System.out.println("This is not your specialty!");
            return;
        }
        if(freePlaces < 1){
            System.out.println("There's no free places!");
            return;
        }
        students[freePlaces-1] = s;
        freePlaces--;
//        if (s.subject.equals(groupSubject) && freePlaces > 0) {
//           students[freePlaces-1] = s;
//           freePlaces--;
//        }
    }

    void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    void theBestStudent(){
        Student maxScore = students[0];
        for(int i = 0; i < students.length; i++){
            if (students[i].grade > maxScore.grade)
        maxScore = students[i];
        }
        System.out.println("Student with highest score is: " + maxScore.name + " : " + maxScore.grade);

    }

    void printStudentsInGroup() {
            for(int i=0;i<students.length;i++){
                System.out.println("Student name is: " + students[i].name + ", Student grade is: " + students[i].grade + " , Student group is: " + students[i].subject);
            //for(Student student : students) {
                //System.out.println("Student name is: " + student.name + ", Student grade is: " + student.grade + " , Student group is: " + student.subject);

            }
    }

}

