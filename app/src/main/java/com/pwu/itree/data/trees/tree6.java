package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree6 {

    public static void insert(SQLiteDatabase db) {
//        3 - Annonaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 0, 'Bagang aso', 'Anaxagorea luzonensis', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 1, 'Atemoya', 'Annona atemoya', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 2, 'Guayabano', 'Annona muricata', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 3, 'Anonas', 'Annona reticulata', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 4, 'Atis', 'Annona squamosa', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 5, 'Ilang-ilang', 'Canaga odorato', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 6, 'Amuyong	', 'Goniothalamus mauyon', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 7, 'Takulau', 'Miliosa vidalil', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 8, 'Lanutan', 'Mitrephora lanotan', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 9, 'Anolang', 'Papualthia lanceolata', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 10, 'Kalimatas', 'Phaeanthus ebracteolatus', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 11, 'Bolon', 'Platymitra arborea', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 12, 'Yellow lanutan', 'Polyalthia flava', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 13, 'Indian lanutan', 'Polyalthia longifolia', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 14, 'Biriba', 'Rollinia mucosa', '', " + R.drawable.img_no_resource));

    }
}
