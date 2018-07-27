package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree3 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "3, '', 'Annonaceae', " +
                "'The custard apple, or annona, family, the largest family of the magnolia order (Magnoliales) with 129 genera and about 2,120 species. The family consists of trees, shrubs, and woody climbers found mainly in the tropics, although a few species extend into temperate regions. Many species are valuable for their large pulpy fruits, some are useful for their timber, and others are prized as ornamentals. Bark, leaves, and roots of several species are important in folk medicine, and others are important sources of perfume and spice. Members of the family tree3 have simple leaves with smooth margins that are alternately arranged in two rows along the stems. The radially symmetrical flowers are usually bisexual. In most species the three sepals are united at the base. There are six brown, yellow, or greenish petals, many stamens in a spiral, and many pistils, each with a one-chambered ovary containing many ovules. The fruit is a berry. Flowers in some species are borne directly on large branches or on the trunk (cauliflorous). The leaves and wood are often fragrant.', " + R.drawable.family_annonaceae));

//        3 - Annonaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 0, 'Bagang aso', 'Anaxagorea luzonensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 1, 'Atemoya', 'Annona atemoya', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 2, 'Guayabano', 'Annona muricata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 3, 'Anonas', 'Annona reticulata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 4, 'Atis', 'Annona squamosa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 5, 'Ilang-ilang', 'Canaga odorato', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 6, 'Amuyong	', 'Goniothalamus mauyon', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 7, 'Takulau', 'Miliosa vidalil', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 8, 'Lanutan', 'Mitrephora lanotan', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 9, 'Anolang', 'Papualthia lanceolata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 10, 'Kalimatas', 'Phaeanthus ebracteolatus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 11, 'Bolon', 'Platymitra arborea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 12, 'Yellow lanutan', 'Polyalthia flava', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 13, 'Indian lanutan', 'Polyalthia longifolia', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 14, 'Biriba', 'Rollinia mucosa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
