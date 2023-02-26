public class FiveMinCommand implements Command {
     /**
      * a representation of a five minute timer on a watch
     * @author Bella Myer
     */
    private StopWatch watch;

    /**
     * a constructor for a five minute command
     * @param watch
     */
    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * a method that executes the five minute count down
     */
    public void execute() {
        watch.countDownFiveMin();
    }
}
