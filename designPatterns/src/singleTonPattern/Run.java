package singleTonPattern;

public class Run {

    public static void main(String[] args) {
        // we can call callDbManager method, cause it is a static method
        DbManager dbManager = DbManager.callDbManager();
        System.out.println(dbManager);

        DbManager dbManager2 = DbManager.callDbManager();
        System.out.println(dbManager2);

    }
}
