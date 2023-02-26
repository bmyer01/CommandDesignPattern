import java.util.HashMap;
/**
 * A class to handle user input and pass it along to other classes
 * @author Michael Cluver
 */
public class InputHandler {
    private HashMap<String, Command> commands;
    private StopWatch Watch;

    /**
     * A constuctor for an input handler
     * @param Watch
     */
    public InputHandler(StopWatch Watch){
        this.Watch = Watch;

        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(Watch));
        commands.put("5", new FiveMinCommand(Watch));
        commands.put("30",new ThirtySecCommand(Watch));

    }

    /**
     * A method that returns a boolean value based on whether the input 
     * entered is correct
     * @param data
     * @return a boolean value based on whether the input is correct
     */
    public boolean inputEntered(String data){
        if(commands.containsKey(data)){
            commands.get(data).execute();
            return true;
        }
        else{
            return false;
        }
    }
}
