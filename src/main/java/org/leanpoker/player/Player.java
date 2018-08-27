package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Gyuri bacsi";

    public static int betRequest(JsonElement request) {
        try{

        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(request.toString(),LeanPokerRequest.class);
        for(PlayerModel player : pokerRequest.players){
            if(player.name.equals("Kenyer")){
                System.out.println("////////////////////////////////////////////"+player.name);
            }
            if(player.stack > 1000){
                System.out.println("stack >1000; bet -------------------------- 400");
                return 400;
            }
            else if(player.stack > 600){
                System.out.println("stack >600; bet -------------------------- 300");
                return 300;
            }
            else {
                System.out.println("stack <600; bet -------------------------- 210");
                return 210;
            }
        }

        return 210;
        }catch (Exception e){
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }
}
