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
                "'Annual herbs, stiff hairy, branches 3-25 cm long. Stem: thickened at nodes, angles hairy, purple tinged. Leaves: sub-sessile, attenuate at base, 0.9-3.9 x 0.3-1.4 cm, glabrous abaxially, scabrid-pubescent adaxially, veins prominent abaxially, apex acute, margins scabrid. Flowers: sessile, 4-6 in a stipular cup; bracts lanceolate-subulate, hyaline; calyx 4-lobbed, tube narrowly campanulate, teeth reflexed nearly as long as the tube, linear-lanceolate, hairy abaxially, acute, pointed; corolla pinkish, infundibuliform; tube hairy within at base, hairs in a ring; lobes oblong, acute, bristly on the back near the tip; stigma bifid. Fruits: capsules oblong, 0.2-0.3 cm long, apiculate. Seeds: finely granulate. Flowers appears during August-January and fruits appears in May.', " +
                "'Commonly found and grows during rainy season throughout the plains in waste-places and cultivated fields.', " +
                "'Not known', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 1, 'Landrina', 'Borreria acymoides', " +
                "'Spermacoce ocymoides is an erect or spreading, well-branched annual plant with slender stems; it can grow 25 - 60cm tall. The plant is harvested from the wild for local medicinal use.', " +
                "'Waste places, disturbed soil, along canals and marshes, in grassy fields and along roads; at elevations from sea-level up to 650 - 1,400 meters.', " +
                "'The plant has become naturalized in areas outside its native range. The dried leaves smell strongly of coumarin.', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 2, 'Malakape', 'Canthium diococcum', " +
                "'Malakafe is an unarmed, smooth shrub 3 to 4 meters or more in height. Leaves are extremely variable, ovate, elliptic, ovate or somewhat rounded, 5 to 15 centimeters long, 1.5 to 10 centimeters wide, leathery, shining above, and usually pointed at both ends. Flowers are white, with very slender stalks, 5 to 10 millimeters long, and borne in compressed, short-stalked cymes. Calyx is cut off at the end or obscurely toothed. Corolla is bell-shaped, with a 4- to 6-millimeter tube, and five somewhat pointed lobes. Fruit is rounded, ellipsoid or obovoid, 6 to 10 millimeters long, slightly flattened and obscurely 2-lobed.', " +
                "'Primary forests at low altitudes.', " +
                "'The tree can be coppiced.', " +
                "'The wood is hard and used for building poles and tool handles. The wood can be used for fuel and for making charcoal.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 3, 'Red rubia', 'Carphalea kikondron', " +
                "'Growth Form: Tropical shrub, up to 3 m or more in height if not restrained. Leaves mostly opposite, sometimes whorled, 10 cm by 5 cm, green with protruding veins. Interpetiolar stipules present. Woody stems, leaf petioles 2 cm long, red hue. Blooms in large bunches, 10 - 20 cm across, bright red calyx enlarged and unequal (1 lobe is more enlarged than the others). Inflorescence terminal, in a corymb-like thyrse. Flowers bisexual, tubular, white and 4 - petaled, inconspicuous from far. Heterostylous, flowers have either long or short styles. Flowers lifespan up to months. Fruits are indehiscent and nut-like. ', " +
                "'Moist forest and forest edges.', " +
                "'Prune often to promote bushiness and flowering. Plants flowers best under full sun. Ensure plant in a well-drained soil, rich in organic matter.', " +
                "'Not Known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 4, 'Tadiang anuang', 'Canthium monstrosum', " +
                "'Canthium coromandelicum is a more or less thorny, evergreen shrub or small tree. The plant is a commonly used medicinal herb and functional food in India and Sri Lanka. It is harvested from the wild for local use and is also sometimes sold in local markets.', " +
                "'Dry regions in coastal scrub forests and laterite.', " +
                "'Not known', " +
                "'The branches are used for fencing. The grey wood is hard and close-grained. It is used in turning.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 5, 'Kape', 'Coffea arabica', " +
                "'Coffeea arabica  is a globose, evergreen plant. It is usually found as a compact shrub 1.5 - 3 meters tall, though in time, if not pruned bak, is able to become a small tree growing 3 - 10 meters tall with a spreading crown. The bole can become up to 8cm in diameter. One of the most common drinks in the world, its seeds have long been valued for their stimulating qualities. The plant is widely cultivated in many tropical regions for this seed, which is roasted to make the drink. The plant is also often grown as an ornamental in gardens. There are some named varieties.', " +
                "'An understory tree in high elevation humid forests.', " +
                "'In equatorial regions, the plant can be grown at elevations from 1,300 to 2,800 meters, with 1,500 - 1,900 meters being most common. The minimum elevation reduces to about 500 meters at a latitude around 15Â°N or S, whilst in the subtropics it can be grown from sea level to 1,000 meters.  It grows best in areas where annual daytime temperatures are within the range 14 - 28Â°c, but can tolerate 10 - 34Â°c. It prefers a mean annual rainfall in the range 1,400 - 2,300mm, but tolerates 750 - 4,200mm. With too much rainfall the plant tends to develop wood at the expense of flowers and fruits. One to 2 months of less than 50mm rain facilitates uniform flowering. Heavy rain during and after harvest is not desirable. Prefers a position in light shade. Shading improves leaf and shoot growth but reduces root growth. Prefers a deep friable soil on undulating land. Plants are unsuited to stiff clay or sandy soils, but are considered tolerant of acid soils. Prefers a pH in the range 5.5 - 7, tolerating 4.3 - 8.4. Plants can begin to bear within 2 - 3 years and are in full bearing at the age of 6 - 8 years. The optimum yield of clean dry coffee beans is 2- 3 tonnes/ha, which has been obtained in Kenya. The average yields are about 0.5 tonnes/ha in Brazil and 0.9 tonnes/ha in Africa. Coffee plants can produce economic yields for 30 - 40 years on average, though this can vary from 10 - 70 years and plants of 80 - 100 years are known. The plant is tetraploid, and over 30 mutations have been recognized. In the bisexual flowers, pollen is shed shortly after the flower opens, and the stigma is receptive immediately. Self-pollination can occur, as seed sets even when the flowers are bagged. Pollination is also by honeybees, which collect nectar and pollen from the flowers.', " +
                "'Coffelite, a type of plastic, is made from coffee beans. Coffee, with iodine, is used as a deodorant. The seeds contain caffeine, which has been described as a natural herbicide. It selectively inhibits germination of the seeds of Amaranthus spinosus. The bark can be made into pulp and parchment, or used as manure and mulches. The whitish wood is hard, dense, heavy, tough, durable and takes a polish well. It is suitable for tables, chairs and turnery.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 6, 'Rosal', 'Gardenia jas minoides', " +
                "'Gardenia is an evergreen shrub or small tree that can grow up to 12 meters tall, but is usually much shorter.  It produces heavily fragrant flowers over a long period of the year. Widely grown in the tropics, subtropics and warm temperate areas as an ornamental plant, it is also cultivated in Indian gardens, in Central and S China and in the Pacific islands for its various uses.  The essential oil is traded internationally, whilst the dye from the fruit is traded locally.', " +
                "'Thickets and forests at stream sides, on mountain slopes, on hills, or in valleys and fields at elevations of 10 - 1,500 meters.', " +
                "'Originally a species from warm temperate climates, in tropical areas it grows well, at altitudes of 400 - 1,200 meters. It flowers poorly or not at all in tropical lowland areas. Prefers an acidic soil rich in organic matter. Prefers a sunny position.  Grows best in a moist but well-drained soil with a pH in the range 6 – 7. Seedling plants can commence flowering when 1 year old.', " +
                "'An essential oil is extracted from the flowers. It is used in perfumery. It is the base of Gardenia perfumes, blending with Jasmine (Jasminum spp) and Tuberose (Polianthes tuberosa). It is also blended with synthetic oils. About 3 - 4,000 kg of flowers produce 1 kg concrete and 500gr absolute oil. The fragrance of the essential oil is mainly due to the presence of styrene acetate. The fruits are the source of a yellow dye.  Mainly used as a coloring for food, occasionally textiles are dyed yellow or scarlet, although the color is rather impermanent. The colouring matter in the fruits contains a glycoside, which is identical with crocetin from saffron (Crocus sativus). This carotenoid pigment can be extracted from cape jasmine in larger quantities than from saffron, and without the accompanying flavors, this has led to the development of gardenia extracts as a pigment source.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 7, 'Balanigan', 'Gardenia longiflora', " +
                "'Morinda longiflora is an evergreen climbing plant. The roots are the source of a dye.', " +
                "'Rainforests.', " +
                "'Not known', " +
                "'From the root bark of Morinda longiflora G.Don the red anthraquinone colorants 1-methylether-alizarin and rubiadin have been isolated.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 8, 'Hedyotis', 'Hedyotis biflora', " +
                "'Hedyotis capitellata is a perennial plant with stems up to 2 meters long that become more or less woody and sometimes persist. The stems do not always support themselves well, the plant often scrambling over the ground or climbing into the nearby vegetation. The plant is harvested from the wild for local use as a medicine.', " +
                "'A common climber over bushes and hedges up to 1,200 meters. Broad-leaved forests in valleys, sunny mountain slopes; at elevations around 1,500 meters in Yunnan.', " +
                "'Not known', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 9, 'Santan', 'Ixora chinensis', " +
                "'Ixora chinensis is a multi-stemmed, erect, evergreen shrub growing up to 2 meters tall, but more commonly less than 1 meter. The plant is harvested for local medicinal use. It is widely cultivated as an ornamental, valued especially for its long-lasting flowers.', " +
                "'River banks. Thickets and sparse forests.', " +
                "'Succeeds in full sun and in partial shade. Grows best in a humus-rich, moist but well-drained soil.', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 10, 'Mayanman', 'Ixora longistipula', " +
                "'Ixora macrantha is an evergreen shrub or small tree growing up to 6 meters tall. The plant is sometimes harvested from the wild for local use as a dyestuff.', " +
                "'Humid forests in the mountains at elevations of 1,000 - 1,700 meters.', " +
                "'Succeeds in full sun and in partial shade. Grows best in a humus-rich, moist but well-drained soil.', " +
                "'The pulverised roots and twigs are used to give a red or reddish-brown color to basket work. A decoction of the twigs is used for dyeing rattan. The root sap is used for dyeing matting and basketry red.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 11, 'Ludek', 'Ludekia bernardoi', " +
                "'Picria fel-terrae is an annual herb, growing up to 1 meters tall, though often smaller Its stems are laxly branched, erect or prostrate and often rooting at the nodes. Harvested from the wild for its use in traditional medicine, the plant is also often cultivated in gardens and sold fresh on the markets in Indo-China and China.', " +
                "'A rare to rather common herb, occurring on forest slopes, or shady forest edges, from sea-level up to 900 meters.', " +
                "'Not known', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 12, 'Nino', 'Morinda citrifolia', " +
                "'Morinda coreia is an evergreen shrub or small tree that can grow from 5 - 10 meters tall. The bole is short and crooked. The plant has been extensively cultivated in India for the dye obtained from the root bark. It is a popular medicinal plant in Thailand, where it is often gathered from the wild, and is also a local source of timber.', " +
                "'Usually found in dry forests in India and Sri Lanka.', " +
                "'Not known', " +
                "'A dye obtained from the root bark is used for coloring linen and woollen goods. The bark of the root is used for dyeing items red or yellow. The morindone dye obtained from the root bark is sold under the trade name SuranjiF. It is used for dyeing cotton, silk and wool in shades of red, chocolate or purple. The coloring matter is found principally in the root bark and is collected when the plants reach three to four years of age. The fruit can be fermented with molasses to make a liquid manure. The handsome wood can be red or yellow with red streaks. It is moderately hard, close-grained and durable. It is used for plates and dishes.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 13, 'Kahoy dalaga', 'Mussaenda philippica', " +
                "'Mussaenda ferruginea is a scandent shrub that can grow from 3 - 6 meters tall, sometimes forming dense masses around tree trunks. The plant is harvested from the wild for local use as a medicine.', " +
                "'Rain forests, especially in clearings.', " +
                "'Not known', " +
                "'Not known', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "13, 14, 'Bangkal', 'Nauclea orientals', " +
                "'Yellow cheesewood varies in size from a medium-sized to a tall, well formed, evergreen tree up to 30 meters tall. The straight, cylindrical bole is unbuttressed, it can be unbranched for up to 20 meters and has a diameter of up to 1 meter. The tree is valued mainly for its wood, which is traded commercially. It is also harvested from the wild for its edible fruit and for local medicinal use. The tree is cultivated in Sri Lanka for medicinal use. Yellow cheesewood is a beautiful tropical garden plant and excellent shade tree.', " +
                "'Occurs in a variety of vegetation types from sparse rheophyte shrublands to tall well-developed gallery rainforest where it reaches its best development. Occurs along the major rivers in the interior of the Peninsula, or at least near rivers.', " +
                "'A plant of the moist tropical lowlands, where it is found at elevations from sea level to 500 meters. It grows best in areas where annual daytime temperatures are within the range 30 - 40Â°c, but can tolerate 15 - 45Â°c.  It prefers a mean annual rainfall in the range 1,000 - 3,500mm, but tolerates 800 - 3,800mm. Succeeds in most soils, though it prefers alluvial soils along stream banks. Best grown in medium loam, clay loam and always preferring semi-shaded conditions. Prefers a pH in the range 5.5 - 6.5, tolerating 5 - 7.5. Plants can tolerate seasonal inundation of the soil. ', " +
                "'The wood was shown to be toxic to the termite Cryptotermes domesticus under laboratory conditions. The heartwood is yellowish or orange, it is soft and easily cut but not durable when exposed to the weather. The wood can be used for framing and internal flooring and other uses not exposing it to the weather. Easily carved, it can be used for novelties where a timber with distinctive color is desirable.', " +
                R.drawable.img_no_resource));

    }
}
