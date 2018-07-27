package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree13 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "13, '', 'Rubiaceae', " +
                "'Morphologically easily recognizable as a coherent group by a combination of characters: opposite leaves that are simple and entire (with the exception of several newly discovered compound-leaved species of Pentagonia), interpetiolar stipules, tubular sympetalous actinomorphic corollas and an inferior ovary. A wide variety of growth forms are present: shrubs are most common (e.g. Coffea, Psychotria), but members of the family can also be trees (e.g. Cinchona, Nauclea), lianas , or herbs. Some epiphytes are also present (e.g. Myrmecodia). The plants usually contain iridoids, various alkaloids, and raphide crystals are common. The leaves are simple, undivided, and entire; leaf blades are usually elliptical, with a cuneate base and an acute tip. In three genera (Pavetta, Psychotria, Sericanthe), bacterial leaf nodules can be observed as dark spots or lines on the leaves. The phyllotaxis is usually decussate, rarely whorled (e.g. Fadogia), or rarely alternate resulting from the suppression of one leaf at each node (e.g. Sabicea sthenula). Characteristic for the Rubiaceae is the presence of stipules that are mostly fused to an interpetiolar structure on either side of the stem between the opposite leaves. Their inside surface often bears glands called \"colleters\", which produce mucilaginous compounds protecting the young shoot. The \"whorled\" leaves of the herbaceous Rubieae tribe have classically been interpreted as true leaves plus interpetiolar leaf-like stipules. The inflorescence is a cyme, rarely of solitary flowers (e.g. Rothmannia), and is either terminal or axillary and paired at the nodes. The flowers are usually bisexual and usually epigynous.', " + R.drawable.family_rubiaceae));

        // 13 - Rubiaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 0, 'Ligad-ligad', 'Borreria articularis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 1, 'Landrina', 'Borreria acymoides', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 2, 'Malakape', 'Canthium diococcum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 3, 'Red rubia', 'Carphalea kikondron', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 4, 'Tadiang anuang', 'Canthium monstrosum', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 5, 'Kape', 'Coffea arabica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 6, 'Rosal', 'Gardenia jas minoides', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 7, 'Balanigan', 'Gardenia longiflora', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 8, 'Hedyotis', 'Hedyotis biflora', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 9, 'Santan', 'Ixora chinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 10, 'Mayanman', 'Ixora longistipula', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 11, 'Ludek', 'Ludekia bernardoi', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 12, 'Nino', 'Morinda citrifolia', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 13, 'Kahoy dalaga', 'Mussaenda philippica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 14, 'Bangkal', 'Nauclea orientals', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
