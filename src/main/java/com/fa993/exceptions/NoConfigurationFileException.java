package com.fa993.exceptions;

public class NoConfigurationFileException extends Exception {

    public NoConfigurationFileException(Throwable cause) {
        super("No Configuration File(waterfall.json) Found At src/main/resources/", cause);
    }
}
