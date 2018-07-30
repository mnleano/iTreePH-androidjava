package com.pwu.itree.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pwu.itree.data.trees.tree0;
import com.pwu.itree.data.trees.tree1;
import com.pwu.itree.data.trees.tree10;
import com.pwu.itree.data.trees.tree11;
import com.pwu.itree.data.trees.tree12;
import com.pwu.itree.data.trees.tree13;
import com.pwu.itree.data.trees.tree14;
import com.pwu.itree.data.trees.tree2;
import com.pwu.itree.data.trees.tree3;
import com.pwu.itree.data.trees.tree4;
import com.pwu.itree.data.trees.tree5;
import com.pwu.itree.data.trees.tree6;
import com.pwu.itree.data.trees.tree7;
import com.pwu.itree.data.trees.tree8;
import com.pwu.itree.data.trees.tree9;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "TAG_" + DatabaseHelper.class.getSimpleName();

    private static final String DB_NAME = "DB_iTree";
    private static final int DB_VERSION = 35;

    public static final String TBL_FAMILY = "TBL_FAMILY";
    public static final String TBL_TREES = "TBL_TREES";

    public static final String TBL_FAMILY_ROW = "id, commonName, scientificName, description, drawable";
    public static final String TBL_TREES_ROW = "familyType, id, commonName, scientificName, description, habitat, cultivationDetails, otherUsage, drawable";

    private static DatabaseHelper instance = null;

    private DatabaseHelper(Context ctx) {
        super(ctx, DB_NAME, null, DB_VERSION);
    }

    public static DatabaseHelper getInstance(Context ctx) {
        if (instance == null)
            instance = new DatabaseHelper(ctx);

        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createTable(TBL_FAMILY, "id integer, commonName varchar, scientificName varchar, description varchar, drawable integer"));

        db.execSQL(createTable(TBL_TREES, "familyType integer, id integer, commonName varchar, scientificName varchar," +
                " description varchar, habitat varchar, cultivationDetails varchar, otherUsage varchar, drawable integer"));

        populateDB(db);

    }

    private String createTable(String table, String tableRow) {
        return "CREATE TABLE IF NOT EXISTS " + table + "(" + tableRow + ")";
    }

    private void populateDB(SQLiteDatabase db) {

        tree0.insert(db);
        tree1.insert(db);
        tree2.insert(db);
        tree3.insert(db);
        tree4.insert(db);
        tree5.insert(db);
        tree6.insert(db);
        tree7.insert(db);
        tree8.insert(db);
        tree9.insert(db);
        tree10.insert(db);
        tree11.insert(db);
        tree12.insert(db);
        tree13.insert(db);
        tree14.insert(db);

    }

    public static String insertQuery(String table, String tableRow, String values) {
        return "INSERT INTO " + table + "(" + tableRow + ") VALUES (" + values + ")";
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dropTable(TBL_FAMILY));
        db.execSQL(dropTable(TBL_TREES));

        onCreate(db);
    }

    private String dropTable(String table) {
        return "DROP TABLE IF EXISTS " + table;
    }

    // public classes;
}
