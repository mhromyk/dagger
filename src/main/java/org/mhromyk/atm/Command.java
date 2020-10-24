package org.mhromyk.atm;

import java.util.List;

/** Logic to process some user input. */
public interface Command {
    /**
     * String token that signifies this command should be selected (like: "deposit", "withdraw")
     *
     * @return
     */
    String key();

    /** Process the rest of the command's words and do something. */
    Status handleInput(List<String> input);

    enum Status {
        INVALID,
        HANDLED
    }
}
