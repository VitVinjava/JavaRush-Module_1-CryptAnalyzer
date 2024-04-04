package ru.javarush.cryptanalyzer.vinokurov.toplevel;

import ru.javarush.cryptanalyzer.vinokurov.entity.Result;
import ru.javarush.cryptanalyzer.vinokurov.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        Result result = mainController.execute(command, parameters);

        return result;
    }
}
