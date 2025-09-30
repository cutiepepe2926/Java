public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank); // SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
        //scv.repair(marine);
        //에러 발생, marine은 repairable적용 불가
    }
}

interface Repairable {}

class Unit {
    int hitPoint;
    final int MAX_HP;

    public Unit(int hp) {
        this.MAX_HP = hp;
    }
    
}

class GroundUnit extends Unit {

    public GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    public AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150); //Tank의 HP는 150
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125); //Dropship의 HP는 125
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40); //Marine의 HP는 40
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairable {

    public SCV() {
        super(40); //SCV의 HP는 40
    }

    void repair(Repairable r){
        if(r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitPoint!=u.MAX_HP){
                //Unit의 HP를 증가시킨다.
                u.hitPoint++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");
        }
    }
}