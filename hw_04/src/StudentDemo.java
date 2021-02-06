public class StudentDemo {
    public static void main(String[] args) {
        Student petar = new Student("Petar","History",29);
        Student jana = new Student("Jana", "Philosophy", 25);
        Student stoyan = new Student("Stoyan", "Math", 31);

        petar.grade = 3.5;
        petar.yearInCollege = 2;
        petar.money = 200;
        jana.grade = 4.5;
        jana.yearInCollege = 1;
        jana.money = 300;
        stoyan.grade = 5.0;
        stoyan.yearInCollege = 4;

        stoyan.upYear();
        petar.upYear();
        jana.upYear();

        stoyan.receiveScholarship(4.0, 100);
        System.out.println(stoyan.money);

        jana.receiveScholarship(4.0, 200);
        System.out.println(jana.money);




    }
}
