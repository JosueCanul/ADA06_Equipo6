package controller;

import algorithms.BinaryInsertionSort;
import data.Converter;
import data.DataReader;
import model.comparators.PokemonAttack;

public class Controller {
    private DataReader dataReader = new DataReader();
    private Converter converter = new Converter();
    private BinaryInsertionSort<PokemonAttack> binaryInsertionSort;

    public Controller(BinaryInsertionSort<PokemonAttack> binaryInsertionSort) {
        this.binaryInsertionSort = binaryInsertionSort;
    }
}
