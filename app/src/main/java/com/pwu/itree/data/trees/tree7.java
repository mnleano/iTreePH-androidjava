package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree7 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "7, '', 'Fabaceae: Faboideae', " +
                "'The subfamily Faboideae, also called Papilionoideae (classified as a family, Fabaceae or Papilionaceae, by some authorities), is the largest group of legumes, consisting of about 475 genera and nearly 14,000 species grouped in 14 tribes. The name of the group probably originated because of the flowers resemblance to a butterfly (Latin: papilio). It is the unique bilaterally symmetric (zygomorphic) flowers that especially characterize the group, so that thousands of species can be recognized as a member of Papilionoideae at a glance. The Lathyrus odoratus(sweet pea) flower provides an example. It has a large petal at the top, called the banner, or standard, that develops outside of the others before the flower has opened, two lateral petals called wings, and two lower petals that are usually fused and form a keel that encloses the stamens and pistil. The whole design is adapted for pollination by insects or, in a few members, by hummingbirds. Sweet nectar, to which the insects are cued by coloured petals, is the usual pollinator attractant. Various locking and releasing devices of the keel and wing petals control pollination in diverse ways favouring (or enforcing) either outcrossing or self-pollination—e.g., Trifolium (clover), Medicago (alfalfa), and Lotus corniculatus (birds-foot trefoil). The most effective kind of obligate self-pollination, however, is that of cleistogamous flowers, which do not open and thus prevent the entry of insects. Lespedeza and many other genera of Papilionoideae legumes bear both kinds of flowers, generally on the same plant. Enforced inbreeding serves to fix and maintain successful strains; outbreeding provides evolutionary diversity that may facilitate habitat or range expansion or may serve to provide flexibility for environmental changes.', " + R.drawable.family_fabaceae_faboideae));

        // 7 - Fabaceae: Faboideae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 0, 'Dhak', 'Butea monosperma', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 1, 'Indian rosewood	', 'Dalbergia latifolia', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 2, 'Dapdap palong', 'Erythrina crista-galli', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 3, 'Dapdap', 'Erythrina variegata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 4, 'Payang-payang', 'Flemingia strobilifera', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 5, 'Dilang butiki', 'Centromesa pubescens', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 6, 'Chinese rosewood', 'Dalbergia conchinchinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 7, 'Katural', 'Sesbania grandiflora', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 8, 'Katural', 'Erythrina subumbrans', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 9, 'Kakaute', 'Gliricidia sepium', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 10, 'Bahai', 'Ormosia calavensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 11, 'Bani', 'Pongomia pinnata', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 12, 'Smooth narra', 'Pterocarpus indicus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 13, 'Prickly narra', 'Ptecarpus indicus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 14, 'Jade vine', 'Strongylodon macrobotrys', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
