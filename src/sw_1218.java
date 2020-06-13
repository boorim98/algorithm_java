import java.util.*;

public class sw_1218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T=1; T<11; T++) {
            int length = sc.nextInt();
            Stack<Character> stack = new Stack();
            int pass = 0;

            String s = sc.next();
            for (int i = 0; i < length; i++){

                char bracket = s.charAt(i);//괄호 하나씩


                if (bracket == ')' && stack.peek() == '('){//스택에서 가장 위에 있는 것과 짝이 맞을 때
                    stack.pop();
                }
                else if (bracket == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if (bracket == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if (bracket == '>' && stack.peek() == '<'){
                    stack.pop();
                }
                else stack.push(bracket);//나머지는 스택에 푸시하기
            }

            if (stack.isEmpty()){//다 한 후에 스택이 비었을 경우 괄호들의 짝이 모두 맞다고 판단
                pass = 1;
            }
            else pass = 0;

            System.out.println("#"+T+" "+pass);


        }
    }
}
