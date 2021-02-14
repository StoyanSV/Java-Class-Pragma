public class Person {
    String name;
    int age;
    boolean isMan;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    Person(String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = false;

    }
    void showPersonInfo(){
        System.out.println(toString());



    }

}
