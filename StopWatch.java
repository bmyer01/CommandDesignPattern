import java.util.concurrent.TimeUnit;
public class StopWatch {

    public StopWatch() {
        
    }

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

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private String timeNotation(int num) {
        if(num<10) {
            return "0"+num;
        }
        return ""+num;
    }
}
