package singleTonPattern;

/***
 * I use this class as my Data base manager.
 *
 */
public class DbManager {


    private static DbManager dbManager;

    /**
     * I make DbManger class constructor as private
     * then No one cam make instance/object using this constructor .
     */
    private DbManager(){}

    /**
     * create a method to initialize the DbManager instance
     * @return DbManager instance
     */
    public static DbManager callDbManager(){
        // check the dbMnager is null
        if( dbManager == null){
            /**
             * I create a new instance inside synchronized block
             */
            synchronized (DbManager.class){
                if(dbManager == null){
                    dbManager = new DbManager();
                    return dbManager;
                }
                return dbManager;
            }
        }
        return dbManager;
    }
}
