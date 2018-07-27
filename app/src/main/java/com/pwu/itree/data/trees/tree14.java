package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree14 {

    public static void insert(SQLiteDatabase db) {
        // 14 - Lamiaceae

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "14, '', 'Lamiaceae', " +
                "'Formerly called Labiatae, the mint family of flowering plants, with 236 genera and more than 7,000 species, the largest family of the order Lamiales. Lamiaceae is distributed nearly worldwide, and many species are cultivated for their fragrant leaves and attractive flowers. The family is particularly important to humans for herb plants useful for flavour, fragrance, or medicinal properties. The alternate family name Labiatae refers to the fact that the flowers typically have petals fused into an upper lip and a lower lip (labia in Latin). The flowers are bilaterally symmetrical with five united petals and five united sepals. They are usually bisexual and verticillastrate (a flower cluster that looks like a whorl of flowers, but actually consists of two crowded clusters). Although this is still considered an acceptable alternative name, most botanists now use the name Lamiaceae in referring to this family. The leaves emerge oppositely, each pair at right angles to the previous one (decussate) or whorled. The stems are frequently square in cross section, but this is not found in all members of the family, and is sometimes found in other plant families.', " + R.drawable.family_lamiaceae));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 0, 'Atimla', 'Callicarpa magno', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 1, 'Kasupnagil', 'Cleodendrum macrostegium', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 2, 'Baguak', 'Clerodendrum minahassae', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 3, 'Gmelina', 'Gmelina arborea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 4, 'Magilik', 'Premna cumingiana', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 5, 'Alagau', 'Premna odorata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 6, 'Teak', 'Tectona grandis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 7, 'Philippine teak', 'Tectona philippinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 8, 'Lagundi', 'Vitex negundo', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 9, 'Molave', 'Vitex parviflora', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 10, 'Lingo-lingo', 'Viticimpremna philippinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 11, 'Dangula', 'Teijsmanniadendron ahernianum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 12, 'Dangula', 'Callicarpa formosana', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 13, 'Pay-at', 'Cleodendrum macrostegium', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 14, 'Music bush', 'Cleodendrum syphonanthus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
