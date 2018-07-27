package com.pwu.itree.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.pwu.itree.activity.Tree;
import com.pwu.itree.data.trees.tree0;
import com.pwu.itree.data.trees.tree1;
import com.pwu.itree.data.trees.tree10;
import com.pwu.itree.data.trees.tree11;
import com.pwu.itree.data.trees.tree12;
import com.pwu.itree.data.trees.tree13;
import com.pwu.itree.data.trees.tree14;
import com.pwu.itree.data.trees.tree2;
import com.pwu.itree.data.trees.tree3;
import com.pwu.itree.data.trees.tree4;
import com.pwu.itree.data.trees.tree5;
import com.pwu.itree.data.trees.tree6;
import com.pwu.itree.data.trees.tree7;
import com.pwu.itree.data.trees.tree8;
import com.pwu.itree.data.trees.tree9;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "TAG_" + DatabaseHelper.class.getSimpleName();

    private static final String DB_NAME = "DB_iTree";
    private static final int DB_VERSION = 35;

    public static final String TBL_FAMILY = "TBL_FAMILY";
    public static final String TBL_TREES = "TBL_TREES";

//    public static final String TBL_TREES_ADDITIONAL_INFO = "TBL_TREES_ADDITIONAL_INFO";

    public static final String TBL_FAMILY_ROW = "id, commonName, scientificName, description, drawable";
    public static final String TBL_TREES_ROW = "familyType, id, commonName, scientificName, description, habitat, cultivationDetails, otherUsage, drawable";
