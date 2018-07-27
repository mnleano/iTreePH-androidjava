package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree2 {
    
    public static void insert(SQLiteDatabase db){

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "2, '', 'Poaceae', " +
                "'Formerly called Gramineae, grass family of monocotyledonous flowering plants, a division of the order Poales. The tree2 are the worlds single most important source of food. They rank among the top five families of flowering plants in terms of the number of species, but they are clearly the most abundant and important family of the Earths flora. They grow on all continents, in desert to freshwater and marine habitats, and at all but the highest elevations. Plant communities dominated by grasses account for about 24 percent of the Earths vegetation. Grasses may be annual or perennial herbs, generally with the following characteristics (the image gallery can be used for reference): The stemsof grasses, called culms, are usually cylindrical (more rarely flattened, but not 3-angled) and are hollow, plugged at the nodes, where the leaves are attached. Grass leaves are nearly always alternate and distichous (in one plane), and have parallel veins. Each leaf is differentiated into a lower sheath hugging the stem and a blade with entire (i.e., smooth) margins. The leaf blades of many grasses are hardened with silicaphytoliths, which discourage grazing animals; some, such as sword grass, are sharp enough to cut human skin. A membranous appendage or fringe of hairs called the ligule lies at the junction between sheath and blade, preventing water or insects from penetrating into the sheath.', " + R.drawable.family_poaceae));

        // 2 - Poaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 0, 'Indian bamboo', 'Bambusa arundinacea', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 1, 'Kawayan tinik', 'Bambusa blumeano', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 2, 'Bayog', 'Bambusa merrilliana', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 3, 'Tigbi', 'Coix lachrymal-jobi', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 4, 'Laak', 'Bambusa philippinensis', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 5, 'Merrill bamboo', 'Bambusa merrillii', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 6, 'Buddha bamboo', 'Bambusa tuldoides', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 7, 'Kawayan kiling', 'Bambusa vulgaris', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 8, 'Kawayan dilaw', 'Bambusa vulgaris', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 9, 'Giant Bamboo', 'Dendocaiamus asper', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 10, 'Bagto', 'Dinachiaa palawanense', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 11, 'Paragis', 'Eleusine indica', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 12, 'Bikal', 'Dinachiaa acutifiora', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 13, 'Spineless indian bamboo', 'Bambusa tulda', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 14, 'Amoseco', 'Chrysapogon aciculatus', " +
                "'description', " + 
                "'habitat', " +
                "'cultivationDetails', " +
                "'otherUSage', " +
                R.drawable.img_no_resource));

    }
}
