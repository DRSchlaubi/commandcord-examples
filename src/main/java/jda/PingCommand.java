package jda;

import me.schlaubi.commandcord.command.CommandType;
import me.schlaubi.commandcord.command.handlers.JDACommandHandler;
import me.schlaubi.commandcord.command.permission.Permissions;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.Message;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class PingCommand extends JDACommandHandler {

    public PingCommand() {
        super(new String[] {"ping"}, CommandType.FUN, Permissions.level(1), "Test command", "");
    }

    @Override
    public Message run(CommandInvocation commandInvocation) {
        return new MessageBuilder().setContent(String.valueOf(commandInvocation.getChannel().getJDA().getPing())).build();
    }
}
