package jda;

import me.schlaubi.commandcord.command.CommandType;
import me.schlaubi.commandcord.core.APIWrapper;
import me.schlaubi.commandcord.core.CommandManager;
import me.schlaubi.commandcord.core.CommandManagerBuilder;
import me.schlaubi.commandcord.listeners.jda.JDAEditsListener;
import me.schlaubi.commandcord.util.helpcommands.JDAHelpCommand;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import providers.BlacklistProvider;
import providers.PermissionsProvider;
import providers.PrefixProvider;
import stuff.PERMISSIONS;

import javax.security.auth.login.LoginException;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class Main {

    public static JDA jda;

    public static void main(String[] args){

        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .setToken("MjczNDk5OTUzNDU0Nzc2MzIw.DiIXNQ.FPjqYzR1SNlZ77cRmMMP0_fkDgA")
                .addEventListener(new JDAEditsListener());
        try {
            jda = builder.buildBlocking();
        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }

        CommandManager manager = new CommandManagerBuilder(APIWrapper.JDA)
                .setApi(jda)
                .setPermissionProvider(new PermissionsProvider())
                .setPrefixProvider(new PrefixProvider())
                .setDefaultPrefix("!")
                .enableBlacklist(true)
                .enableGuildPrefixes(true)
                .setBlacklistProvider(new BlacklistProvider())
                .deleteInvokeMessages(true)
                .deleteCommandMessages(7)
                .build();

        manager.registerCommands(
                new JDAHelpCommand(new String[] {"help"}, CommandType.GENERAL, "Displays a list of commands", "[command]"),
                new PingCommand(),
                new FailCommand()
        );
        manager.getEventManager().registerListener(new EventListener());
    }
}
