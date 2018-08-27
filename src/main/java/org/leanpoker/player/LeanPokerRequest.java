package org.leanpoker.player;

import java.util.Arrays;

public class LeanPokerRequest {
    PlayerModel[] players;
    String tournament_id;
    String game_id;
    int round;
    int bet_index;
    int small_blind;
    int orbits;
    int dealer;
    Card[] community_cards;
    int current_buy_in;
    int pot;
    int minimum_raise;

    @Override
    public String toString() {
        return "LeanPokerRequest{" +
                "players=" + Arrays.toString(players) +
                ", tournamentId='" + tournament_id + '\'' +
                ", gameId='" + game_id + '\'' +
                ", round=" + round +
                ", bet_index=" + bet_index +
                ", smallb_lind=" + small_blind +
                ", orbits=" + orbits +
                ", dealer=" + dealer +
                ", community_cards=" + Arrays.toString(community_cards) +
                ", current_buy_in=" + current_buy_in +
                ", pot=" + pot +
                ", minimumr_aise=" + minimum_raise +
                '}';
    }
}
