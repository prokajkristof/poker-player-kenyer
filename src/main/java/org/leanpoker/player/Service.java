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
        String matchRank = "";
        Card[] myCards = myPlayer.hole_cards;
        Card[] communityCards = pokerRequest.community_cards;
        int counter = 0;
        for(Card myCard: myCards){
            for(Card communityCard:communityCards){
                if (myCard.rank.equals(communityCard.rank)){
                    counter++;
                }
            }
        }

        if(counter>=2){
            return true;
        }
        return false;
    }

    public int biggestStack(LeanPokerRequest pokerRequest){
        int stack = 0;
        for(PlayerModel player : pokerRequest.players){

            if(!player.name.equals("Kenyer") && player.stack >= stack){
                stack = player.stack;
            }
        }
        return stack;
    }

    public boolean searchPairs(LeanPokerRequest pokerRequest) {
        try {
            Card[] cards = pokerRequest.community_cards;
            Card first = getMyPlayer(pokerRequest).hole_cards[0];
            Card second = getMyPlayer(pokerRequest).hole_cards[1];
            if (cards[2].rank.equals(second.rank)) {
                return true;
            }
            if (cards.length != 0) {
                if (cards[0].rank.equals(first.rank) || cards[0].rank.equals(second.rank) || cards[1].rank.equals(first.rank) || cards[1].rank.equals(second.rank) || cards[2].rank.equals(first.rank) || cards[2].rank.equals(second.rank)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }catch (Exception e){
            return false;
        }


    }
}
