import java.util.*;


public class sw_1208 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            int dump = sc.nextInt();
            int maxbox=0, minbox=0;


            int boxArray[] = new int[101];
            for (int j = 0; j< 100; j++){
                boxArray[j] = sc.nextInt();
            }
            while(dump>=0){
                int max = boxArray[maxbox], min = boxArray[minbox];
                for(int j=0; j<100; j++){
                    if(boxArray[j] > max){
                        maxbox = j;
                        max = boxArray[j];
                    }
                    if (boxArray[j] < min){
                        minbox = j;
                        min = boxArray[j];
                    }
                }
                if (boxArray[maxbox]- boxArray[minbox] == 0 || boxArray[maxbox]- boxArray[minbox] == 1){
                    break;
                }
                if (dump==0) break;
                boxArray[maxbox]--;
                boxArray[minbox]++;
                dump--;

            }
            System.out.println("#"+i+" "+(boxArray[maxbox] - boxArray[minbox]));

        }
    }
}
