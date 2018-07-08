package jda;

import me.schlaubi.commandcord.command.CommandType;
import me.schlaubi.commandcord.command.handlers.JDACommandHandler;
import me.schlaubi.commandcord.command.permission.Permissions;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class FailCommand extends JDACommandHandler {

    public FailCommand() {
        super(new String[] {"fail"}, CommandType.FUN, Permissions.authorOnly(), "Thorws exception xD", "");
    }

    @Override
    public Message run(CommandInvocation commandInvocation) {
        return new MessageBuilder().setContent(String.valueOf(Integer.parseInt("dasdasdsa"))).build();
    }
}
