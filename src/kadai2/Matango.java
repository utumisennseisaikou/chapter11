package kadai2;

public class Matango {
    int hp =50;
    char suffix ;
    public Matango(char suffix){
        this.suffix = suffix;
    }
    public void damage(){
        if(this.suffix == 'A') {
            System.out.println(this.suffix + "は10のダーメジをくらった!");
            System.out.println(this.suffix +"の残りのhpは" + (this.hp - 10) + "だ!");
        }else if(this.suffix == 'B') {
            System.out.println(this.suffix + "は7のダーメジをくらった!");
            System.out.println(this.suffix +"の残りのhpは" + (this.hp - 7) + "だ!");

        }
    }
}
