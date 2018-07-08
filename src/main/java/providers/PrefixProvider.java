package providers;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class PrefixProvider implements me.schlaubi.commandcord.command.PrefixProvider {

    /**
     * Get's the prefix of a guild
     * @param guildId The id of the server
     * @return String the prefix
     */
    public String getPrefix(String guildId) {
        //Just take the 4th number of the id as prefix xD
        return guildId.split("")[3];
    }
}
