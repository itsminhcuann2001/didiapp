package data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import model.User;

public class DBManager extends SQLiteOpenHelper {

    private static final String DATEBASE_NAME = "user_manager";
    private static final String TABLE_NAME = "user";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DATE = "date";
    private static final String ADDRESS = "address";
    private static final String PHONE_NUMBER = "phone";
    private static int VERSION = 1;

    private String SQLQuery= "CREATE TABLE " +DATEBASE_NAME+" ("+
            ID + "integer primary key, "+
            NAME + "TEXT, "+
            DATE + "TEXT, "+
            PHONE_NUMBER + "TEXT, "+
            ADDRESS +" TEXT)";

    public DBManager(@Nullable Context context) {
        super(context, DATEBASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addUser(User user){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME, user.getmName());
        values.put(DATE, user.getmDate());
        values.put(ADDRESS, user.getmAddress());
        values.put(PHONE_NUMBER, user.getmPhoneNumber());
        db.insert(TABLE_NAME,null,values);
    }
}
