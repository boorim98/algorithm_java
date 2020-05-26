import java.util.Scanner;

public class sw_1206 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            int length;
            int apart;
            int compareleft, compareright;
            int max;
            int success=0;

            length = sc.nextInt();

            int apartArray[] = new int[length];

            for(int j=0; j<length; j++){
                apart = sc.nextInt();
                apartArray[j] = apart;
            }

            for(int j=2; j<length-2; j++){
                compareleft = apartArray[j-2] > apartArray[j-1]? apartArray[j-2] : apartArray[j-1];
                compareright = apartArray[j+2] > apartArray[j+1]? apartArray[j+2] : apartArray[j+1];

                max = compareleft > compareright? compareleft : compareright;


                if(max < apartArray[j] ){
                    success += apartArray[j] - max;
                }
            }
            System.out.println("#"+(i+1)+" "+success);

        }
    }
}


