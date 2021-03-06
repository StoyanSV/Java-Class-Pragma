public class CollageDemo {
    public static void main(String[] args) {
        Student bobo = new Student("Bob", "History", 17);
        //bobo.grade = 4;
        Student ben = new Student("Ben", "History", 18);
        ben.grade = 5.5;
        Student bil = new Student("Bil", "History", 19);
        bil.grade = 6;
        Student fil = new Student("Fil", "History", 17);
        fil.grade = 2;
        Student john = new Student("John", "History", 17);
        john.grade = 3.5;
        Student marry = new Student("Marry", "History", 17);
        marry.grade = 5;
        Student andy = new Student("Andy","Math",20);

        StudentGroup history = new StudentGroup("History");
        System.out.println(history.freePlaces);
        history.addStudent(bobo);
        history.addStudent(ben);
        history.addStudent(bil);
        history.addStudent(fil);
        history.addStudent(john);
        history.addStudent(marry);
        history.addStudent(andy);
        System.out.println("Remaining places: " + history.freePlaces);
        history.printStudentsInGroup();

        history.theBestStudent();
        history.emptyGroup();
        System.out.println("Remaining places after emptyGroup: " + history.freePlaces);


//        history.printStudentsInGroup();
//        history.emptyGroup();
//        System.out.println(history.freePlaces);

//
//        System.out.println();
//        StudentGroup sports = new StudentGroup("Sports");
//        Student gogo = new Student("Gogo", "Sports", 17);
//        gogo.grade = 3;
//        Student ivan = new Student("Ivan", "Sports", 18);
//        ivan.grade = 2;
//        Student pesho = new Student("Pesho", "Sports", 19);
//        pesho.grade = 6;
//        Student stoyan = new Student("Stoyan", "Sports", 19);
//        pesho.grade = 5;
//        Student sevo = new Student("Sevo", "Sports", 19);
//        pesho.grade = 4;
//        sports.addStudent(gogo);
//        sports.addStudent(ivan);
//        sports.addStudent(pesho);
//        sports.addStudent(stoyan);
//        sports.addStudent(sevo);
//        sports.printStudentsInGroup();
    }
}
