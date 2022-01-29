public class Main {
    public static void main(String[] args) {
        // Строка для сканирования, чтобы найти шаблон.
        String line = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple. +7-908-801-82-11, egor@mail.ru";
        Workflow workflow = new Workflow(line);
        workflow.findAllPatterns();
    }
}
