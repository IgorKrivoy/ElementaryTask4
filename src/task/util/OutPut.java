package task.util;

public class OutPut {

    public void fileExistErrorInfo() {
        System.out.println("Файла не существует!");
    }

    public void getInfoChoiceOfRepetitions() {
        System.out.println("Подсчет повторений...");
    }

    public void getInfoChoiceOfReplace() {
        System.out.println("Замена строки на строку...");
    }

    public void getRunInfo() {
        System.out.println("Введите путь к файлу в одном из форматов:" +
                "\n1. <путь к файлу> <строка для подсчёта>" +
                "\n2. <путь к файлу> <строка для поиска> <строка для замены>");
    }

    public void getAskForContinue() {
        System.out.println("Повторить процедуру ? Yes or Y: ");
    }

    public void getInfoOfMistakeInput() {
        System.out.println("Неправильный формат ввода !!");
    }

    public void printResultOfCount(int result) {
        System.out.println("Result of count: " + result);
    }

    public void printResultOfReplace() {
        System.out.println("Строка заменина!!!");
    }
}
