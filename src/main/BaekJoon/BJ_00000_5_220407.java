import java.util.Scanner;
public class BJ_00000_5_220407 {
    public static void main(String[] args) {
        //입력된 값 a 까지 1에서 부터 순차적으로 합산.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = 0;//b = 합계

        for (int i = 1; i <= a; i++) {//i 에서 입력받은 a 값 까지
            b += i;//문제해결 , 숫자 시작이 잘못됨.
            System.out.printf("%d = b값, %d = i 값\n", b, i);//확인용
        }
        System.out.printf("%d", b);
    }
}
