import java.util.ArrayList;

public class Student {
    ArrayList<Integer> grades;
    private String name;
    private long id;

    public Student(long id, String name){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public long getId(){
        return this.id;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }


}
