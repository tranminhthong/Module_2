import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameTest {
    public static void main(String[] args) {
        String[]str = {"C0318G","M0318G","P0323A"};
        String regex = "^[CAP][0-9]{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        for (String string: str){
            Matcher matcher = pattern.matcher(string);
            boolean match = matcher.matches();
            System.out.println("Tên lớp "+string+" là "+match);
        }

    }
}
