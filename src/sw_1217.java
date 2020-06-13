import java.util.*;

public class sw_1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T=1; T<11; T++) {
            int test_case = sc.nextInt();

            int first = sc.nextInt();
            int repeat = sc.nextInt();//반복 횟수
            int second = first;//곱해야하는 숫자
            int ans = func(first,second,repeat);

            System.out.println("#"+test_case+" "+ans);


        }
    }
    public static int func(int first, int second, int repeat){
        if (repeat==1){
            return second;
        }
        second *= first;
        repeat--;

        return func(first, second, repeat);

    }
}