//    public static final String TBL_TREES_ADDITIONAL_INFO_ROW = "familyType, id, habitat, cultivationDetails, otherUsage";

    private static DatabaseHelper instance = null;

    private DatabaseHelper(Context ctx) {
        super(ctx, DB_NAME, null, DB_VERSION);
    }

    private static DatabaseHelper getInstance(Context ctx) {
        if (instance == null)
            instance = new DatabaseHelper(ctx);

        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createTable(TBL_FAMILY, "id integer, commonName varchar, scientificName varchar, description varchar, drawable integer"));

        db.execSQL(createTable(TBL_TREES, "familyType integer, id integer, commonName varchar, scientificName varchar," +
                " description varchar, habitat varchar, cultivationDetails varchar, otherUsage varchar, drawable integer"));

        //        db.execSQL(createTable(TBL_TREES_ADDITIONAL_INFO, "familyType integer, id integer, habitat varchar, cultivationDetails varchar, otherUsage varchar"));
        populateDB(db);

    }

    private String createTable(String table, String tableRow) {
        return "CREATE TABLE IF NOT EXISTS " + table + "(" + tableRow + ")";
    }


    public static String insertQuery(String table, String tableRow, String values) {
        return "INSERT INTO " + table + "(" + tableRow + ") VALUES (" + values + ")";
    }

    private void populateDB(SQLiteDatabase db) {

        tree0.insert(db);
        tree1.insert(db);
        tree2.insert(db);
        tree3.insert(db);
        tree4.insert(db);
        tree5.insert(db);
        tree6.insert(db);
        tree7.insert(db);
        tree8.insert(db);
        tree9.insert(db);
        tree10.insert(db);
        tree11.insert(db);
        tree12.insert(db);
        tree13.insert(db);
        tree14.insert(db);


//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "0, '', 'Araceae', " +
//                "'Family of monocotyledonous flowering plants in which flowers are borne on a type of inflorescence called a spadix. The spadix is usually accompanied by, and sometimes partially enclosed in, a spathe or leaf-like bract. Also known as the arum family, members are often colloquially known as aroids. This family of 114 genera and about 3750 known species is most diverse in the New World tropics, although also distributed in the Old World tropics and northern temperate regions. Species in the Araceae are often rhizomatous or tuberous and are often found to contain calcium oxalate crystals or raphides. The leaves can vary considerably from species to species. The inflorescence is composed of a spadix, which is almost always surrounded by a modified leaf called a spathe. In monoecious aroids (possessing separate male and female flowers, but with both flowers present on one plant), the spadix is usually organized with female flowers towards the bottom and male flowers towards the top. In aroids with perfect flowers, the stigma is no longer receptive when the pollen is released, thus preventing self-fertilization. Some species are dioecious. ', " + R.drawable.family_araceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "1, '', 'Arecaceae', " +
//                "'Botanical family of perennial trees, climbers, shrubs, and acaules commonly known as palm trees (owing to historical usage, the family is alternatively called Palmae). They are flowering plants, a family in the monocot order Arecales. Currently 181 genera with around 2600 species are known, most of them restricted to tropical and subtropical climates. Most palms are distinguished by their large, compound, evergreen leaves, known as fronds, arranged at the top of an unbranched stem. However, palms exhibit an enormous diversity in physical characteristics and inhabit nearly every type of habitat within their range, from rainforests to deserts.', " + R.drawable.family_arecaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "2, '', 'tree2', " +
//                "'Formerly called Gramineae, grass family of monocotyledonous flowering plants, a division of the order Poales. The tree2 are the worlds single most important source of food. They rank among the top five families of flowering plants in terms of the number of species, but they are clearly the most abundant and important family of the Earths flora. They grow on all continents, in desert to freshwater and marine habitats, and at all but the highest elevations. Plant communities dominated by grasses account for about 24 percent of the Earths vegetation. Grasses may be annual or perennial herbs, generally with the following characteristics (the image gallery can be used for reference): The stemsof grasses, called culms, are usually cylindrical (more rarely flattened, but not 3-angled) and are hollow, plugged at the nodes, where the leaves are attached. Grass leaves are nearly always alternate and distichous (in one plane), and have parallel veins. Each leaf is differentiated into a lower sheath hugging the stem and a blade with entire (i.e., smooth) margins. The leaf blades of many grasses are hardened with silicaphytoliths, which discourage grazing animals; some, such as sword grass, are sharp enough to cut human skin. A membranous appendage or fringe of hairs called the ligule lies at the junction between sheath and blade, preventing water or insects from penetrating into the sheath.', " + R.drawable.family_poaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "3, '', 'tree3', " +
//                "'The custard apple, or annona, family, the largest family of the magnolia order (Magnoliales) with 129 genera and about 2,120 species. The family consists of trees, shrubs, and woody climbers found mainly in the tropics, although a few species extend into temperate regions. Many species are valuable for their large pulpy fruits, some are useful for their timber, and others are prized as ornamentals. Bark, leaves, and roots of several species are important in folk medicine, and others are important sources of perfume and spice. Members of the family tree3 have simple leaves with smooth margins that are alternately arranged in two rows along the stems. The radially symmetrical flowers are usually bisexual. In most species the three sepals are united at the base. There are six brown, yellow, or greenish petals, many stamens in a spiral, and many pistils, each with a one-chambered ovary containing many ovules. The fruit is a berry. Flowers in some species are borne directly on large branches or on the trunk (cauliflorous). The leaves and wood are often fragrant.', " + R.drawable.family_annonaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "4, '', 'tree4', " +
//                "'Is a large family of mainly trees and shrubs with over a hundred different genera, thousands of species and a huge number of garden hybrids and cultivars. All species are woody, with essential oils, and flower parts in multiples of four or five. The leaves are evergreen, alternate to mostly opposite, simple, and usually with an entire (not toothed) margin. The flowers have a base number of five petals, though in several genera the petals are minute or absent. The stamens are usually very conspicuous, brightly coloured and numerous.', " + R.drawable.family_myrtaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "5, '', 'Fabaceae: Caesalpiniodeae', " +
//                "'The subfamily Caesalpinioideae (classified as a family, Caesalpiniaceae, by some authorities) is a heterogeneous group of plants with about 160 genera and some 2,000 species. The latest classifications show that this subfamily is the most basal lineage among the legumes and the one from which the other two subfamilies evolved. In that sense it is not a true monophyletic group, and it will undoubtedly be treated taxonomically in a different way in the future. Caesalpinioideae legumes are found throughout the world but are primarily woody plants in the tropics. Their moderate secondary invasion of temperate regions is mostly by herbaceous (nonwoody) evolutionary derivatives. The presence of Gleditsia triacanthos (honey locust) and of the related Gymnocladus dioica (Kentucky coffee tree) in temperate regions is a striking exception to this generalization, however, and they may represent more ancient and relictual lineages in the subfamily.', " + R.drawable.family_fabaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "6, '', 'Fabaceae: Mimosoideae', " +
//                "'The subfamily Mimosoideae (classified as a family, Mimosaceae, by some authorities) includes 82 genera and more than 3,200 species. Like Caesalpinioideae, Mimosoideae legumes are primarily woody plants of the tropics, and the few species native to temperate parts of the world are mostly herbaceous. The majority of Mimosoideae have large leaves that are divided into secondary (compound) leaflets, and in many these leaflets are again divided (bicompound) and have a feathery, sometimes fernlike appearance. A striking exception is that of most of the Australian acacias (but not of the American kinds) mentioned above, in which the compound leaves have become modified, losing all their leaflets and appearing to be undivided, or simple. The flowers of the family are radially symmetric and are usually most easily recognized by the long stamens that extend beyond the rest of the flower. The calyx and corolla are both valvate in bud, contrasting with the usual condition in both of the other subfamilies. The petals are small and often not noticed except by close examination. Many of these plants have nodules containing the nitrogen-fixing bacterium Rhizobium on their roots.', " + R.drawable.family_fabaceae_mimosoideae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "7, '', 'Fabaceae: Faboideae', " +
//                "'The subfamily Faboideae, also called Papilionoideae (classified as a family, Fabaceae or Papilionaceae, by some authorities), is the largest group of legumes, consisting of about 475 genera and nearly 14,000 species grouped in 14 tribes. The name of the group probably originated because of the flowers resemblance to a butterfly (Latin: papilio). It is the unique bilaterally symmetric (zygomorphic) flowers that especially characterize the group, so that thousands of species can be recognized as a member of Papilionoideae at a glance. The Lathyrus odoratus(sweet pea) flower provides an example. It has a large petal at the top, called the banner, or standard, that develops outside of the others before the flower has opened, two lateral petals called wings, and two lower petals that are usually fused and form a keel that encloses the stamens and pistil. The whole design is adapted for pollination by insects or, in a few members, by hummingbirds. Sweet nectar, to which the insects are cued by coloured petals, is the usual pollinator attractant. Various locking and releasing devices of the keel and wing petals control pollination in diverse ways favouring (or enforcing) either outcrossing or self-pollination—e.g., Trifolium (clover), Medicago (alfalfa), and Lotus corniculatus (birds-foot trefoil). The most effective kind of obligate self-pollination, however, is that of cleistogamous flowers, which do not open and thus prevent the entry of insects. Lespedeza and many other genera of Papilionoideae legumes bear both kinds of flowers, generally on the same plant. Enforced inbreeding serves to fix and maintain successful strains; outbreeding provides evolutionary diversity that may facilitate habitat or range expansion or may serve to provide flexibility for environmental changes.', " + R.drawable.family_fabaceae_faboideae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "8, '', 'Moraceae', " +
//                "'The mulberry family of the rose order (Rosales), with about 40 genera and some 1,000 species of deciduous or evergreen trees and shrubs, distributed mostly in tropical and subtropical regions. Plants of the family contain a milky latex and have alternate or opposite leaves and small, petalless male or female flowers. The fruits of many species are multiple because fruits from different flowers become joined together. Moracea can be found throughout the world with a cosmopolitan distribution. It is hypothesized that their cosmopolitan distribution is due to the breakup of Gondwana during the Jurassic period [10]. The majority of species can be found originating in the Old World tropics with emphasis in Asia and the pacific islands.', " + R.drawable.family_moraceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "9, '', 'Dipterocarpaceae', " +
//                "'Family of 16 genera and approximately 695 known species of mainly tropical lowland rainforest trees. The family name, from the type genus Dipterocarpus, is derived from Greek (di = two, pteron = wing and karpos = fruit) and refers to the two-winged fruit. The largest genera are Shorea, Hopea, Dipterocarpus, and Vatica. Many are large forest emergent species, typically reaching heights of 40–70 m, some even over 80 m (in the genera Dryobalanops, Hopea and Shorea), with the tallest known living specimen (Shorea faguetiana) 93.0 m tall. The species of this family are of major importance in the timber trade. Their distribution is pantropical, from northern South America to Africa, the Seychelles, India, Indochina, Indonesia and Malaysia. The greatest diversity of Dipterocarpaceae occurs in Borneo.[6] Some species are now endangered as a result of overcutting, extensive illegal logging and habitat conversion. They provide valuable woods, aromatic essential oils, balsam, resins and are a source for plywood.', " + R.drawable.family_dipterocarpaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "10, '', 'Meliaceae', " +
//                "'The dogbane family of flowering plants of the gentian order (Gentianales), including more than 415 genera and about 4,600 species of trees, shrubs, woody vines, and herbs, distributed primarily in tropical and subtropical areas of the world. Members of the family have milky, often poisonous juice; smooth-margined leaves; and flowers in clusters (rarely solitary). Some species, notably those in the subfamily Asclepiadoideae, have pollen massed in bundles called pollinia. The fruit may be berrylike or fleshy but usually is a dry pod (follicle) that splits open at maturity, releasing many winged or tufted seeds.', " + R.drawable.family_meliaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "11, '', 'Sapindaceae', " +
//                "'Mostly trees and shrubs, and tendril-bearing vines comprising about 140 genera and 1,500 species. The leaves are alternate, simple, or more commonly pinnately compound; stipules are absent except in the climbing forms. The flowers are small, actinomorphic or zygomorphic, and commonly functionally unisexual, although a given individual may bear seemingly bisexual flowers together with either male or female flowers. The perianth typically is biseriate, consisting of calyx and corolla. The calyx comprises 4 or 5 distinct or sometimes basally connate sepals. The corolla consists of 4 or 5 distinct petals or sometimes is absent. The petals commonly have basal appendages on the inner side. The stamens are distinct, often have hairy filaments, and in quantity usually are equal to or twice the number of calyx lobes. The gynoecium consists of a single compound pistil of usually 3 carpels, commonly an equal number of styles or style lobes, and a superior ovary usually with 3 locules, each containing 1 or 2 axile or axile-apical ovules. Most species have an extrastaminal, often asymmetrical nectary disk situated between the stamens and corolla.', " + R.drawable.family_sapindaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "12, '', 'Apocynaceae', " +
//                "'The dogbane family of flowering plants of the gentian order (Gentianales), including more than 415 genera and about 4,600 species of trees, shrubs, woody vines, and herbs, distributed primarily in tropical and subtropical areas of the world. Members of the family have milky, often poisonous juice; smooth-margined leaves; and flowers in clusters (rarely solitary). Some species, notably those in the subfamily Asclepiadoideae, have pollen massed in bundles called pollinia. The fruit may be berrylike or fleshy but usually is a dry pod (follicle) that splits open at maturity, releasing many winged or tufted seeds.', " + R.drawable.family_apocynaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "13, '', 'Rubiaceae', " +
//                "'Morphologically easily recognizable as a coherent group by a combination of characters: opposite leaves that are simple and entire (with the exception of several newly discovered compound-leaved species of Pentagonia), interpetiolar stipules, tubular sympetalous actinomorphic corollas and an inferior ovary. A wide variety of growth forms are present: shrubs are most common (e.g. Coffea, Psychotria), but members of the family can also be trees (e.g. Cinchona, Nauclea), lianas , or herbs. Some epiphytes are also present (e.g. Myrmecodia). The plants usually contain iridoids, various alkaloids, and raphide crystals are common. The leaves are simple, undivided, and entire; leaf blades are usually elliptical, with a cuneate base and an acute tip. In three genera (Pavetta, Psychotria, Sericanthe), bacterial leaf nodules can be observed as dark spots or lines on the leaves. The phyllotaxis is usually decussate, rarely whorled (e.g. Fadogia), or rarely alternate resulting from the suppression of one leaf at each node (e.g. Sabicea sthenula). Characteristic for the Rubiaceae is the presence of stipules that are mostly fused to an interpetiolar structure on either side of the stem between the opposite leaves. Their inside surface often bears glands called \"colleters\", which produce mucilaginous compounds protecting the young shoot. The \"whorled\" leaves of the herbaceous Rubieae tribe have classically been interpreted as true leaves plus interpetiolar leaf-like stipules. The inflorescence is a cyme, rarely of solitary flowers (e.g. Rothmannia), and is either terminal or axillary and paired at the nodes. The flowers are usually bisexual and usually epigynous.', " + R.drawable.family_rubiaceae));
//        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "14, '', 'Lamiaceae', " +
//                "'Formerly called Labiatae, the mint family of flowering plants, with 236 genera and more than 7,000 species, the largest family of the order Lamiales. Lamiaceae is distributed nearly worldwide, and many species are cultivated for their fragrant leaves and attractive flowers. The family is particularly important to humans for herb plants useful for flavour, fragrance, or medicinal properties. The alternate family name Labiatae refers to the fact that the flowers typically have petals fused into an upper lip and a lower lip (labia in Latin). The flowers are bilaterally symmetrical with five united petals and five united sepals. They are usually bisexual and verticillastrate (a flower cluster that looks like a whorl of flowers, but actually consists of two crowded clusters). Although this is still considered an acceptable alternative name, most botanists now use the name Lamiaceae in referring to this family. The leaves emerge oppositely, each pair at right angles to the previous one (decussate) or whorled. The stems are frequently square in cross section, but this is not found in all members of the family, and is sometimes found in other plant families.', " + R.drawable.family_lamiaceae));


//        // 1 - Arecaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 0, 'Manila palm', 'Adonidia merrillii', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 1, 'Martinez palm', 'Aiphanes caryotaefalia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 2, 'Bunga', 'Areca catechu', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 3, 'Kaong', 'Arengo pinnata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 4, 'Dumayaka', 'Arenga tremula', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 5, 'Ambong', 'Arenga undulatifolla', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 6, 'Palasan', 'Colomus merrillii', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 7, 'Pugahan', 'Caryota cumingil', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 8, 'Takipan', 'Caryota rumphiana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 9, 'Nilog', 'Cocos nucifero', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 10, 'Buri', 'Coryapha utan', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 11, 'Red palm', 'Cyrtostachys renda', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 12, 'Palmera', 'Dypsis lutescends', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 13, 'African oil palm', 'Elaeis guineensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 14, 'Date palm', 'Phoenix dactylifera', '', " + R.drawable.img_no_resource));

//        // 2 - tree2
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 0, 'Indian bamboo', 'Bambusa arundinacea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 1, 'Kawayan tinik', 'Bambusa blumeano', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 2, 'Bayog', 'Bambusa merrilliana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 3, 'Tigbi', 'Coix lachrymal-jobi', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 4, 'Laak', 'Bambusa philippinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 5, 'Merrill bamboo', 'Bambusa merrillii', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 6, 'Buddha bamboo', 'Bambusa tuldoides', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 7, 'Kawayan kiling', 'Bambusa vulgaris', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 8, 'Kawayan dilaw', 'Bambusa vulgaris', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 9, 'Giant Bamboo', 'Dendocaiamus asper', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 10, 'Bagto', 'Dinachiaa palawanense', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 11, 'Paragis', 'Eleusine indica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 12, 'Bikal', 'Dinachiaa acutifiora', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 13, 'Spineless indian bamboo', 'Bambusa tulda', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "2, 14, 'Amoseco', 'Chrysapogon aciculatus', '', " + R.drawable.img_no_resource));

