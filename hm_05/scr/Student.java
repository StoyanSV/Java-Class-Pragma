public class Student {
    String name;
    String subject;
    double  grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student(){
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, int age){
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    void upYear(){
        if (yearInCollege < 4) {
            yearInCollege++;
            System.out.println(name + " next year:" +yearInCollege);
        }else{
        isDegree = true;
        System.out.println("This is your last year");}

    }
    void receiveScholarship(double min, double amount){
        if (min <= grade && age < 30){
            money = money + amount;
        }
        return;
    }

}
