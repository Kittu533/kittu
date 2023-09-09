package com.tutorial;

// Player
class Player{
    String Nama;
    Double Health;
    int Level;
    
    //Object Member
    Weapon weapon;
    Armor armor;

    Player (String nama,double health){
        this.Nama = nama;
        this.Health = health;
    }
    // Di dalam kelas Player
    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.Nama + " Attacking "+ opponent.Nama + " With damage " + attackPower);
        // Tambahkan logika serangan di sini, misalnya mengurangi kesehatan opponent.
        opponent.defence(attackPower);
    }

    void defence(double attackPower){

        //MENERIMA DAMAGE
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
            System.out.println();
        } else {
            damage = 0;
        }
        this.Health -= damage;
        System.out.println(this.Nama + " Gets Damage "+damage);
    }
    
    
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nNama : "+ this.Nama);
        System.out.println("Health : "+this.Health + " Hp");
        this.weapon.display();
        this.armor.display();
   }
}
// Senjata
class Weapon{
    Double attackPower; 
    String nama;

    Weapon (String nama,double attackPower){
        this.attackPower = attackPower;  
        this.nama = nama;

    }
    void display(){
        System.out.println("Senjata : "+this.nama+" attack : "+this.attackPower);
    }
}
// Armor
class Armor{
    Double defencePower;
    String nama;
    Armor (String nama,double defencePower){
     this.defencePower = defencePower;
     this.nama = nama;  
    }
    void display(){
        System.out.println("Armor : "+this.nama+" defence : "+this.defencePower);
    }
}


public class Main{
    public static void main(String[] args) {
        
        //MEMBUAT OBJECT PLAYER
        Player player1 = new Player("UCup",100);
        Player player2 = new Player("Bagong",120);

        //MEMBUAT OBJECT WEAPON
        Weapon pedang = new Weapon("Pedang",100);
        Weapon Trisula = new Weapon("Trisula", 50);

        //MEMBUAT OBJECT ARMOR
        Armor bajuBesi = new Armor("Baju Besi",50);
        Armor ZirahRaja = new Armor("Zirah Raja", 40);
        
        //EQUIP SENJATA DAN ARMOR 

        //PLAYER 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
        //PLAYER 2
        player2.equipWeapon(Trisula);
        player2.equipArmor(ZirahRaja);
        player2.display();
       
       
       

        System.out.println("\n PERTEMPURAN");
        System.out.println("\n EPISODE - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();     
        System.out.println("\n EPISODE - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();         

       
    }
}
