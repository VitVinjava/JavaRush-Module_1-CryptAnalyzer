package ru.javarush.cryptanalyzer.vinokurov.commands;

import ru.javarush.cryptanalyzer.vinokurov.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
