package ch1;

public class VarFloatEx1{
    public static void main(String[] args) {
        float score1 = 90.4f;
        //소수점 형태 숫자는 무조건 double로 인식
        double score2 = 98.4d;

        System.out.println("이 자식의 점수는 " + score1 + "이다.");
        System.out.printf("이 자식의 진짜 점수는 %.1f 이다.\n", score2);
    }
}
