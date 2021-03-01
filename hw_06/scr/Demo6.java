public class Demo6 {
    public static void main(String[] args) {
        Person[] array = new Person[10];

        Person andy = new Person("Andy", 30, true);
        Person marry = new Person("Marry", 24, false);

        Students john = new Students("John", 18, true, 4.5);
        Students annie = new Students("Annie", 17, false, 5.0);

        Employee mike = new Employee("Mike", 32, true, 100);
        Employee luke = new Employee("Luke", 17, true, 70);

        array[0] = andy;
        array[1] = marry;
        array[2] = john;
        array[3] = annie;
        array[4] = mike;
        array[5] = luke;



        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Students) {
                ((Students) array[i]).showSudentInfo();
                continue;
            }
            if (array[i] instanceof Employee){
                ((Employee) array[i]).showEmployeeInfo();
                continue;
            }
            if (array[i] instanceof Person) {
                array[i].showPersonInfo();



            }
        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] instanceof Students) {
//                ((Students) array[i]).showSudentInfo();
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] instanceof Employee) {
//                ((Employee) array[i]).showEmployeeInfo();
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] instanceof Employee){
                ((Employee) array[i]).calculateOvertime(2);
            }

        }
    }


}

