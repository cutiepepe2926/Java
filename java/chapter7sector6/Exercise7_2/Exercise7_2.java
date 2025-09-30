
public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }    
}

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

    public void shuffle() {
        StudaCard tempcard = null;
        for(int i=0; i<CARD_NUM; i++){
            int num = (int)(Math.floor(Math.random()*(CARD_NUM)));
            tempcard = cards[i];
            cards[i] = cards[num]; 
            cards[num] = tempcard;
        }
    }

    public StudaCard pick(){
        int num = (int)(Math.floor(Math.random()*(CARD_NUM)));
        return cards[num];
    }

    public StudaCard pick(int num){
        if(num<0||num>=CARD_NUM){
            return null;
        }
        return cards[num];
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