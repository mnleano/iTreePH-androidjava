package com.pwu.itree.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.pwu.itree.activity.Tree;

import java.util.ArrayList;
import java.util.List;

public class DatabaseQueries {
    
    private static String TAG = "TAG_DatabaseQueries";

    private static SQLiteDatabase getReadableSQL(Context ctx) {
        return DatabaseHelper.getInstance(ctx).getReadableDatabase();
    }

    private static SQLiteDatabase getWritableSQL(Context ctx) {
        return DatabaseHelper.getInstance(ctx).getWritableDatabase();
    }

    public static List<Tree> getFamilyTrees(Context ctx) {
        SQLiteDatabase db = getReadableSQL(ctx);
        List<Tree> list = new ArrayList<>();
        Cursor cursor = db.query(DatabaseHelper.TBL_FAMILY, null, null, null, null, null, null, null);
        while (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));

            list.add(new Tree(id, commonName, scientificName, drawable));
        }
        return list;
    }

    public static Tree getFamilyTree(Context ctx, int familyType) {
        SQLiteDatabase db = getReadableSQL(ctx);

        Cursor cursor = db.query(DatabaseHelper.TBL_FAMILY, null, "id =?", new String[]{String.valueOf(familyType)}, null, null, null);
        if (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));
            String description = cursor.getString(cursor.getColumnIndex("description"));

            return new Tree(id, commonName, scientificName, description, drawable);
        }

        cursor.close();
        return null;
    }

    public static void testDB(Context ctx) {

        String logString;
        SQLiteDatabase db = getReadableSQL(ctx);
//        Cursor cursor = db.query(TBL_TREES, null, "familyType =?", new String[]{String.valueOf(familyType)}, null, null, null);
        Cursor cursor = db.query(DatabaseHelper.TBL_TREES, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int familyType = cursor.getInt(cursor.getColumnIndex("familyType"));
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            String description = cursor.getString(cursor.getColumnIndex("description"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));
//
//            logString = "familyType: " + familyType + "\nId: " + id +
//                    "\ncommonName: " + commonName + "\nscienfiticName: " + scientificName + "\n\n";

            logString = "description: " + description;
            Log.d(TAG, logString);
        }

    }

}
