class SutdaDeck {
    final int CARD_NUM = 20;
    StudaCard[] cards = new StudaCard[CARD_NUM];
    public SutdaDeck() {
        //배열 SutdaCard를 적절히 초기화 하시오.
        for(int i=0;i<CARD_NUM;i++){
            if(i==0 | i==2 | i==7){
                StudaCard card = new StudaCard(i+1,true);
                cards[i] = card;
            }
            else {
                StudaCard card = new StudaCard((i)%10+1,false);
                    cards[i] = card;
            }     
        }
    }
}

class StudaCard {
    int num;
    boolean isKwang;

    public StudaCard() {
        this(1,true);
    }

    public StudaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public String toString() {
        return num+(isKwang ? "K":"");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }
        //int num = (int)(Math.floor(Math.random()*(20+1)));
        //System.out.println(num);
    }
}
