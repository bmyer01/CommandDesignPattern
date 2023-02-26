public class ThirtySecCommand implements Command {
     /**
     * @author Bella Myer
     */
    private StopWatch watch;

    /**
     * A constructor for a thirty second command
     * @param watch
     */
    public ThirtySecCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * a method that executes a thirty second count down
     */
    public void execute() {
        watch.countDownThirtySec();
    }
}


