public class FiveMinCommand implements Command{
     /**
     * @author Bella Myer
     */
    private StopWatch watch;

    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    public void execute() {
        watch.countDownFiveMin();
    }
}
