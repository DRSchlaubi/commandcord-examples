package providers;

import me.schlaubi.commandcord.command.BlackListProvider;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class BlacklistProvider implements BlackListProvider {

    /**
     * Checks if a channel is blacklisted
     * @param channelId The id of the channel
     * @return Boolean If the channel is blacklisted
     */
    @Override
    public boolean isBlackListed(String channelId) {
        //Block channel with the id 454682750981636127
        return channelId.equals("454682750981636127");
    }
}
