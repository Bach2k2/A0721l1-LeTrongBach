package ss10_list.bai_tap;

public class StudentSS10 {
    private String name;
    private String classes;
    public StudentSS10(String name, String classes)
    {
        this.name=name;
        this.classes=classes;
    }
    public StudentSS10()
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
