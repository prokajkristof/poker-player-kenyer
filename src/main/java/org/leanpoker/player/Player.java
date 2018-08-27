package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Gyuri bacsi";

    public static int betRequest(JsonElement request) {
        Service service = new Service();
        try{

        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(request.toString(),LeanPokerRequest.class);
        PlayerModel myPlayer = service.getMyPlayer(pokerRequest);
        if(myPlayer.stack > service.biggestStack(pokerRequest)){
            return service.biggestStack(pokerRequest);
        }
        System.out.println();
        if(myPlayer.hole_cards[0].rank.equals(myPlayer.hole_cards[1].rank)){
            return pokerRequest.currentBuyIn;
        }
        else if(myPlayer.hole_cards[0].suit.equals(myPlayer.hole_cards[1].suit)){
            return pokerRequest.currentBuyIn;
        }
        else if((service.convertCardRankToValue(myPlayer.hole_cards[0]) + service.convertCardRankToValue(myPlayer.hole_cards[1]))>=22){
            return pokerRequest.currentBuyIn;
        }
        return pokerRequest.currentBuyIn;
        }catch (Exception e){
            System.out.println("EXCEPTION ---------------> " + e.getMessage());
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }





}
