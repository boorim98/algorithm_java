import java.util.*;

public class sw_1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<11; i++) {
            int test_case = sc.nextInt();
            int ladderArray[][] = new int[100][100];
            int arrx=0;
            int arry=0;

            for(int j=0;j<100;j++){//사다리 배열에 값 집어넣기
                for (int w=0;w<100;w++){
                    ladderArray[j][w] = sc.nextInt();

                    if (ladderArray[j][w]==2){//도착지 찾기
                        arrx = j;
                        arry = w;

                    }
                }
            }

            while(arrx!=0){
                //if(arrx==0){
                //break;
                //}
                //else {
                if (arry-1>=0 && ladderArray[arrx][arry-1]==1){ //왼쪽 칸이 사다리일 경우
                    ladderArray[arrx][arry] = 0;
                    arry--;
                }
                else if (arry+1 <= 99 && ladderArray[arrx][arry+1] == 1 ){
                    ladderArray[arrx][arry] = 0;
                    arry++;
                }
                else if (ladderArray[arrx-1][arry] == 1){
                    ladderArray[arrx][arry] = 0;
                    arrx--;
                }
                //}
            }

            System.out.println("#"+test_case+" "+arry);





        }

    }
}
