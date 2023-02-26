import java.util.concurrent.TimeUnit;
public class StopWatch {
/**
 * going to display the time on the screen
 * @author Bella, Mike, Jordan, Daniel
 */
 public StopWatch() {
    
    }

    /**
     * This is going to count down for the 30 second timer
     */
    public void countDownThirtySec() {
        for(int i=29;i>=0;i--) {
            try {
                clearScreen();
                System.out.println("00:"+timeNotation(i));
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }

    /**
     * This is going to count down for the one minute timer
     */
    public void countDownOneMin() {
        for(int i=59;i>=0;i--) {
            try {
                clearScreen();
                System.out.println("00:"+timeNotation(i));
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }

    /**
     * This is going to count down for the five minute timer
     */
    public void countDownFiveMin() {
        for(int i = 4; i>=0; i--) {
            for(int j=59;j>=0;j--) {
                try {
                    clearScreen();
                    System.out.println("0"+i+":"+timeNotation(j));
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (Exception e) {
                    
                }
            }
        }
    }

    /**
     * This is going to clear the screen and reset
     */
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * This is going to return then num of the selection
     * @param num the number inputed for selection
     * @return this is going to return the value based on selection
     */
    private String timeNotation(int num) {
        if(num<10) {
            return "0"+num;
        }
        return ""+num;
    }
}