////        3 - tree3
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 0, 'Bagang aso', 'Anaxagorea luzonensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 1, 'Atemoya', 'Annona atemoya', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 2, 'Guayabano', 'Annona muricata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 3, 'Anonas', 'Annona reticulata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 4, 'Atis', 'Annona squamosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 5, 'Ilang-ilang', 'Canaga odorato', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 6, 'Amuyong	', 'Goniothalamus mauyon', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 7, 'Takulau', 'Miliosa vidalil', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 8, 'Lanutan', 'Mitrephora lanotan', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 9, 'Anolang', 'Papualthia lanceolata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 10, 'Kalimatas', 'Phaeanthus ebracteolatus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 11, 'Bolon', 'Platymitra arborea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 12, 'Yellow lanutan', 'Polyalthia flava', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 13, 'Indian lanutan', 'Polyalthia longifolia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "3, 14, 'Biriba', 'Rollinia mucosa', '', " + R.drawable.img_no_resource));

//        // 4 - tree4
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 0, 'Binoloan', 'Acmena acuminatissima', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 1, 'Bagras', 'Eucalyptus deglupto', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 2, 'Swamp mahogany', 'Eucalyptus robusta', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 3, 'Guava', 'Psidium guajava', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 4, 'Kalubkob', 'Syzygium calubcob', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 5, 'Kurasam', 'Syzygium claviflorum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 6, 'Duhat', 'Syzygium cumini', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 7, 'Tampui', 'Syzygium jambos', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 8, 'Manangkil', 'Syzygium mananquil', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 9, 'Syzygium mananquil', 'Syzygium nitidum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 10, 'Syzygium nitidum', 'Syzygium samarangense', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 11, 'Pangloboein', 'Syzygium simile', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 12, 'Malatampoy', 'Syzygium xanthophyllum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 13, 'Malabayabas', 'Tristaniopsis decorticata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "4, 14, 'Mangkono', 'Xanthostemon verdugonianus', '', " + R.drawable.img_no_resource));

