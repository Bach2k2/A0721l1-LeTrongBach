package ss5_Acess_Modifier.bai_tap;

public class Student {
    private String name;
    private String classes;
    public Student()
    {
        name="John";
        classes="C02";
    }

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
class Main2
{
    public static void main(String[] args) {
        Student std1=new Student();
        Student std2=new Student();
        std1.setName("Le Trong Bach");
        std1.setClasses("A0721i1");
        std2.setName("Nguyen Trong Hoang");
        std2.setClasses("A0721i2");
        System.out.println(display(std1));
        System.out.println(display(std2));
    }
    public static String display(Student std)
    {
        return "Student name: "+ std.getName()+", class: "+std.getClasses();
    }
}
