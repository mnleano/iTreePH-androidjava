package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class Arecaeceae {
    
    public static void insert(SQLiteDatabase db){
        // 1 - Arecaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 0, 'Manila palm', 'Adonidia merrillii', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 1, 'Martinez palm', 'Aiphanes caryotaefalia', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 2, 'Bunga', 'Areca catechu', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 3, 'Kaong', 'Arengo pinnata', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 4, 'Dumayaka', 'Arenga tremula', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 5, 'Ambong', 'Arenga undulatifolla', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 6, 'Palasan', 'Colomus merrillii', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 7, 'Pugahan', 'Caryota cumingil', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 8, 'Takipan', 'Caryota rumphiana', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 9, 'Nilog', 'Cocos nucifero', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 10, 'Buri', 'Coryapha utan', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 11, 'Red palm', 'Cyrtostachys renda', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 12, 'Palmera', 'Dypsis lutescends', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 13, 'African oil palm', 'Elaeis guineensis', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 14, 'Date palm', 'Phoenix dactylifera', '', " + R.drawable.img_no_resource));

    }
}
