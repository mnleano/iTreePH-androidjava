package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree5 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "5, '', 'Fabaceae: Caesalpiniodeae', " +
                "'The subfamily Caesalpinioideae (classified as a family, Caesalpiniaceae, by some authorities) is a heterogeneous group of plants with about 160 genera and some 2,000 species. The latest classifications show that this subfamily is the most basal lineage among the legumes and the one from which the other two subfamilies evolved. In that sense it is not a true monophyletic group, and it will undoubtedly be treated taxonomically in a different way in the future. Caesalpinioideae legumes are found throughout the world but are primarily woody plants in the tropics. Their moderate secondary invasion of temperate regions is mostly by herbaceous (nonwoody) evolutionary derivatives. The presence of Gleditsia triacanthos (honey locust) and of the related Gymnocladus dioica (Kentucky coffee tree) in temperate regions is a striking exception to this generalization, however, and they may represent more ancient and relictual lineages in the subfamily.', " + R.drawable.family_fabaceae));

        // 5 - Fabaceae: Caesalpiniodeae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 0, 'Duhat', 'Afzelia borneensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 1, 'Tindalo', 'Afzelia rhamboidea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 2, 'Amherstia', 'Amherstia nobilis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 3, 'Kulibangbang', 'Bauhinia acuminata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 4, 'Agpoi', 'Bauhinia integrifolla', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 5, 'Alibangbang', 'Bauhinia malabarica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 6, 'Fringon', 'Bauhinia monandra', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 7, 'Caballero', 'Caesalpinia pulcehrrima', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 8, 'Golden shower', 'Cassia fistulae', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 9, 'Yellow shower', 'Cassia fruticosa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 10, 'Balitbitan', 'Cynometra ramifiara', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 11, 'Logwood', 'Haematoxylon campechianum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 12, 'Ipil', 'Instia Bijuga', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 13, 'Hankerchief tree', 'Maniltoa lenticellata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 14, 'Akapulko	', 'Senna alata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
    }
}
