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

    public boolean searchPairs(LeanPokerRequest pokerRequest) {
        Card[] cards = pokerRequest.communityCards;
        Card first = getMyPlayer(pokerRequest).hole_cards[0];
        Card second = getMyPlayer(pokerRequest).hole_cards[1];

        if (cards[0].rank.equals(first.rank) || cards[0].rank.equals(second.rank) || cards[1].rank.equals(first.rank) || cards[1].rank.equals(second.rank) || cards[2].rank.equals(first.rank) || cards[2].rank.equals(second.rank) || first.rank.equals(second.rank)) {
            return true;
        } else {
            return false;
        }
    }
}
