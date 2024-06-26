package ru.javarush.cryptanalyzer.vinokurov.commands;

import ru.javarush.cryptanalyzer.vinokurov.entity.Result;
import ru.javarush.cryptanalyzer.vinokurov.entity.ResultCode;
import ru.javarush.cryptanalyzer.vinokurov.exception.ApplicationException;
import ru.javarush.cryptanalyzer.vinokurov.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        String txtFile = parameters[0];
        String encryptedFile = parameters[0];
        Path path = Path.of(PathFinder.getRoot() + txtFile);
        try {
            List<String> strings = Files.readAllLines(path);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new ApplicationException("IO error", e);
        }

        Result result = new Result(ResultCode.OK, " read all bites " + path);
        return result;
    }
}
