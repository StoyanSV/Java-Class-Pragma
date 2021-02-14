public class Students extends Person{
    double score;

    Students(String name, int age, boolean isMan, double score){
        super(name, age, isMan);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                ", score=" + score +
                '}';
    }

    void showSudentInfo(){
        System.out.println(toString());
        //System.out.println(toString()+" Score: "+this.score);
    }
}
