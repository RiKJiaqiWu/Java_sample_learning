import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //从控制台读取输入信息
        Scanner in = new Scanner(System.in);

        //游戏设置
        int rangeStart = 1;
        int rangeEnd = 8;
        int GuessTotal = 5;

        //游戏统计
        int totalGameCount = 0;
        int totalCorrectCount= 0;

        //结束游戏标识
        boolean stopGame = false;

        while(!stopGame) {
            //游戏变量初始化
            int guessLeft = GuessTotal;
            int mod = rangeEnd - rangeStart;
            double randNum = Math.random();
            int num = ((int) (randNum * rangeEnd * 100)) % mod;
            num += rangeStart;
            if (num <= rangeStart) {
                num = rangeStart + 1;
            }
            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }

            System.out.println("==========数字游戏==========");
            System.out.println("目标数字已经生成，数字在" + rangeStart + "到" + rangeEnd + "之间," +
                    "不包括这两个数。共有" + GuessTotal + "次猜测的机会。输入-1随时结束游戏");

            //本次游戏是否可以开始
            boolean gameStart = true;
            //本次是否猜中数字
            boolean guessCorrect = false;
            while (guessLeft > 0) {
                System.out.println("还有" + guessLeft + "次机会，请输入数字游戏，回车确认");
                int guessNum = in.nextInt();
                //输入-1,结束游戏
                if (guessNum == -1) {
                    stopGame = true;
                    break;
                }

                if (gameStart) {
                    totalGameCount++;
                    gameStart = false;
                }
                guessLeft--;
                if (guessNum == num) {
                    totalCorrectCount++;
                    guessCorrect = true;
                    System.out.println("恭喜你猜对了，本次随机数字为" + num + "。本次你一共猜了" + (GuessTotal - guessLeft) + "次");
                    break;
                } else if (guessNum > num) {
                    System.out.println("你所猜的数字比目标要大。");
                } else {
                    System.out.println("你所猜的数字比目标要小。");
                }
            }

            if (!guessCorrect) {
                System.out.println("本次目标数字为" + num + "。这次没有猜中。");
            }
        }
        System.out.println("共进行了" + totalGameCount + "次游戏，其中正确的是" + totalCorrectCount + "次");

    }
}
