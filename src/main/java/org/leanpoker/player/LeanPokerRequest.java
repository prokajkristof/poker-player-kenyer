package org.leanpoker.player;

import java.util.Arrays;

public class LeanPokerRequest {
    PlayerModel[] players;
    String tournamentId;
    String gameId;
    int round;
    int betIndex;
    int smallBlind;
    int orbits;
    int dealer;
    Card[] community_cards;
    int current_buy_in;
    int pot;
    int minimumRaise;

    @Override
    public String toString() {
        return "LeanPokerRequest{" +
                "players=" + Arrays.toString(players) +
                ", tournamentId='" + tournamentId + '\'' +
                ", gameId='" + gameId + '\'' +
                ", round=" + round +
                ", betIndex=" + betIndex +
                ", smallBlind=" + smallBlind +
                ", orbits=" + orbits +
                ", dealer=" + dealer +
                ", community_cards=" + Arrays.toString(community_cards) +
                ", current_buy_in=" + current_buy_in +
                ", pot=" + pot +
                ", minimumRaise=" + minimumRaise +
                '}';
    }
}
