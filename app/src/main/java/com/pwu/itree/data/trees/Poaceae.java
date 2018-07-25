package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class Poaceae {
    
    public static void insert(SQLiteDatabase db){
        // 2 - Poaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 0, 'Indian bamboo', 'Bambusa arundinacea', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 1, 'Kawayan tinik', 'Bambusa blumeano', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 2, 'Bayog', 'Bambusa merrilliana', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 3, 'Tigbi', 'Coix lachrymal-jobi', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 4, 'Laak', 'Bambusa philippinensis', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 5, 'Merrill bamboo', 'Bambusa merrillii', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 6, 'Buddha bamboo', 'Bambusa tuldoides', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 7, 'Kawayan kiling', 'Bambusa vulgaris', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 8, 'Kawayan dilaw', 'Bambusa vulgaris', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 9, 'Giant Bamboo', 'Dendocaiamus asper', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 10, 'Bagto', 'Dinachiaa palawanense', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 11, 'Paragis', 'Eleusine indica', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 12, 'Bikal', 'Dinachiaa acutifiora', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 13, 'Spineless indian bamboo', 'Bambusa tulda', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 14, 'Amoseco', 'Chrysapogon aciculatus', '', " + R.drawable.img_no_resource));

    }
}
