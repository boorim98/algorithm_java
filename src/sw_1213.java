import java.util.*;

public class sw_1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<11; i++) {
            int test_case = sc.nextInt();
            String find = sc.next();
            String sen = sc.next();

            int index = -1;
            int count = 0;
            while (true){
                if ((index = sen.indexOf(find,index+1)) == -1 ){//앞에서부터 찾다가 발견하면 찾는 위치를 그 다음으로 바꾸고 계속 찾는다.
                    break;
                }
                count++;
            }
            System.out.println("#"+test_case+" "+count);
        }

    }
}
