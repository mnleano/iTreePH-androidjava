package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree1 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "1, '', 'Arecaceae', " +
                "'Botanical family of perennial trees, climbers, shrubs, and acaules commonly known as palm trees (owing to historical usage, the family is alternatively called Palmae). They are flowering plants, a family in the monocot order Arecales. Currently 181 genera with around 2600 species are known, most of them restricted to tropical and subtropical climates. Most palms are distinguished by their large, compound, evergreen leaves, known as fronds, arranged at the top of an unbranched stem. However, palms exhibit an enormous diversity in physical characteristics and inhabit nearly every type of habitat within their range, from rainforests to deserts.', " + R.drawable.family_arecaceae));

        // 1 - Arecaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 0, 'Manila palm', 'Adonidia merrillii', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 1, 'Martinez palm', 'Aiphanes caryotaefalia', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 2, 'Bunga', 'Areca catechu', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 3, 'Kaong', 'Arengo pinnata', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 4, 'Dumayaka', 'Arenga tremula', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 5, 'Ambong', 'Arenga undulatifolla', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 6, 'Palasan', 'Colomus merrillii', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 7, 'Pugahan', 'Caryota cumingil', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 8, 'Takipan', 'Caryota rumphiana', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 9, 'Nilog', 'Cocos nucifero', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 10, 'Buri', 'Coryapha utan', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 11, 'Red palm', 'Cyrtostachys renda', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 12, 'Palmera', 'Dypsis lutescends', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 13, 'African oil palm', 'Elaeis guineensis', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 14, 'Date palm', 'Phoenix dactylifera', " +
                "'description', " +
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
