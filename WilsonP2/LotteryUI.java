import javax.swing.*;

public class LotteryUI {

    private Lottery lotto;
    //more variables

    private int response = JOptionPane.YES_OPTION;

    public LotteryUI(){
    }

    public LotteryUI(Lottery newLotto){
        lotto = newLotto;
    }

    public void run(){
        //program logic
        if(lotto.getNumGames()==0) {
            JOptionPane.showMessageDialog(null, "Jordan Wilson\nWilsonP2\nLottery with a Class", "WilsonP2", JOptionPane.PLAIN_MESSAGE);
        }
        int input;
        //open a do while
        do{
            //ask the user for input using JOP
            String sGuess;
            sGuess = JOptionPane.showInputDialog(null, "Enter your lottery pick (three digits): ", "Guess", JOptionPane.PLAIN_MESSAGE);
            lotto.setUserGuess(sGuess);

            JOptionPane.showMessageDialog(null, "The lottery number is " + lotto.getLottery(), "Lottery number", JOptionPane.INFORMATION_MESSAGE);

            //display results in a JOP
            //show lotto.getResult()
            JOptionPane.showMessageDialog(null, lotto.getResult(), "Results", JOptionPane.PLAIN_MESSAGE);

            //show JOP asks the user if they want to play again
            input = JOptionPane.showConfirmDialog(null, "Play again?", "Continue?", JOptionPane.YES_NO_OPTION);
        }while(input == 0);

        //display goodbye message with stats
        //games played
        //money won
        JOptionPane.showMessageDialog(null, "Games Played: " + lotto.getNumGames() +
                "\nWinnings: $" + lotto.getWinnings() + "\nThank you for playing! Good-Bye.", "WilsonP2", JOptionPane.PLAIN_MESSAGE);
    }
}