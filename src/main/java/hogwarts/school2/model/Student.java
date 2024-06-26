package hogwarts.school2.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;

    public Student() {
    }

    public Student(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setId(long id){
        this.id = id;
    }
}

