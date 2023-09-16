package me.kkhys.adapter.sample3;

public interface FileIO {
    void readFromFile(String filename) throws Exception;

    void writeToFile(String filename) throws Exception;

    void setValue(String key, String value);

    String getValue(String key);
}
