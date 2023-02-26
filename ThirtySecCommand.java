public class ThirtySecCommand implements Command{
     /**
     * @author Bella Myer
     */
    private StopWatch watch;

    public ThirtySecCommand(StopWatch watch) {
        this.watch = watch;
    }

    public void execute() {
        watch.countDownThirtySec();
    }
}