//        // 5 - Fabaceae: Caesalpiniodeae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 0, 'Duhat', 'Afzelia borneensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 1, 'Tindalo', 'Afzelia rhamboidea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 2, 'Amherstia', 'Amherstia nobilis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 3, 'Kulibangbang', 'Bauhinia acuminata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 4, 'Agpoi', 'Bauhinia integrifolla', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 5, 'Alibangbang', 'Bauhinia malabarica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 6, 'Fringon', 'Bauhinia monandra', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 7, 'Caballero', 'Caesalpinia pulcehrrima', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 8, 'Golden shower', 'Cassia fistulae', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 9, 'Yellow shower', 'Cassia fruticosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 10, 'Balitbitan', 'Cynometra ramifiara', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 11, 'Logwood', 'Haematoxylon campechianum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 12, 'Ipil', 'Instia Bijuga', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 13, 'Hankerchief tree', 'Maniltoa lenticellata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "5, 14, 'Akapulko	', 'Senna alata', '', " + R.drawable.img_no_resource));

//        // 6 - Fabaceae: Mimosoideae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 0, 'Acacia', 'Acacia  auriculifarmis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 1, 'Ayangile', 'Acacia confusa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 2, 'Mangium', 'Acacia mangium', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 3, 'Tanglin', 'Adenanthera intermedia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 4, 'Tanglin', 'Adenanthera pavonina', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 5, 'Akle', 'Albizia acle', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 6, 'Langil', 'Albizia lebbeck', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 7, 'Langil', 'Calliandra calathyrsus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 8, 'Pinkball', 'Calliandra portaricensise', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 9, 'Ipil-ipil', 'Leucaena leucocephala', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 10, 'Makahiya', 'Mimosa pudica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 11, 'Kupang', 'Parkia timoriana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 12, 'Kamachile', 'Pithecellobium dulce', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 13, 'Rain tree', 'Samanea saman', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "6, 14, 'Pinkado', 'Xylia xylocarpa', '', " + R.drawable.img_no_resource));

