import java.util.*;

public class sw_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<11; i++){
            int test_case = sc.nextInt();

            int intArray[][] = new int[100][100];
            int rowArray[] = new int[100];
            int colArray[] = new int[100];
            int left=0, right=0, rowmax=0, colmax=0, compare1, compare2, compare;

            for(int j=0;j<100;j++){//배열 안에 값 집어넣기
                for (int w=0;w<100;w++){
                    intArray[j][w] = sc.nextInt();
                    rowArray[j] += intArray[j][w];//각 행의 합 배열 안에 넣기
                }
                if (rowArray[j] >= rowmax){//행 중 최대값 찾기
                    rowmax = rowArray[j];
                }
            }
            for(int j=0;j<100;j++){//각 열의 합 배열 안에 넣기
                for (int w=0;w<100;w++){
                    colArray[j] += intArray[w][j];
                }
                if (colArray[j] >= colmax){//열 중 최대값 찾기
                    colmax = colArray[j];
                }
            }
            for(int j=0;j<100;j++){//대각선의 합 변수에 넣기
                left += intArray[j][j];
                right += intArray[j][100-j-1];
            }
            compare1 = left > right? left : right; //대각선 중 최대값 저장
            compare2 = rowmax > colmax? rowmax : colmax; //행과 열 중 최대값 저장
            compare = compare1 > compare2? compare1 : compare2; //모든 값 중 최대값 저장

            System.out.println("#"+test_case+" "+compare);

        }
    }
}
