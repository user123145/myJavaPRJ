import java.util.Scanner;

public class Ex_BJ_220411_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {//중첩 for 문, 처음 for 문 의 층수 에서 별 개수를 다시 for문으로
            for (int k = 0; k < i; k++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}