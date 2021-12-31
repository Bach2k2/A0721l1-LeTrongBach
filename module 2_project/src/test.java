import ss12_java_collection_framework.thuc_hanh.Student;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<Integer, Student> stdList = new LinkedHashMap<>();
        Student std = new Student("NVA", 20, "NHS");
        Student std1 = new Student("NVB", 21, "NHS");
        Student std2 = new Student("NVC", 22, "NHS");

        stdList.put(1, std);
        stdList.put(2, std1);
        stdList.put(3, std2);

        Set<Map.Entry<Integer, Student>> list = stdList.entrySet();
        for ( Map.Entry<Integer, Student> i: list) {
            System.out.println(stdList.get(i).toString());
        }
    }
}
