package hogwarts.school2.model;

public class Faculty {
    private Long id;
    private String name;
    private String color;

    public Faculty(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setId(long id){
        this.id = id;
    }
}
