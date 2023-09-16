package me.kkhys.adapter;

import me.kkhys.adapter.sample1.Print;
import me.kkhys.adapter.sample1.PrintBanner;
import me.kkhys.adapter.sample2.Print2;
import me.kkhys.adapter.sample2.PrintBanner2;
import me.kkhys.adapter.sample3.FileIO;
import me.kkhys.adapter.sample3.FileProperties;

public class App {
    public static void main(String[] args) {
        // sample1
        // Use Print class instead of PrintBanner class
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();

        System.out.println("-----");

        // sample2
        Print2 print2 = new PrintBanner2("Hello");
        print2.printWeak();
        print2.printStrong();

        System.out.println("-----");

        // sample3
        FileIO fileIO = new FileProperties();

        var userDir = System.getProperty("user.dir");
        var appDir = userDir + "/adapter/src/main/java/me/kkhys/adapter";

        try {
            fileIO.readFromFile(appDir + "/sample3/file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile(appDir + "/sample3/newFile.txt");

            System.out.println("year = " + fileIO.getValue("year"));
            System.out.println("month = " + fileIO.getValue("month"));
            System.out.println("day = " + fileIO.getValue("day"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
