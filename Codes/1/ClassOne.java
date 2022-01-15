import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Създаваме Scanner

        String aAsString = scanner.nextLine(); // Прочитеме текст
        int a = Integer.parseInt(aAsString); // превръщаме го в число

        String bAsString = scanner.nextLine();
        int b = Integer.parseInt(bAsString);

        System.out.println(a+b); // Отпечатваме сумата
        System.exit(a+b); // Използваме този ред вместо предишния ако качваме за проверяване
    }
}
