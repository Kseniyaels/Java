import java.util.Scanner;

public class task01 {
    private static Scanner scan = new Scanner(System.in);

    public static void getCube(int[] ca){
        System.out.println("Введите номер:");
        System.out.printf("куб этого числа это %d", ca[scan.nextInt()-1]);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("создание массива кубов...");
        int[] cubeArr = new int[1000];
        for (int i = 0; i < cubeArr.length; i++) {
            cubeArr[i] = (i+1) * (i+1) * (i+1);
        }
        System.out.println("массив готов");

        getCube(cubeArr);
        getCube(cubeArr);
    }
}