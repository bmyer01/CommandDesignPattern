public class OneMinCommand implements Command {
    /**
     * a representation of a one minute timer on a watch
     * @author Bella Myer
     */
    private StopWatch watch;

    /**
     * a constructor for a 1 minute command
     * @param watch is going to display time
     */
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * executes a one minute count down
     */
    public void execute() {
        watch.countDownOneMin();
    }
}
