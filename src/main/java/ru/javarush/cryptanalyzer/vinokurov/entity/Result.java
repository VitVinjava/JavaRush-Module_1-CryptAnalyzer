package ru.javarush.cryptanalyzer.vinokurov.entity;

public class Result {
    private final ResultCode resultCode;
    private final String massege;

    public Result(ResultCode resultCode, String massege) {
        this.resultCode = resultCode;
        this.massege = massege;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public String getMassege() {
        return massege;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", massege='" + massege + '\'' +
                '}';
    }
}
