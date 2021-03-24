public class MainP2 {

    public static void main(String[] args) {

        Lottery lotto = new Lottery();
        LotteryUI ui = new LotteryUI(lotto);
        ui.run();
        System.exit(0);

    }
}