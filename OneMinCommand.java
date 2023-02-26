public class OneMinCommand implements Command{
    /**
     * @author Bella Myer
     */
    private StopWatch watch;

    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    public void execute() {
        watch.countDownOneMin();
    }
}
