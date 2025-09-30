public class EqualsEx2 {
    public static void main(String args[]){
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1==p2){
            System.out.println("p1과 p2는 같은 사람입니다.");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }

        if(p1.equals(p2)){
            System.out.println("p1과 p2는 같은 사람입니다.");
        }
        else {
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}

class Person {
    long id;

    public boolean equals(Object obj){
        if(obj!=null && obj instanceof Person){
            //obj가 Object 타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요함
            return id == ((Person)obj).id;
        } 
        else {
            return false;
        }
    }

    Person(long id){
        this.id = id;
    }
}
