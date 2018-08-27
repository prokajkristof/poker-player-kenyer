package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Gyuri";

    public static int betRequest(JsonElement request) {
        System.out.println(request.isJsonObject());

        Gson gson = new Gson();
        LeanPokerRequest pokerRequest = gson.fromJson(request.toString(),LeanPokerRequest.class);
        System.out.println(pokerRequest.players[0].name);
        return 210;
    }

    public static void showdown(JsonElement game) {
    }
}
