/**
* 가위바위보에서
* Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
* 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
* 2이면 바위를 낸 것이고
* 3이면 보를 낸 것으로 할 때,
* 사용자측이 가위, 바위, 보를 냈을 때
* 승패를 결정하는 프로그램을 작성하시오
*/
import java.util.Scanner;
import java.util.Random;
class Rock{
public static void main(String[] args){
System.out.println("가위바위보 중 고르세요.");
Scanner scan = new Scanner(System.in);
Random ran = new Random();
int dice = 0;
dice = ran.nextInt(3)+1;
System.out.println(String.format("랜덤으로 나온값 %d", dice));
String dap = "";
if(dice==1){
dap = "바위";
}else if(dice==2){
dap = "보";
}else if(dice==3){
dap = "가위";
}
String same = "";
if(dice==1){
same = "가위";
} else if(dice==2){
same = "바위";
} else if(dice==3){
same = "보";
}
String wrong = "";
if(dice==1){
wrong = "보";
} else if(dice==2){
wrong = "가위";
} else if(dice==3){
wrong = "바위";
}
System.out.println("가위바위보 중 선택한 답 [ ]");
String answer = "";
answer = scan.next();
if(answer.equals(dap)){
System.out.println("이겼습니다.");
} else if (answer.equals(same)){
System.out.println("비겼습니다.");
}else if(answer.equals(wrong)){
System.out.println("졌습니다.");
}
}
}