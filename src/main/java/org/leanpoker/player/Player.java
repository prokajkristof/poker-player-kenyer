package org.leanpoker.player;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        System.out.println(request.isJsonObject());

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
