package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Gyuri bacsi";

    public static int betRequest(JsonElement request) {
        Service service = new Service();
        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(request.toString(),LeanPokerRequest.class);
        PlayerModel myPlayer = service.getMyPlayer(pokerRequest);
        System.out.println(pokerRequest.currentBuyIn);

        try{


        /*if(myPlayer.stack > service.biggestStack(pokerRequest)){
            return service.biggestStack(pokerRequest);
        }
        System.out.println("BEFORE IF");
        if(myPlayer.hole_cards[0].rank.equals(myPlayer.hole_cards[1].rank)){
            System.out.println("IN FIRST IF");
            return pokerRequest.currentBuyIn;
        }
        else if(myPlayer.hole_cards[0].suit.equals(myPlayer.hole_cards[1].suit)){
            System.out.println("IN SECOND IF");
            return pokerRequest.currentBuyIn;
        }
        else if((service.convertCardRankToValue(myPlayer.hole_cards[0]) + service.convertCardRankToValue(myPlayer.hole_cards[1]))>=22){
            System.out.println("IN THIRD IF");
            return pokerRequest.currentBuyIn;
        }*/
        return pokerRequest.minimumRaise;
        }catch (Exception e){
            System.out.println("EXCEPTION ---------------> " + e.getMessage());

        }finally {
            return pokerRequest.minimumRaise;
        }
    }

    public static void showdown(JsonElement game) {
    }





}
