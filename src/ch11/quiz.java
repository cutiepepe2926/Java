package ch11;

import java.util.*;

public class quiz {
    public static void main(String[] args) {
         List<User> list = new ArrayList<User>();
         Scanner scan = new Scanner(System.in);
         int i = 0;
         while(true){
             System.out.println("[1. 회원추가, 2. 회원찾기, 3. 회원삭제]");
             int menu = scan.nextInt();

             if(menu==1){
                 System.out.println("추가할 유저의 이름과, 나이를 입력해주세요.");
                 String name = scan.next();
                 int age = scan.nextInt();
                 User newUser = new User(name,age);
                 list.add(newUser);
             }
             else if(menu==2){
                 System.out.println("찾으려는 유저의 이름을 입력해주세요.");
                 String name = scan.next();
                 Iterator<User> it = list.iterator();
                 while(it.hasNext()){
                     User u = null;
                     u = it.next();
                     if(u.checkUser(name)){
                        u.showContent();
                     }
                     else {
                         System.out.println("찾는 회원은 없습니다.");
                     }
                 }
             }
             else if(menu==3){
                 System.out.println("삭제할 유저의 이름을 입력해주세요.");
                 String name = scan.next();
                 Iterator<User> it = list.iterator();
                 while(it.hasNext()){
                     if(it.next().name.equals(name)){
                         it.remove();
                         break;
                     }
                 }
                 System.out.println(list.size());
             }
             else {
                 System.out.println("잘못된 번호 입력. 다시 시도해주세요.");
             }
         }
    }
}

class User{
    public String name;
    public int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean checkUser(String name){
        if(this.name.equals(name)){
            return true;
        }
        else return false;
    }

    public void showContent(){
        System.out.println("이름 : "+this.name);
        System.out.println("나이 : "+this.age);
    }
}
