public class Employee extends Person{
    double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary){
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "daySalary=" + daySalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }

    void  calculateOvertime(double hours){
        if(age >= 18){
            double perHour = daySalary/8;
            hours = hours*(perHour*1.5);
            System.out.println("Overtime payment:"+hours);
        }else{ System.out.println("Can't have overtime payment!");
        }
    }

    void showEmployeeInfo(){
        System.out.println(toString());
        //System.out.println(toString()+" Day Salary: "+this.daySalary);
    }
}
