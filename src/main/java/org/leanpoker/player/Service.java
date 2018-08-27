package org.leanpoker.player;

public class Service {

    public int convertCardRankToValue(Card card) {
        switch (card.rank) {
            case "A":
                return card.value =14 ;
            case "J":
                return card.value=11;
            case "Q":
                return card.value = 12;
            case "K":
                return card.value = 13;
            default:
                return card.value = Integer.valueOf(card.rank);
        }
    }

    public static int evaulateTable() {
        return 0;
    }

    public PlayerModel getMyPlayer(LeanPokerRequest pokerRequest){
        for(PlayerModel player : pokerRequest.players){
            if(player.name.equals("Kenyer")){
                return player;
            }
        }
        return null;
    }

    public boolean searchThreeOfKind(LeanPokerRequest pokerRequest){
        PlayerModel myPlayer = getMyPlayer(pokerRequest);
        Card[] myCards = myPlayer.hole_cards;
        Card[] communityCards = pokerRequest.communityCards;
        return false;

    }

    public int biggestStack(LeanPokerRequest pokerRequest){
        int stack = 0;
        for(PlayerModel player : pokerRequest.players){
            if(player.stack >= stack){
                stack = player.stack;
            }
        }
        return stack;
    }
}
