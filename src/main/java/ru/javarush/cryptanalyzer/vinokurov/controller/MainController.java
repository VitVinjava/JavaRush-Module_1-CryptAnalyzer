package ru.javarush.cryptanalyzer.vinokurov.controller;

import ru.javarush.cryptanalyzer.vinokurov.commands.Action;
import ru.javarush.cryptanalyzer.vinokurov.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        Result result = action.execute(parameters);
        return result;

    }
}