//        // 7 - Fabaceae: Faboideae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 0, 'Dhak', 'Butea monosperma', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 1, 'Indian rosewood	', 'Dalbergia latifolia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 2, 'Dapdap palong', 'Erythrina crista-galli', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 3, 'Dapdap', 'Erythrina variegata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 4, 'Payang-payang', 'Flemingia strobilifera', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 5, 'Dilang butiki', 'Centromesa pubescens', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 6, 'Chinese rosewood', 'Dalbergia conchinchinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 7, 'Katural', 'Sesbania grandiflora', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 8, 'Katural', 'Erythrina subumbrans', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 9, 'Kakaute', 'Gliricidia sepium', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 10, 'Bahai', 'Ormosia calavensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 11, 'Bani', 'Pongomia pinnata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 12, 'Smooth narra', 'Pterocarpus indicus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 13, 'Prickly narra', 'Ptecarpus indicus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "7, 14, 'Jade vine', 'Strongylodon macrobotrys', '', " + R.drawable.img_no_resource));
//
//        // 8 - Moraceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 0, 'Antipolo', 'Artocarpus blancoi', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 1, 'Nangka', 'Artocarpus heterophyllus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 2, 'Marang banguhan', 'Artocarpus odoratissimus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 3, 'Anubing', 'Artocarpus ovatus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 4, 'Paper mulberry', 'Broussanetia papyrifera', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 5, 'Panama rubber', 'Castilloa elastica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 6, 'Upling gubat', 'Ficus ampelas', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 7, 'Kataupi', 'Ficus punctata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 8, 'Basikong', 'Ficus botryocarpa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 9, 'Kalukoi', 'Ficus callosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 10, 'Indian rubber', 'Ficus elastica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 11, 'Kanapal', 'Ficus magnoliifolia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 12, 'Tibig', '(Ficus nota', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 13, 'Pakiling', '(Ficus nota', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "8, 14, 'Dungo', 'Ficus nervosa', '', " + R.drawable.img_no_resource));
//
//        // 9 - Dipterocarpaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 0, 'Palosapis', 'Anisoptera thurifera', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 1, 'Dagang', 'Anisoptera aurea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 2, 'Apitong', 'Dipterocarpus grandiflorus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 3, 'Hagakhak', 'Dipterocarpus validus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 4, 'Dalingdingan', 'Hopea foxworthyi', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 5, 'Saplungan', 'Hopea plagata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 6, 'Bagtikan', 'Parashorea malaanonan', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 7, 'Tiaong', 'Shorea ovato', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 8, 'Almon', 'Shorea almon', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 9, 'Yakal', 'Shorea astylosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 10, 'White lauan', 'Shorea contorta', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 11, 'Guijo', 'Shorea guiso', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 12, 'Red lauan', 'Shorea negrosensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 13, 'Mayapis', 'Shorea palosapis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "9, 14, 'Tanguile', 'Shorea polysperma', '', " + R.drawable.img_no_resource));
//
//        // 10 - Meliaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 0, 'Toona sureni', 'Aglaia edulis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 1, 'Bayanti', 'Aglaia rimosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 2, 'Kangko', 'Aphanamixis polystachya', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 3, 'Neem tree', 'Azadirachta indica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 4, 'Spanish cedar', 'Cedrela adorata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 5, 'Katong matsing', 'Chisocheton pendatus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 6, 'Kalimutain', 'Dysoxylum arborescens', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 7, 'Igyo', 'Dysoxylum goudichaudianum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 8, 'Kalibaian', 'Heynea trijuga', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 9, 'Lansones', 'Lansium domesticum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 10, 'Bagalunga', 'Melia dubia Cav.', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 11, 'Santol', 'Sandoricum kaetjape', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 12, 'Tara-tara', 'Dysoxylum cumingianum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 13, 'Kalantas', 'Toona calantos', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "10, 14, 'Danupra', 'Toona sureni', '', " + R.drawable.img_no_resource));
//
//        // 11 - Sapindaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 0, 'Philippine Maple', 'Acer laurinum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 1, 'Kubili', 'Cubilia cubili', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 2, 'Fern tree', 'Filicium decipens', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 3, 'Arangen', 'Ganophyllum falcatum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 4, 'Mamoko', 'Glenniea philippinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 5, 'Tamaho', 'Gloeocarpus patentivalvis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 6, 'Alahan', 'Guloo koelreuteria', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 7, 'Pospo', 'Lepisanthes tetraphylla', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 8, 'Alupag', 'Litchi chinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 9, 'Ambalag', 'Mischoscarpus pentapetalus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 10, 'Rambutan', 'Nephelium lappaceum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 11, 'Kapulasan', 'Nephelium rambutan', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 12, 'Malugai', 'Pametia pinnata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 13, 'Kusibeng', 'Sapindus saponaria', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "11, 14, 'Uas', 'Harpullia arborea', '', " + R.drawable.img_no_resource));
//
//        // 12 - Apocynaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 0, 'Batino', 'Alstonia macrophylla', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 1, 'Dita', 'Alsotonia scholaris', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 2, 'Chichirica', 'Catharanthus roseus', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 3, 'Kaliplip', 'Dischidia purpurea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 4, 'Hingiw', 'Ichnocarpus volubilis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 5, 'Laneteng gubat', 'Kibatalia gitingensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 6, 'Adelfa', 'Nerium aleander', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 7, 'Kalachuching puti', 'Plumera alba', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 8, 'Kalachuching pula', 'Plumera rubra', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 9, 'Alibutbut', 'Tabernaemontana mucronata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 10, 'Pandakaki', 'Tabernoemontana pandpcaqui', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 11, 'Yellow oleander', 'Thevetia peruviana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 12, 'Lanete', 'Wrigthia pubescens', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 13, 'Bayag usa', 'Voacanga globosa', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "12, 14, 'Shooting stars', 'Hoyoa multiflora', '', " + R.drawable.img_no_resource));
//
//        // 13 - Rubiaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 0, 'Ligad-ligad', 'Borreria articularis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 1, 'Landrina', 'Borreria acymoides', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 2, 'Malakape', 'Canthium diococcum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 3, 'Red rubia', 'Carphalea kikondron', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 4, 'Tadiang anuang', 'Canthium monstrosum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 5, 'Kape', 'Coffea arabica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 6, 'Rosal', 'Gardenia jas minoides', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 7, 'Balanigan', 'Gardenia longiflora', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 8, 'Hedyotis', 'Hedyotis biflora', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 9, 'Santan', 'Ixora chinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 10, 'Mayanman', 'Ixora longistipula', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 11, 'Ludek', 'Ludekia bernardoi', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 12, 'Nino', 'Morinda citrifolia', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 13, 'Kahoy dalaga', 'Mussaenda philippica', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 14, 'Bangkal', 'Nauclea orientals', '', " + R.drawable.img_no_resource));
//
//        // 14 - Lamiaceae
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 0, 'Atimla', 'Callicarpa magno', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 1, 'Kasupnagil', 'Cleodendrum macrostegium', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 2, 'Baguak', 'Clerodendrum minahassae', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 3, 'Gmelina', 'Gmelina arborea', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 4, 'Magilik', 'Premna cumingiana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 5, 'Alagau', 'Premna odorata', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 6, 'Teak', 'Tectona grandis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 7, 'Philippine teak', 'Tectona philippinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 8, 'Lagundi', 'Vitex negundo', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 9, 'Molave', 'Vitex parviflora', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 10, 'Lingo-lingo', 'Viticimpremna philippinensis', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 11, 'Dangula', 'Teijsmanniadendron ahernianum', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 12, 'Dangula', 'Callicarpa formosana', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 13, 'Pay-at', 'Cleodendrum macrostegium', '', " + R.drawable.img_no_resource));
//        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "14, 14, 'Music bush', 'Cleodendrum syphonanthus', '', " + R.drawable.img_no_resource));


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dropTable(TBL_FAMILY));
        db.execSQL(dropTable(TBL_TREES));

        onCreate(db);
    }

    private String dropTable(String table) {
        return "DROP TABLE IF EXISTS " + table;
    }

    // public classes;

    public static SQLiteDatabase getReadableSQL(Context ctx) {
        return getInstance(ctx).getReadableDatabase();
    }

    public static SQLiteDatabase getWritableSQL(Context ctx) {
        return getInstance(ctx).getWritableDatabase();
    }

    public static List<Tree> getFamilyTrees(Context ctx) {
        SQLiteDatabase db = getReadableSQL(ctx);
        List<Tree> list = new ArrayList<>();
        Cursor cursor = db.query(TBL_FAMILY, null, null, null, null, null, null, null);
        while (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));

            list.add(new Tree(id, commonName, scientificName, drawable));
        }
        return list;
    }

    public static Tree getFamilyTree(Context ctx, int familyType) {
        SQLiteDatabase db = getReadableSQL(ctx);

        Cursor cursor = db.query(TBL_FAMILY, null, "id =?", new String[]{String.valueOf(familyType)}, null, null, null);
        if (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));
            String description = cursor.getString(cursor.getColumnIndex("description"));

            return new Tree(id, commonName, scientificName, description, drawable);
        }

        cursor.close();
        return null;
    }

    public static void testDB(Context ctx) {

        String logString;
        SQLiteDatabase db = getReadableSQL(ctx);
//        Cursor cursor = db.query(TBL_TREES, null, "familyType =?", new String[]{String.valueOf(familyType)}, null, null, null);
        Cursor cursor = db.query(TBL_TREES, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int familyType = cursor.getInt(cursor.getColumnIndex("familyType"));
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String commonName = cursor.getString(cursor.getColumnIndex("commonName"));
            String scientificName = cursor.getString(cursor.getColumnIndex("scientificName"));
            String description = cursor.getString(cursor.getColumnIndex("description"));
            int drawable = cursor.getInt(cursor.getColumnIndex("drawable"));
//
//            logString = "familyType: " + familyType + "\nId: " + id +
//                    "\ncommonName: " + commonName + "\nscienfiticName: " + scientificName + "\n\n";

            logString = "description: " + description;
            Log.d(TAG, logString);
        }

    }
}
