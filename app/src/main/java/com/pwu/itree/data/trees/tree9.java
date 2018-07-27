package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree9 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "9, '', 'Dipterocarpaceae', " +
                "'Family of 16 genera and approximately 695 known species of mainly tropical lowland rainforest trees. The family name, from the type genus Dipterocarpus, is derived from Greek (di = two, pteron = wing and karpos = fruit) and refers to the two-winged fruit. The largest genera are Shorea, Hopea, Dipterocarpus, and Vatica. Many are large forest emergent species, typically reaching heights of 40–70 m, some even over 80 m (in the genera Dryobalanops, Hopea and Shorea), with the tallest known living specimen (Shorea faguetiana) 93.0 m tall. The species of this family are of major importance in the timber trade. Their distribution is pantropical, from northern South America to Africa, the Seychelles, India, Indochina, Indonesia and Malaysia. The greatest diversity of Dipterocarpaceae occurs in Borneo.[6] Some species are now endangered as a result of overcutting, extensive illegal logging and habitat conversion. They provide valuable woods, aromatic essential oils, balsam, resins and are a source for plywood.', " + R.drawable.family_dipterocarpaceae));

        // 9 - Dipterocarpaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 0, 'Palosapis', 'Anisoptera thurifera', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 1, 'Dagang', 'Anisoptera aurea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 2, 'Apitong', 'Dipterocarpus grandiflorus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 3, 'Hagakhak', 'Dipterocarpus validus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 4, 'Dalingdingan', 'Hopea foxworthyi', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 5, 'Saplungan', 'Hopea plagata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 6, 'Bagtikan', 'Parashorea malaanonan', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 7, 'Tiaong', 'Shorea ovato', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 8, 'Almon', 'Shorea almon', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 9, 'Yakal', 'Shorea astylosa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 10, 'White lauan', 'Shorea contorta', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 11, 'Guijo', 'Shorea guiso', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 12, 'Red lauan', 'Shorea negrosensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 13, 'Mayapis', 'Shorea palosapis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 14, 'Tanguile', 'Shorea polysperma', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
