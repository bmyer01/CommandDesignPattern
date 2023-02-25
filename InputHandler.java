import java.util.HashMap;
/**
 * A class to handle user input and pass it along to other classes
 * @author Michael Cluver
 */
public class InputHandler {
    private HashMap<String, Command> commands;


    public InputHandler(StopWatch Watch){
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand());
        commands.put("5", new FiveMinCommand());
        commands.put("30",new ThirtySecCommand());

    }

    public boolean InputEntered(String data){

    }
}
