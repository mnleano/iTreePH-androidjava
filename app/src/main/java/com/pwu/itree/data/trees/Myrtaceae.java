package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class Myrtaceae {

    public static void insert(SQLiteDatabase db) {
        // 4 - Myrtaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 0, 'Binoloan', 'Acmena acuminatissima', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 1, 'Bagras', 'Eucalyptus deglupto', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 2, 'Swamp mahogany', 'Eucalyptus robusta', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 3, 'Guava', 'Psidium guajava', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 4, 'Kalubkob', 'Syzygium calubcob', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 5, 'Kurasam', 'Syzygium claviflorum', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 6, 'Duhat', 'Syzygium cumini', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 7, 'Tampui', 'Syzygium jambos', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 8, 'Manangkil', 'Syzygium mananquil', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 9, 'Syzygium mananquil', 'Syzygium nitidum', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 10, 'Syzygium nitidum', 'Syzygium samarangense', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 11, 'Pangloboein', 'Syzygium simile', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 12, 'Malatampoy', 'Syzygium xanthophyllum', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 13, 'Malabayabas', 'Tristaniopsis decorticata', '', " + R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 14, 'Mangkono', 'Xanthostemon verdugonianus', '', " + R.drawable.img_no_resource));

    }
}
