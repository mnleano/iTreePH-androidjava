package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree11 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "11, '', 'Sapindaceae', " +
                "'Mostly trees and shrubs, and tendril-bearing vines comprising about 140 genera and 1,500 species. The leaves are alternate, simple, or more commonly pinnately compound; stipules are absent except in the climbing forms. The flowers are small, actinomorphic or zygomorphic, and commonly functionally unisexual, although a given individual may bear seemingly bisexual flowers together with either male or female flowers. The perianth typically is biseriate, consisting of calyx and corolla. The calyx comprises 4 or 5 distinct or sometimes basally connate sepals. The corolla consists of 4 or 5 distinct petals or sometimes is absent. The petals commonly have basal appendages on the inner side. The stamens are distinct, often have hairy filaments, and in quantity usually are equal to or twice the number of calyx lobes. The gynoecium consists of a single compound pistil of usually 3 carpels, commonly an equal number of styles or style lobes, and a superior ovary usually with 3 locules, each containing 1 or 2 axile or axile-apical ovules. Most species have an extrastaminal, often asymmetrical nectary disk situated between the stamens and corolla.', " + R.drawable.family_sapindaceae));

        // 11 - Sapindaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 0, 'Philippine Maple', 'Acer laurinum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 1, 'Kubili', 'Cubilia cubili', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 2, 'Fern tree', 'Filicium decipens', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 3, 'Arangen', 'Ganophyllum falcatum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 4, 'Mamoko', 'Glenniea philippinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 5, 'Tamaho', 'Gloeocarpus patentivalvis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 6, 'Alahan', 'Guloo koelreuteria', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 7, 'Pospo', 'Lepisanthes tetraphylla', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 8, 'Alupag', 'Litchi chinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 9, 'Ambalag', 'Mischoscarpus pentapetalus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 10, 'Rambutan', 'Nephelium lappaceum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 11, 'Kapulasan', 'Nephelium rambutan', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 12, 'Malugai', 'Pametia pinnata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 13, 'Kusibeng', 'Sapindus saponaria', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 14, 'Uas', 'Harpullia arborea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
