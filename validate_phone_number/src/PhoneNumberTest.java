import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberTest {
    public static void main(String[] args) {
        String[] strings = {"(84)-(0348310238)","(a8)-(22222222)"};
        String regex = "^\\(\\d{2}\\)-\\([0]\\d{9}\\)";
        Pattern  pattern = Pattern.compile(regex);
        for (String str: strings){
            Matcher matcher = pattern.matcher(str);
            boolean match = matcher.matches();
            System.out.println("Số điện thoại "+str+" là "+match);
        }
    }
}
