package org.leanpoker.player;

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
}
