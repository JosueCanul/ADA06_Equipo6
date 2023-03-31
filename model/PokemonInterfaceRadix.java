package model;
/**
 * Pequeña interface para usar en el algoritmo "radix sort"
 * @author Josue Canul y Hector Cosgalla
 */
public interface PokemonInterfaceRadix {
    /**
     * Metodo utilizado para obtener datos que posteriormente seran utilizados
     * en el algoritmo "Radix Sort"
     * @param forma La forma de ordenamiento
     * @return El ataque del pokemon o el codigo ASCII del primer caracter 
     * dependiendo de la forma de ordenamiento.
     * @see ui.UserInterface
     */
    public Integer getValueForRadix(int forma);
    
}
