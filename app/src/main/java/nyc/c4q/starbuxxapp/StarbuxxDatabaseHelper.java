package nyc.c4q.starbuxxapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MsNehisi on 1/30/18.
 */

public class StarbuxxDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "starbuxx";
    private static final int DB_VERSION = 1;

    StarbuxxDatabaseHelper (Context context){
        super(context, DB_NAME, null, DB_VERSION);

    }

    //onCreate() and onUpgrade() are mandatory methods of SQLiteOpenHelper
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID_INTEGER);");
        insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.latte);
        insertDrink(db, "Cappucino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino);
        insertDrink(db, "Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter);
        insertDrink(db, "Americano", "Diluted expresso with similar strength but different flavor", R.drawable.americano);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertDrink(SQLiteDatabase db, String name, String description, int resourceId) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("DESCRIPTION", description);
        drinkValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("DRINK", null, drinkValues);
    }
}
