package ru.javarush.cryptanalyzer.vinokurov;

import ru.javarush.cryptanalyzer.vinokurov.toplevel.Application;
import ru.javarush.cryptanalyzer.vinokurov.controller.MainController;
import ru.javarush.cryptanalyzer.vinokurov.entity.Result;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
    }
}
