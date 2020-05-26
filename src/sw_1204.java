import java.util.Scanner;

public class sw_1204 {
    public static void main(String[] args){
        int scoreArray[] = new int[101];
        int test_num;
        int test_order;
        int score;

        Scanner sc = new Scanner(System.in);
        test_num = sc.nextInt();

        for (int i=0; i<test_num;i++){
            test_order = sc.nextInt();
            for (int j=0;j<1000;j++){
                score = sc.nextInt();
                scoreArray[score]++;
            }
            int max=0;
            int max_score=0;
            for (int w=0;w<101;w++){
                if(scoreArray[w]>=max_score) {
                    max_score = scoreArray[w];
                    max = w;
                }
            }

            System.out.println("#"+test_order+max);
        }

    }
}




