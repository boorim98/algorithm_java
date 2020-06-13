import java.util.*;

public class sw_1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T=1; T<11; T++) {
            char abcArray[][] = new char[100][100];
            int test_case = sc.nextInt();
            int length=0;

            for (int i = 0; i < 100; i++){//배열에 알파벳들 넣기
                String s = sc.next();//한 줄을 string으로 받은 후
                for (int j = 0; j < 100; j++){
                    abcArray[i][j] = s.charAt(j);//한줄에 있는 char 하나하나 배열에 넣기
                }
            }

            for (int i = 1; i <= 100; i++){//회문 길이의 역할 회문 길이 최소 1부터 시작
                for (int j = 0; j < 100; j++){//행 100줄
                    for (int w = 0; w <= 100-i; w++){//시작점이 최소 회문 길이만큼 남기고 시작해야함
                        int temp = 1;
                        for (int r = 0; r < i/2; r++){
                            if (abcArray[j][w+r] != abcArray[j][i+w-r-1]){
                                temp = 0;
                            }
                        }
                        if (temp==1 && length<i) length = i;
                    }
                }
            }

            for (int i = 1; i <= 100; i++){
                for (int j = 0; j < 100; j++){
                    for (int w = 0; w <= 100-i; w++){
                        int temp = 1;
                        for (int r = 0; r < i/2; r++){
                            if (abcArray[w+r][j] != abcArray[i+w-r-1][j]){
                                temp = 0;
                            }
                        }
                        if (temp==1 && length<i) length = i;
                    }
                }
            }
            System.out.println("#"+T+" "+length);


        }
    }
}
