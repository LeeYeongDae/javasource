package ch1;
    //변수의 유효범위
public class ScopeEx1 {
    public static void main(String[] args) {

        int a = 100;
        {
            int x = 10;
            System.out.println("x= "+x);
            System.out.println("a= "+a);
        }
        //System.out.println(x);
    }
}
