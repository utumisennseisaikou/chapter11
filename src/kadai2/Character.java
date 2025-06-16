package kadai2;

public class Character {
    String name;
    int hp;
    public void attack(Matango m){
        System.out.println(this.name+"の攻撃!");
        if(this.name.equals("ミナト")){
            System.out.println("敵に10のダメージを与える!");
        }else{
            System.out.println("敵に7のダメージを与える!");
        }

    }
    public void run(){
        System.out.println(this.name+"は逃げ出した!");
    }
}
