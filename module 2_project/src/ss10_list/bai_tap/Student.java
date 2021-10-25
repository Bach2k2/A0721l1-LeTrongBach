package ss10_list.bai_tap;

public class Student {
    private String name;
    private String classes;
    public Student(String name,String classes)
    {
        this.name=name;
        this.classes=classes;
    }
    public Student()
    {}
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
