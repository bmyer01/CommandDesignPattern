public class ThirtySecCommand implements Command {
     /**
     * a representation of a thirty second timer on a watch
     * @author Bella Myer
     */
    private StopWatch watch;

    /**
     * A constructor for a thirty second command
     * @param watch is going to display time
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


