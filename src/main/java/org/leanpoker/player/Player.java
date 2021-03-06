package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "5.0";

    public static int betRequest(String s) {
        Service service = new Service();
        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(s, LeanPokerRequest.class);
        PlayerModel myPlayer = service.getMyPlayer(pokerRequest);



        try{
            for(Card card:myPlayer.hole_cards){
                System.out.println(card.rank+" "+card.suit);
            }

        /*if(myPlayer.stack > service.biggestStack(pokerRequest)){
            return service.biggestStack(pokerRequest);
        } else {
*/
            System.out.println("BEFORE IF");

            if(myPlayer.hole_cards[0].rank.equals(myPlayer.hole_cards[1].rank)){
                System.out.println("IN FIRST IF");
                return pokerRequest.current_buy_in;
            }
            
            else if((service.convertCardRankToValue(myPlayer.hole_cards[0]) + service.convertCardRankToValue(myPlayer.hole_cards[1]))>=20){
                System.out.println("IN THIRD IF");
                return pokerRequest.current_buy_in;

        }


            return 0;
        }catch (Throwable e){
            System.out.println("EXCEPTION ---------------> " + e);
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }





}
