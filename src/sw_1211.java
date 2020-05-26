import java.util.*;

public class sw_1211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<11; i++) {
            int test_case = sc.nextInt();
            int ladderArray[][] = new int[100][100];
            int min=0, minlength=Integer.MAX_VALUE;

            for(int j=0;j<100;j++){//사다리 배열에 값 집어넣기
                for (int w=0;w<100;w++){
                    ladderArray[j][w] = sc.nextInt();
                }
            }

            for (int j=0;j<100;j++){//모든 출발점 돌기
                int length = 0;
                if (ladderArray[0][j] == 1) {//출발점이 사다리 시작이라면
                    int arrx = 0, arry = j;
                    while (arrx < 99) {//도착지에 도착하면 멈추도록
                        arrx++;//아래로 내려가기
                        length++;
                        if (arry+1 <= 99 && ladderArray[arrx][arry+1] == 1) {//아래로 내려가서 오른쪽으로 갈 경우
                            while( arry+1 <= 99 && ladderArray[arrx][arry+1]==1) {//오른쪽이 계속 1이라면 계속 감
                                arry++;
                                length++;
                            }
                        }
                        else if (arry-1 >= 0 && ladderArray[arrx][arry-1] == 1) {//아래로 내려가서 왼쪽으로 갈 경우
                            while(arry-1 >= 0 && ladderArray[arrx][arry-1] == 1){//왼쪽이 계속 1이라면 계속 감
                                arry--;
                                length++;
                            }
                        }

                    }//length 구해짐

                    if (length <= minlength) {//최소값이 변경됐을 경우
                        min = j;//최소 거리 출발점 변경
                        minlength = length;//최소 거리 변경

                    }
                }
            }

            System.out.println("#"+test_case+" "+ min);

        }
    }
}
