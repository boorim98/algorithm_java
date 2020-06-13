import java.util.*;

public class sw_1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T=1; T<11; T++) {

            char abcArray[][] = new char[8][8];

            int length = sc.nextInt();
            int pass = 0;

            for (int i = 0; i < 8; i++){//배열에 알파벳들 넣기
                String s = sc.next();//한 줄을 string으로 받은 후
                for (int j = 0; j < 8; j++){
                    abcArray[i][j] = s.charAt(j);//한줄에 있는 char 하나하나 배열에 넣기
                }
            }

            for (int i = 0; i < 8; i++){//행 8줄
                for (int j = 0; j < 8-length+1; j++){//시작점 인덱스, 시작점부터 최소 length만큼 남겨야함
                    int temp = 1;
                    for (int w = 0; w < length/2; w++){//회문 길이의 반 기준으로 대칭으로 같아야함
                        if (abcArray[i][j+w] != abcArray[i][j+length-w-1]){
                            temp = 0;//같지 않으면 회문이 아니므로 temp = 0으로 바꿈
                        }
                    }
                    if (temp == 1){
                        pass++;
                    }

                }
            }

            for (int i = 0; i < 8; i++){//열 8줄
                for (int j = 0; j < 8-length+1; j++){//시작점부터 최소 length만큼 남겨야함
                    int temp = 1;
                    for (int w = 0; w < length/2; w++){
                        if (abcArray[j+w][i] != abcArray[j+length-w-1][i]){
                            temp = 0;
                        }
                    }
                    if (temp == 1){
                        pass++;
                    }

                }
            }
            System.out.println("#"+T+" "+pass);

        }
    }
}
