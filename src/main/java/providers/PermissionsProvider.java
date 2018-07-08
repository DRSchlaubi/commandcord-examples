package providers;

import me.schlaubi.commandcord.command.permission.Member;
import me.schlaubi.commandcord.command.permission.PermissionProvider;
import stuff.Info;
import stuff.PERMISSIONS;

import java.util.Arrays;

/**
 * @author Schlaubi / Michael Rittmeister
 */

public class PermissionsProvider implements PermissionProvider {

    private PERMISSIONS perms = new PERMISSIONS();

    public boolean isGuildOwner(Member member) {
        return false;
    }

    public boolean isBotAuthor(Member member) {
        return Arrays.asList(Info.BOT_OWNERS).contains(member.getUserId());
    }

    public boolean hasPermissionNode(Member member, String s) {
        return false;
    }

    public boolean hasPermissionLevel(Member member, int i) {
        return perms.perms.get(member.getUserId()) >= i;
    }
}
