package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class Araceae {
    
    public static void insert(SQLiteDatabase db){
        // 0 - Araceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 0, 'Gabing tigre', 'Alocasia zebrina', " +
                "'Alocasia Zebrina is a genus of broad-leaved rhizomatous or tuberous perennials from the family Araceae. There are 79 species,  native to tropical and subtropical Asia to Eastern Australia, and widely cultivated elsewhere. The large cordate or sagittate leaves grow to a length of 20 to 90 cm on long petioles. Their araceous flowers grow at the end of a short stalk, but are not conspicuous; often hidden behind the leaf petioles. The stem (a corm) is edible, but contains raphid or raphide crystals of Calcium oxalate along with other irritants (possibly a protease)  that can numb and swell the tongue and pharynx resulting in difficult breathing, and sharp throat pain. The lower parts contain more of the poison. Prolonged boiling before serving or processing may reduce the risks but acidic fruit such as tamarind may dissolve them.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 1, 'Devils tongue', 'Amorphophophallus konjac', " +
                "'Konjac is a common name of the Asian plant Amorphophallus konjac (syn. A. rivieri), which has an edible corm (bulbo-tuber). It is also known as konjaku, konnyaku potato, devils tongue, voodoo lily, snake palm, or elephant yam(though this name is also used for A. paeoniifolius). It is native to Yunnan in China and cultivated in warm subtropical to tropical eastern Asia, from Japan and China south to Indonesia (USDA hardiness zone 6-11). It is a perennial plant, growing from a large corm up to 25 cm (10 in) in diameter. The single leaf is up to 1.3 m (4 ft) across, bipinnate, and divided into numerous leaflets.  The flowers are produced on a spathe enclosed by a dark purple spadix up to 55 cm (22 in) long. The food made from the corm of this plant is widely known in English by its Japanese name, konnyaku (yam cake), being cooked and consumed primarily in Japan. The two basic types of cake are white and black. Noodles are made from konnyaku, known as shirataki.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 2, 'Lusegut', 'Amydrium medium', " +
                "'Slender bole climber exhibiting leaf dimorphism - leaves of seedlings or juvenile plants differ from those of the adult plants; adult foliage often developing only when the vine has found support on a tree trunk. Leaves greyish green to green, ovate, leaf blade entire or dissected, often with perforations; both types of leaves often present on the same vine. Leaves green to dark green, deeply leaf blade with perforations along rachis. Its singly borne, erect spadix is 3–6 by 1.5 cm, enclosed within an about 5 cm-long, white spathe that reflexes and sheds.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 3, 'Corazon de Maria', 'Caladium bicalor)', " +
                "'Caladium is a genus of flowering plants in the family Araceae. They are often known by the common name elephant ear (which they share with the closely related genera Alocasia, Colocasia, and Xanthosoma), Heart of Jesus, and Angel Wings. There are over 1000 named cultivars of Caladium bicolor from the original South American plant.\n" +
                "The genus Caladium includes seven species that are native to South America and Central America, and naturalized in India, parts of Africa, and various tropical islands.[1] They grow in open areas of the forest and on the banks of rivers and go dormant during the dry season. The wild plants grow to 15–35 inches (40–90 cm) tall, with leaves mostly 6-18 inches (15–45 cm) long and broad.\n', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 4, 'Dumb cane', 'Dieffenbachia amoena', " +
                "'Dieffenbachia amoena are highly decorative foliage plants, that grows up to 1m (3 feet) tall indoors. Their thick, cane-like and unbranched stems carry rather soft and fleshy leaves on sturdy, sheathed stalks. Dieffenbachia seguine has oval leaves 25cm (10 inch) long and 10cm (4 inch) wide on 10cm (4 inch) long stalks. The leaves generally spread outward and arch slightly downward.  They are interestingly marked in green, yellow and white. As it age, some of the lower leaves dry up and fall off or may be pulled off leaving behind a scarred stem, which gradually lengthens. But the bare stem is likely to be at least partially hidden by the thick crown of downward arching leaves. Calla-type flowers followed by red berries rarely appear on indoor plants. ', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 5, 'Amiong', 'Epipremnum pinnatum', " +
                "'Epipremnum elegans is a climbing plant, sometimes epiphytic. A vigorous plant, capable of producing stems 30 - 50 meters long, it can grow high into the canopy of trees with a stem 2 - 4cm in diameter that can attach itself by means of aerial roots. The plant is often harvested from the wild for local medicinal use and is also sometimes cultivated for this purpose. The leaves are regularly sold in local markets, especially in Singapore, for medicinal use. The plant is often grown as an ornamental, valued especially for its attractive pinnatifid adult leaves.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 6, 'Tibatib', 'Epipremnum pinnatum', " +
                "'Epipremnum Pinnatum is a stout vine climbing on tree trunks, reaching a height of 5 to 6 meters. Leaves are oblong-ovate, up to 60 centimeters long, pinnately cleft almost to the midrib into 7 to 12 pairs of lanceolate, acuminate, falcate, 1-nerved lobes, 12 to 20 centimeters long, 2 to 5 centimeters wide. Spathes are several, terminal, white or greenish, in flower about 15 centimeters long and deciduous. Spadix is green, dense, cylindric, nearly or as long as the spathe, 2 to 2.5 centimeters thick in flower, thicker in fruit. Fruit is a greenish berry with a few seeds embedded in an orange-red pulp.', " +
                R.drawable.img_no_resource));
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 7, 'Alopayi', 'Homolomena philippinensis', " +
                "'Homalomena philippinensis is a perennial plant producing clusters of large, heart-shaped leaves from an underground corm. The plant grows about 1 meter tall. The large leaves are gathered from the wild and used for wrapping food. The plant also has local medicinal uses.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 8, 'Pakpak paniki', 'Philodendron lacerum', " +
                "'Can grow as an epiphyte or hemiepiphyte climber, succulent and vigorously growing. Multi-lobed leaf margins, leaf blade can measure up to 50 cm long and 20 cm wide. Spathe dull red on the outside and purple on the inside, blade green-yellow.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 9, 'Bolong kahinal', 'Photoidium lobbianum', " +
                "'Pothoidium lobbianum is a climbing shrub. The plant is harvested from the wild for its fiber, which is used locally. The fiber is sometimes sold in considerable quantities in local markets in the Philippines. Although no specific mention has been seen for this species, it belongs to a family where most of the members contain calcium oxalate crystals. This substance is toxic fresh and, if eaten, makes the mouth, tongue and throat feel as if hundreds of small needles are digging in to them. However, calcium oxalate is easily broken down either by thoroughly cooking the plant or by fully drying it and, in either of these states, it is safe to eat the plant.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 10, 'Dugtong-ahas', 'Photos hermaphroditus', " +
                "'Dugtong-ahas is a woody vine. Leaves are oblong or obovate-lanceolate, 7 to 10 centimeters long, pointed at both ends. Flowers are small, white and clustered. Fruit is very long and slender, 15 to 20 centimeters in length, smooth, very narrowed between seeds. Seeds are about a centimeter long, sharply pointed at one end and crowned on the other end with numerous white hairs about 2.5 centimeters long.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 11, 'Yellow water plant', 'Scindapsus aureus', " +
                "'Scindapsus aureus ‘Marble Queen’ has large, glossy, heart-shaped leaves of green marbled with cream, are a feature if this indoor plant. Train up a totem pole or grow in a hanging basket or decorative pot to best display its attractive foliage. The leathery, shiny-surface, hart-shaped leaves are arranged alternately on 5-8cm (2-3 inch) long leaf-stalks. Flowers are not produced indoors. Scindapsus aureus ‘Marble Queen’ is closely related to heart-leaf philodendron, which it resembles. Scindapsus aureus ‘Marble Queen’ can be trained to grow upright on stales, wires or strings. they also can be encouraged to use their aerial roots to support themselves on stabs of rough tree bark as long as the bark is kept constantly moist. Or they can trail down from either, pots or hanging baskets.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 12, 'Kamay kastila', 'Syngonium podophyllum', " +
                "'Syngonium podophyllum is an evergreen climbing plant producing stems 10 - 20 meters long that support themselve on tree trunks by means of adventitious roots. The leaves vary greatly as the plant ages. When young they have the shape of an arrowhead, but as they mature this changes and lobes develop at the base of the leaves. The older the plant is, the more lobes the full-sized leaves will have. The plant is harvested from the wild for local use as a medicine. It is often grown as an ornamental and ground cover plant in tropical gardens, being valued for its attractive flowers and foliage, and also as a houseplant in cooler areas, where it seldom flowers. Forms with variegated foliage have been developed as ornamentals.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 13, 'Gabing nuno', 'Typhonium trilobatum', " +
                "'Typhonium angustilobum is a herbaceous perennial plant producing leaves up to 40cm long from a tuberous rootstock. Although poisonous, the root was a traditional food of the Australian Aborigines - it is little used nowadays.', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "0, 14, 'Yautia', 'Xanthosoma violaceum', " +
                "'Is a perennial plant producing arrow-shaped leaves from a short, thick underground rhizome. The leaves are 20 - 50cm long on petioles 30 - 70cm long. The plant is often cultivated for its edible roots and leaves in parts of the tropics. All parts of the plant contain calcium oxalate crystals. This substance is toxic fresh and, if eaten, makes the mouth, tongue and throat feel as if hundreds of small needles are digging in to them. However, calcium oxalate is easily broken down either by thoroughly cooking the plant or by fully drying it and, in either of these states, it is safe to eat the plant. People with a tendency to rheumatism, arthritis, gout, kidney stones and hyperacidity should take especial caution if including this plant in their diet.', " +
                R.drawable.img_no_resource));
    }
}
