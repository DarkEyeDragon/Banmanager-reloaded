package banmanager;

import java.util.UUID;

public class BannedPlayer{

    private UUID bannedPlayer;
    private UUID punisher;
    private String currentName;
    private int bannedFrom;
    private int bannedTill;

    public BannedPlayer(UUID bannedPlayer, UUID bannedBy, String currentName,int bannedFrom, int bannedTill){
        this.bannedPlayer = bannedPlayer;
        this.punisher = bannedBy;
        this.currentName = currentName;
        this.bannedFrom = bannedFrom;
        this.bannedTill = bannedTill;
    }

    public UUID getBannedPlayer(){
        return bannedPlayer;
    }

    public UUID getPunisher(){
        return punisher;
    }

    public String getCurrentName(){
        return currentName;
    }
    public int getBanTime(){
        return bannedFrom;
    }

    public int getBannedTill(){
        return bannedTill;
    }
}
