import java.util.Scanner;

public class task03 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число:");
            int x = scan.nextInt();
            System.out.println("Введите второе число:");
            int y = scan.nextInt();
            

            System.out.println("введите тип операции");
            System.out.println("+ для добавления");
            System.out.println("- fдля вычитания");
            System.out.println("/ для деления");
            System.out.println("* для умножения");
            System.out.println("x fдля выхода");
            char opType = scan.next().charAt(0);

            if (Character.toLowerCase(opType) == 'x') break;

            int result = switch (opType) {
                case '+' -> x + y;
                case '-' -> x - y;
                case '/' -> x / y;
                case '*' -> x * y;
                default -> 0;
            };

            System.out.println("решение:");
            System.out.printf("%d %c %d = %d", x, opType, y, result);
            System.out.println();
            
        }
    }
}