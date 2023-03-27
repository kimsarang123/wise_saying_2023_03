package wise;

import java.util.Scanner;

public class app {

    Scanner sc = new Scanner(System.in);

    public app(Scanner sc){
        this.sc = sc;
    }

    void run() {
        System.out.println("==명언 앱==");
        while (true){
            String command = sc.nextLine().trim();// trim == 공백 제거

            if(command.equals("종료")){//equals() = 대입이 안될때 사용하는것
                break;
            }
        }
    }

}
