public class OneMinCommand implements Command{
    /**
     * @author Bella Myer
     */
    private StopWatch watch;

    /**
     * a constructor for a 1 minute command
     * @param watch
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
