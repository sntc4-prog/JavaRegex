import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearcher implements Searcher {
    @Override
    public void findMobilePhone(String line) {
        Pattern r = Pattern.compile(PatternEnum.MOBILE_PHONE.getPattern());
        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println("Найден моб.телефон: " + m.group());
        } else {
            System.out.println("Не найден моб.телефон!");
        }
    }

    @Override
    public void findEmail(String line) {
        Pattern r = Pattern.compile(PatternEnum.EMAIL.getPattern());
        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println("Найдена эл. почта: " + m.group());
        } else {
            System.out.println("Не найдена эл. почта!");
        }
    }
}
