package model;
/**
 * Objeto de tipo pokemon para almacenar los datos de la tabla y posteriormente ser revisados
 * @author Josue Canul
 */
public class Pokemon implements PokemonInterfaceRadix{
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

    /**
     * Metodo utiizado para identificar si el numero en el apatado de ataque 
     * o el nombre, es mayor o menor al objeto co el que se esta comparando
     * @param pokemon Objeto utilizado para comparar
     * @param forma la forma en la que se desea comparar proporcionada desde
     * la User Interface
     * @return Dependiendo de la forma es el resultado, si el parametro de 
     * forma es igual a {@code 1} retornara {@code 1} si el ataque del pokemon
     * actual es menor al pokemon a comparar y retornara {@code -1} si es al 
     * reves. Ocurre al reves si el parametro {@code forma} es {@code 2}, 
     * retornara {@code -1} si el ataque del pokemon actual es menor al ataque 
     * del pokemon a comparar y {@code 1} si es al reves. De manera analoga 
     * ocurre cuando {@code forma} es igual a {@code 3} retornando {@code 1} y
     * {@code -1} dependiendo del resultado de la comparacion y lo mismo ocurre
     * en el caso de la opcion {@code 4}. Tambien retorna {@code 0} en caso de 
     * que en cualquiera de todos los casos el numero o el nombre sean iguales.
     * @see ui.UserInterface.
     */
    public int compare(Pokemon pokemon, int forma){
        int result = 0;
        if (forma == 1) {
            if(this.getAttack() < pokemon.getAttack()){
                result = 1;
            }else if(this.getAttack() > pokemon.getAttack()){
                result = -1;
            }
        } else if (forma == 2){
            if(this.getAttack() > pokemon.getAttack()){
                result = 1;
            }else if(this.getAttack() < pokemon.getAttack()){
                result = -1;
            }
        } else if (forma == 3) {
            if(this.name.compareToIgnoreCase(pokemon.getName()) > 0){
                result = 1;
            }else if(this.name.compareToIgnoreCase(pokemon.getName()) < 0){
                result = -1;
            }
        } else {
            if(this.name.compareToIgnoreCase(pokemon.getName()) < 0){
                result = 1;
            }else if(this.name.compareToIgnoreCase(pokemon.getName()) > 0){
                result = -1;
            }
        }
        return result;
    }

    @Override
    public Integer getValueForRadix(int forma) {
        int returnedData;
        if (forma == 1 || forma == 2) {
            returnedData = attack;
        } else {
            char[] values = this.name.toCharArray();
            returnedData = (int) values[0];
        }
        return returnedData;
    }
}
