import java.util.LinkedList;
import java.util.Queue;

public class Sort_gender {
    public static void main(String[] args) {
        Queue<Person> NU = new LinkedList<>();
        Queue<Person> NAM = new LinkedList<>();
        Person[] person = new Person[11];
        person[0] = new Person("Linh", "FeMale", "1997");
        person[1] = new Person("Minh", "FeMale", "1997");
        person[2] = new Person("Hiệp", "Male", "1997");
        person[3] = new Person("Hằng", "FeMale", "1997");
        person[4] = new Person("Dung", "FeMale", "1997");
        person[5] = new Person("Tiến", "Male", "1997");
        person[6] = new Person("Trang", "FeMale", "1997");
        person[7] = new Person("Quỳnh", "FeMale", "1997");
        person[8] = new Person("Vân", "FeMale", "1997");
        person[9] = new Person("Tú", "Male", "1997");
        person[10] = new Person("Linh", "FeMale", "1997");
        for (Person value : person) {
            if (value.getGender().equals("Male")) {
                NAM.add(value);
            }
            if (value.getGender().equals("FeMale")) {
                NU.add(value);
            }
        }
        while (!NU.isEmpty()) {
            Person nu = NU.remove();
            System.out.println(nu.getName() + ": " +
                    nu.getDateOfBirth() + ", " + nu.getGender());
        }
        while (!NAM.isEmpty()) {
            Person nam = NAM.remove();
            System.out.println(nam.getName() + ": "
                    + nam.getDateOfBirth() + ", " + nam.getGender());
        }
    }
}
