package loop;

public class ForEx5 {
    public static void main(String[] args) {
        //3 배수 합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0)
                sum += i;
        }
        System.out.println("3의 배수의 합 : "+sum);
        //3 배수 합 9 배수 차
        sum = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0 && i % 9 != 0)
                sum += i;
            else if(i % 9 == 0)
            sum -= i;
        }
        System.out.println("3의 배수의 합에 9의 배수 차의 합 : "+sum);
        //3 배수와 5 배수의 합
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println("3와 5의 배수의 합 : "+sum);
    }
}
