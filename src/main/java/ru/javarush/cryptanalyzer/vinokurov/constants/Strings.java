package ru.javarush.cryptanalyzer.vinokurov.constants;

public class Strings {
    private static final String rus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String eng = "abcdefghijklmnopqrstuvwxyz";
    private static final String cyphers = "1234567890";
    private static final String symbols = ",./@!'_-=+:;{}[]\" ";
    public static final String ALPHABET = rus + rus.toUpperCase() + eng + eng.toUpperCase() + cyphers + symbols;

}
