package commandsModule.commands;

import defaultClasses.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * A class that implements the "save" command.
 */

public class SaveCommand implements BaseCommand {
    private static final Logger logger = LogManager.getLogger("logger.SaveCommand");

    /**
     * A method that returns the name of the command.
     */

    @Override
    public String getName() {
        return "save";
    }

    /**
     * A method that returns the response of the command.
     */

    @Override
    public String getResponse() {
        return "Executed only by server";
    }

    /**
     * A method that returns the description of the command.
     */

    @Override
    public String describe() {
        return "Saves the collection to a file. Can be executed only by server";
    }

    /**
     * When called, saves all {@link Person} elements from the collection to a file.
     *
     * @throws IOException when failed during I/O operations
     */

    @Override
    public void execute() throws IOException {
        // todo
        logger.info("Saved collection to a file");
    }

}
