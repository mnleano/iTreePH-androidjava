package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree10 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "10, '', 'Meliaceae', " +
                "'The dogbane family of flowering plants of the gentian order (Gentianales), including more than 415 genera and about 4,600 species of trees, shrubs, woody vines, and herbs, distributed primarily in tropical and subtropical areas of the world. Members of the family have milky, often poisonous juice; smooth-margined leaves; and flowers in clusters (rarely solitary). Some species, notably those in the subfamily Asclepiadoideae, have pollen massed in bundles called pollinia. The fruit may be berrylike or fleshy but usually is a dry pod (follicle) that splits open at maturity, releasing many winged or tufted seeds.', " + R.drawable.family_meliaceae));

        // 10 - Meliaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 0, 'Toona sureni', 'Aglaia edulis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 1, 'Bayanti', 'Aglaia rimosa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 2, 'Kangko', 'Aphanamixis polystachya', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 3, 'Neem tree', 'Azadirachta indica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 4, 'Spanish cedar', 'Cedrela adorata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 5, 'Katong matsing', 'Chisocheton pendatus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 6, 'Kalimutain', 'Dysoxylum arborescens', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 7, 'Igyo', 'Dysoxylum goudichaudianum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 8, 'Kalibaian', 'Heynea trijuga', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 9, 'Lansones', 'Lansium domesticum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 10, 'Bagalunga', 'Melia dubia Cav.', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 11, 'Santol', 'Sandoricum kaetjape', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 12, 'Tara-tara', 'Dysoxylum cumingianum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 13, 'Kalantas', 'Toona calantos', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 14, 'Danupra', 'Toona sureni', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
