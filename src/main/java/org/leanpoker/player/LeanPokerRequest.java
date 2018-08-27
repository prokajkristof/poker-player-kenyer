package org.leanpoker.player;

import java.util.Arrays;

public class LeanPokerRequest {
    PlayerModel[] players;
    String tournamentId;
    String gameId;
    int round;
    int bet_index;
    int smallb_lind;
    int orbits;
    int dealer;
    Card[] community_cards;
    int current_buy_in;
    int pot;
    int minimumr_aise;

    @Override
    public String toString() {
        return "LeanPokerRequest{" +
                "players=" + Arrays.toString(players) +
                ", tournamentId='" + tournamentId + '\'' +
                ", gameId='" + gameId + '\'' +
                ", round=" + round +
                ", bet_index=" + bet_index +
                ", smallb_lind=" + smallb_lind +
                ", orbits=" + orbits +
                ", dealer=" + dealer +
                ", community_cards=" + Arrays.toString(community_cards) +
                ", current_buy_in=" + current_buy_in +
                ", pot=" + pot +
                ", minimumr_aise=" + minimumr_aise +
                '}';
    }
}
