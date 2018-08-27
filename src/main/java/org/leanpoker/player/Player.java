package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Gyuri bacsi";

    public static int betRequest(JsonElement request) {
        try{

        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(request.toString(),LeanPokerRequest.class);
        PlayerModel myPlayer = new Player().getMyPlayer(pokerRequest);

        if(myPlayer.hole_cards[0].rank.equals(myPlayer.hole_cards[1].rank) || myPlayer.hole_cards[0].suit.equals(myPlayer.hole_cards[1].suit)){
            return pokerRequest.currentBuyIn;
        }
        return 210;
        }catch (Exception e){
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }


    public PlayerModel getMyPlayer(LeanPokerRequest pokerRequest){
        for(PlayerModel player : pokerRequest.players){
            if(player.name.equals("Kenyer")){
                return player;
            }
        }
        return null;
    }
}
