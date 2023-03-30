package model;
public class Pokemon{
    protected Integer number; 
    protected String name;
    protected String typeOne;
    protected String typeTwo;
    protected Integer total;
    protected Integer hp;
    protected Integer attack;
    protected Integer defense;
    protected Integer spAttack;
    protected Integer spDefense;
    protected Integer speed;
    protected Integer generation;
    protected Boolean legendary;
    
    
     
    @Override
    public String toString() {
        return number + "," + name + "," + typeOne + "," + typeTwo
                + "," + total + "," + hp + "," + attack + "," + defense + ","
                + spAttack + "," + spDefense + "," + speed + "," + generation
                + "," + legendary;
    }

    

    /* 
    @Override
    public String toString() {
        return "Pokemon [number=" + number + ", name=" + name + ", typeOne=" + typeOne + ", typeTwo=" + typeTwo
                + ", total=" + total + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", spAttack="
                + spAttack + ", spDefense=" + spDefense + ", speed=" + speed + ", generation=" + generation
                + ", legendary=" + legendary + "]";
    }*/


    public Pokemon(Integer number, String name, String typeOne, String typeTwo, Integer total, Integer hp,
            Integer attack, Integer defense, Integer spAttack, Integer spDefense, Integer speed, Integer generation,
            Boolean legendary) {
        this.number = number;
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    
    public Pokemon() {
    }


    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeOne() {
        return typeOne;
    }
    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }
    public String getTypeTwo() {
        return typeTwo;
    }
    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getHp() {
        return hp;
    }
    public void setHp(Integer hp) {
        this.hp = hp;
    }
    public Integer getAttack() {
        return attack;
    }
    public void setAttack(Integer attack) {
        this.attack = attack;
    }
    public Integer getDefense() {
        return defense;
    }
    public void setDefense(Integer defense) {
        this.defense = defense;
    }
    public Integer getSpAttack() {
        return spAttack;
    }
    public void setSpAttack(Integer spAttack) {
        this.spAttack = spAttack;
    }
    public Integer getSpDefense() {
        return spDefense;
    }
    public void setSpDefense(Integer spDefense) {
        this.spDefense = spDefense;
    }
    public Integer getSpeed() {
        return speed;
    }
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer getGeneration() {
        return generation;
    }
    public void setGeneration(Integer generation) {
        this.generation = generation;
    }
    public Boolean getLegendary() {
        return legendary;
    }
    public void setLegendary(Boolean legendary) {
        this.legendary = legendary;
    }

    
}
