package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree6 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "6, '', 'Fabaceae: Mimosoideae', " +
                "'The subfamily Mimosoideae (classified as a family, Mimosaceae, by some authorities) includes 82 genera and more than 3,200 species. Like Caesalpinioideae, Mimosoideae legumes are primarily woody plants of the tropics, and the few species native to temperate parts of the world are mostly herbaceous. The majority of Mimosoideae have large leaves that are divided into secondary (compound) leaflets, and in many these leaflets are again divided (bicompound) and have a feathery, sometimes fernlike appearance. A striking exception is that of most of the Australian acacias (but not of the American kinds) mentioned above, in which the compound leaves have become modified, losing all their leaflets and appearing to be undivided, or simple. The flowers of the family are radially symmetric and are usually most easily recognized by the long stamens that extend beyond the rest of the flower. The calyx and corolla are both valvate in bud, contrasting with the usual condition in both of the other subfamilies. The petals are small and often not noticed except by close examination. Many of these plants have nodules containing the nitrogen-fixing bacterium Rhizobium on their roots.', " + R.drawable.family_fabaceae_mimosoideae));

        // 6 - Fabaceae: Mimosoideae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 0, 'Acacia', 'Acacia  auriculifarmis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 1, 'Ayangile', 'Acacia confusa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 2, 'Mangium', 'Acacia mangium', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 3, 'Tanglin', 'Adenanthera intermedia', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 4, 'Tanglin', 'Adenanthera pavonina', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 5, 'Akle', 'Albizia acle', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 6, 'Langil', 'Albizia lebbeck', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 7, 'Langil', 'Calliandra calathyrsus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 8, 'Pinkball', 'Calliandra portaricensise', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 9, 'Ipil-ipil', 'Leucaena leucocephala', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 10, 'Makahiya', 'Mimosa pudica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 11, 'Kupang', 'Parkia timoriana', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 12, 'Kamachile', 'Pithecellobium dulce', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 13, 'Rain tree', 'Samanea saman', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 14, 'Pinkado', 'Xylia xylocarpa', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
