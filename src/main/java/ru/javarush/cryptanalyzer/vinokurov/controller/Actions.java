package ru.javarush.cryptanalyzer.vinokurov.controller;

import ru.javarush.cryptanalyzer.vinokurov.commands.Action;
import ru.javarush.cryptanalyzer.vinokurov.commands.Decoder;
import ru.javarush.cryptanalyzer.vinokurov.commands.Encoder;

public enum Actions {

    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;
    }
}
