package com.pwu.itree.data.trees;

import android.database.sqlite.SQLiteDatabase;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;

import static com.pwu.itree.data.DatabaseHelper.TBL_TREES;
import static com.pwu.itree.data.DatabaseHelper.TBL_TREES_ROW;
import static com.pwu.itree.data.DatabaseHelper.insertQuery;

public class tree1 {

    public static void insert(SQLiteDatabase db) {

        db.execSQL(insertQuery(DatabaseHelper.TBL_FAMILY, DatabaseHelper.TBL_FAMILY_ROW, "1, '/Ar-e-ca-ce-ae/', 'Arecaceae', " +
                "'Botanical family of perennial trees, climbers, shrubs, and acaules commonly known as palm trees (owing to historical usage, the family is alternatively called Palmae). They are flowering plants, a family in the monocot order Arecales. Currently 181 genera with around 2600 species are known, most of them restricted to tropical and subtropical climates. Most palms are distinguished by their large, compound, evergreen leaves, known as fronds, arranged at the top of an unbranched stem. However, palms exhibit an enormous diversity in physical characteristics and inhabit nearly every type of habitat within their range, from rainforests to deserts.', " + R.drawable.family_arecaceae));


        // 1 - Arecaceae
        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 0, 'Manila palm', 'Adonidia merrillii', " +
                "'description Adonidia merrillii is an evergreen, single-stemmed palm tree that grows about 6 meters tall. The straight, cylindrical, unbranched stem is around 15 - 21cm in diameter, topped by a compact crown of about a dozen arched, pinnate leaves about 1.5 meters long. The plant is harvested from the wild for local use as a masticatory and source of beads. It is often grown as an ornamental in tropical gardens, and as a pot plant in cooler areas. ', " +
                "'Coastal areas, growing in open forest on steep limestone slopes. ', " +
                "'The plant is very cold sensitive and can only be grown outdoors in genuinely tropical climates. Grows best in full sun.  Succeeds in most soils so long as they are not water-logged. Requires a moist but well-drained soil. A fast-growing plant. The plant is very susceptible to lethal yellowing disease. ', " +
                "'The brown seed is marked by a network of light grooves. It is used, generally in combination with other seeds, to make ornamental necklaces. ', " +
                R.drawable.tree_arecaceae_manilapalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 1, 'Martinez palm', 'Aiphanes caryotaefalia', " +
                "'description Aiphanes is a genus of spiny palms which is native to tropical regions of South and Central America and the Caribbean. There are about 26 species in the genus (see below), ranging in size from understorey shrubs with subterranean stems to subcanopy trees as tall as 20 meters (66 ft). Most have pinnately compound leaves (leaves which are divided into leaflets arranged feather-like, in pairs along a central axis); one species has entire leaves. Stems, leaves and sometimes even the fruit are covered with spines. Plants flower repeatedly over the course of their lifespan and have separate male and female flowers, although these are borne together on the same inflorescence. Although records of pollinators are limited, most species appear to be pollinated by insects. The fruit are eaten by several birds and mammals, including at least two species of amazon parrots. ', " +
                "'Moist limestone forests. ', " +
                "'Fruits are produced in great quantities, several on the lower part of each branch of the axis. They are slightly broader than long, whitish green when immature, turning to shiny bright red. Plants can flower and produce fruit probably throughout the year. ', " +
                "'None known. ', " +
                R.drawable.tree_arecaceae_martinez));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 2, 'Bunga', 'Areca catechu', " +
                "'description  Is an evergreen single-stemmed palm tree that can grow up to 30 meters tall but is more commonly around 15 meters. The straight, unbranched stem can be 25 - 40cm in diameter, topped by leaves up to 2 meters long. Originally native to the Philippines, the plant is now widely cultivated in the tropics of eastern Asia for its seed, which is used as a mildly narcotic stimulant. The plant also supplies a range of other useful products including thatch, fiber, oil and medicinal applications. It is sometimes grown as an ornamental. ', " +
                "'An understory plant of tropical, high rainfall forests, from sea level to 1,000 meters or more. ', " +
                "'Plants succeed in moist tropical climates where temperatures never fall below 10°c, the average annual rainfall is 1,500mm or more and the driest month has 25mm or more rain. Prefers a mean annual rainfall in the range 1,500 - 5,000mm, evenly distributed through the year. Although tolerant to moderate elevations on mountains, it generally does best at low elevations, especially near the coast. Prefers a moist, well-drained soil and a position in full sun. Being a shade-loving species, the betel palm always does well when grown as a mixed crop with fruit trees. Prefers a pH in the range 5.5 - 6, tolerating 4.5 - 6.8. Plants are drought sensitive. Trees can commence bearing fruit in 6 - 10 years from seed. Trees can flower throughout the year. The sweet-scented male flowers are visited by bees and other insects for nectar, but insects have not been observed visiting the female flowers. It is thought that most of the flowers are wind pollinated. ', " +
                "'The leaves are used for thatching. In some parts of Sri Lanka the chief vessels used for carrying water are made from the leaves of this graceful palm, which, being of leather-like consistency, are easily converted into strong and durable water buckets. The leaf sheath is made into cups, plates, and bags for holding plantains, sweetmeats, and fish. The flower sheath is made into skullcaps, small umbrellas, and dishes. 	The husk fibers are predominantly composed of cellulose with varying proportions of hemi-cellulose, lignin, pectin and protopectin. Based on various tests, it has been proposed that the husk fiber could be used in making such items as thick boards, fluffy cushions and non-woven fabrics. Trial experiments have shown that satisfactory yield and quality of brown wrapping paper could be prepared from blends of areca nut and bamboo or banana pseudostem pulp. ', " +
                R.drawable.tree_arecaceae_bungapalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 3, 'Kaong', 'Arengo pinnata', " +
                "'description Is a single-stemmed, unarmed, monoecious feather palm growing 7 - 20 meters tall. The unbranched stem can be 30 - 65cm in diameter; it is clothed near the top with the fibrous sheaths of dead leaves; and topped by a crown of large leaves. A multipurpose tree, it is commonly grown in tropical Asia because of its year-round food production and many other uses. It is especially useful since it provides a source of food in the dry season when other food is scarce. Its most popular product is its sap, obtained from the flowering stems. ', " +
                "'Usually found close to human settlements, often as a result of human activity. Otherwise it prefers secondary forest at the border of primary rainforests. Often found on sites poor in nutrients and mesic sites such as denuded hillsides. ', " +
                "'A plant of the moist, lowland tropics, where it is found at elevations up to 1,400 meters. It grows best in areas where annual daytime temperatures are within the range 22 - 28°c, but can tolerate 16 - 32°c. It prefers a mean annual rainfall in the range 3,000 - 3,500mm, but tolerates 2,000 - 4,000mm. Prefers a deep fertile moisture-retentive but well-drained soil. Plants grow well in full sun, even when small. ', " +
                "'The leaf sheath is a source of a tough, black fiber (gomuti or yonot fiber). It is not pliable enough to be used for purposes such as running rigging, but is very strong and durable and used chiefly for making cables and a very strong rope that is tolerant of both fresh and salt water and of fire; it is used for marine work, thatching, upholstery and brushes. The hairs found on the base of the leaf sheaths are very good tinder for igniting fire. The fiber, placed in the bottom of a vessel, is useful for filtering water of its physical impurities. At the base of the leaves there is a woolly material used in caulking ships and stuffing cushions. Old woody leaf bases, as well as the long leaves, can be used for fuel. ', " +
                R.drawable.tree_arecaceae_kaongpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 4, 'Dumayaka', 'Arenga tremula', " +
                "'description Arenga tremula is a cluster-forming, evergreen palm growing up to 4 meters tall. The unbranched stems can be 8 - 12cm in diameter, crowned by a rosette of about 6 leaves. The plant is harvested from the wild for local use as a food and source of materials. All species in this genus have either recognized or potential ornamental value. ', " +
                "'Lowland areas in primary rainforest, only rarely in secondary growth areas. ', " +
                "'Individual stems do not flower until they are mature. A flowering shoot is produced from each node on the stem, commencing with the node at the top of the plant and working down to the base. Vegetative growth ceases when the first flowering shoot is produced, and the stem dies once flowers have been produced from the basal node. Multi-stemmed species, such as this one, usually produce new stems and so the plant does not die when individual stems die. ', " +
                "'The leaves are used for thatching and wickerwork. The petioles and midribs are used to make baskets. ', " +
                R.drawable.tree_arecaceae_redpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 5, 'Ambong', 'Arenga undulatifolla', " +
                "'description Arenga undulatifolia is a cluster-forming, evergreen palm growing 4 - 8 meters tall. The unbranched stems can be 20cm in diameter, crowned by a rosette of about 10 leaves. The plant is harvested from the wild for local use as a food and source of materials. All species in this genus have either recognized or potential ornamental value. ', " +
                "'Primary rainforest, only rarely in secondary growth areas, at elevations up to 1,500 meters. ', " +
                "'Individual stems do not flower until they are mature. A flowering shoot is produced from each node on the stem, commencing with the node at the top of the plant and working down to the base. Vegetative growth ceases when the first flowering shoot is produced, and the stem dies once flowers have been produced from the basal node. Multi-stemmed species, such as this one, usually produce new stems and so the plant does not die when individual stems die. ', " +
                "'The leaves are used for thatching and wickerwork. The petioles and midribs are used to make arrows for blowpipes. Plugs for blowpipe darts are made from the pith of the petiole. ', " +
                R.drawable.tree_arecaceae_ambongpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 6, 'Palasan', 'Colomus merrillii', " +
                "'description Very large and high climbing, clustering rattan. Stem without leafsheaths 2545 mm in diameter, 6070 mm in diameter with sheaths. Leaf very large, cirrate; leafsheath thick, woody, reddishbrown, armed with numerous small spicules or rigid and very brittle bristles, 510 mm long, often confluent and forming short collars; knee conspicuous; ocrea short, represented by a brown bristlyhispid rim at the mouth of the sheaths; petiole very robust, to 3540 mm broad, polished, unarmed at the base and beneath, shallowly and broadly channelled above, armed on the margins with numerous short straight erect spines; rachis rounded beneath, slightly channelled and with two acute spinulous angles above and above sidefaces, distally armed on lower surface with very robust reflexed spines; cirrus very robust, bearing groups of very stoutbased blacktipped reflexed spines; leaflets very numerous, equidistant, approximately 1520 mm apart in the basal and intermediate portion, further apart towards the apex, elongateensiform, narrowing and deeply plicate at the base, gradually acuminate, 4045 cm×2527 mm, the apical ones shorter, concolorous when full grown, apparently slightly mealywhite beneath when young, midvein unarmed or sparingly bristly only near the tips, the side veins slender, bearing long bristles, transverse veinlets inconspicuous, margins armed with small spinules. ', " +
                "'Is a fast growing rattan and attains its full length of 15 m or more after 58 years. It grows best in semiopen forest. ', " +
                "'Is best propagated by seeds. The fruits are thoroughly washed to remove the fleshy coat and most seeds are sown in beds. The seedlings are kept in shade and usually potted in plastic bags after some weeks, and watered daily until they attain a height of 2030 cm. These are then transplanted to the forest. ', " +
                "'After harvest, the canes are subjected to various processes to prevent decay or attack by staining fungi. Canes may be airdried, which usually takes 34 weeks, or kilndried in a special drier which usually takes a shorter time. Antistaining chemicals are usually applied to the freshly cut canes. ', " +
                R.drawable.tree_arecaceae_palasanpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 7, 'Pugahan', 'Caryota cumingii', " +
                "'description Caryota cumingii is a solitary-stemmed, evergreen palm tree growing about 12 meters tall. The unbranched stem is up to 20cm in diameter, it is crowned by a rosette of large leaves. The tree is harvested from the wild for its edible bud and the pith in its stem, which are used locally. The plant is sometimes grown as an ornamental. ', " +
                "'Rainforest. ', " +
                "'Grows best in a sunny, moist, but well drained position. The species in this genus are monocarpic, growing for several years (in some species 15 years or more) without flowering, but then flowering and fruiting profusely over several years before dying. Before reaching maturity, selected inflorescences are prepared for tapping by beating with a wooden stick and are then tied with a string to keep them in a proper shape. If possible, a number of inflorescences are tied together. A concoction of herbs, salt and ash may be applied to the tip of the inflorescence. Tapping begins 3 - 4 days later by making a fine angular slash. A receptacle, usually a piece of bamboo, is hung under the tapping point to catch the sap. The inflorescence is cut afresh in the morning and evening for 3 - 4 months, until none remains. ', " +
                "'The leaf sheath fiber (kittul) from plants in this genus is durable and is often harvested as a source of thatch, cordage, and to make brushes and brooms. The fiber becomes very pliable after being steeped in linseed oil. The woolly hairs on the leaf sheaths, petioles and rachis can be used as tinder or as wadding. They may also be used to caulk wooden boats. The finer fiber can also be spun into fishing lines or coarse threads for sewing. ', " +
                R.drawable.tree_arecaceae_pugahanpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 8, 'Takipan', 'Caryota rumphiana', " +
                "'description Albert palm is an evergreen, solitary-stemmed palm tree growing up to 15 meters tall. The unbranched stem is up to 10 - 12 meters tall, topped with a rosette of leaves that can be up to 7 meters long but are more commonly 3 - 5 meters. ', " +
                "'Lowland rainforest of varying soil types, i.e. sandy, basaltic, granitic and alluvial, on a range of aspects from flat to steep slopes. Also in semi-deciduous vine forests, broad-leaved swamp forests and brackish or fresh mangroves. ', " +
                "'The plant can withstand occasional temperatures down to about -3°c. Prefers a position in light shade. Younger plants appreciate some shade, but older plants can tolerate full sun.  A site sheltered from strong winds is preferred because the large leaves are fairly easily damaged. A very fast-growing palm, capable of reaching 2 meters in height in its first year of growth from seed. The tree is monocarpic, living for several years without flowering, but then flowering profusely and dying. In the tropics, plants can commence flowering when only 6 - 8 years old, flowering for about 2 years before dying. In the subtropics the plant will take somewhat longer to come into flower. Before reaching maturity, selected inflorescences are prepared for tapping by beating with a wooden stick and are then tied with a string to keep them in a proper shape. If possible, a number of inflorescences are tied together. A concoction of herbs, salt and ash may be applied to the tip of the inflorescence. Tapping begins 3 - 4 days later by making a fine angular slash. A receptacle, usually a piece of bamboo, is hung under the tapping point to catch the sap. The inflorescence is cut afresh in the morning and evening for 3 - 4 months, until none remains. ', " +
                "'The leaf sheath fiber (kittul) from plants in this genus is durable and is often harvested as a source of thatch, cordage, and to make brushes and brooms. The fiber becomes very pliable after being steeped in linseed oil. The woolly hairs on the leaf sheaths, petioles and rachis can be used as tinder or as wadding. They may also be used to caulk wooden boats. The finer fiber can also be spun into fishing lines or coarse threads for sewing. The outer part of the trunk is split and made into very durable slat flooring. ', " +
                R.drawable.tree_arecaceae_takipanpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 9, 'Niog', 'Cocos nucifera', " +
                "'description Is a variable, single-stemmed, evergreen palm tree that can range in height from 2 meters up to 30 meters tall. The unbranched stem is topped by a rosette of leaves that can each be 4.5 - 6 meters long. The cylindrical stem can be 40cm in diameter, though up to 60cm at the base. It is one of the most useful plants for humans, providing a wide range of foods and other commodities. It is widely cultivated and harvested from the wild in coastal tropical areas, for its seed and a wide range of uses that can be made of the seed husks, leaves etc. There are many named forms. It is also widely grown as an ornamental plant in tropical and subtropical areas. ', " +
                "'Commonly found along tropical seashores, sometimes extending inland on alluvial plains with a high water table, but avoiding waterlogged soils. ', " +
                "'Coconuts grow well in lowland tropical regions as far as 26° north and south of the Equator and up to a maximum elevation of around 1,000 meters, though most commercial cultivation takes place within 20° of the Equator and below 300 meters. They grow best in areas with a high rainfall. Plants succeed in moist tropical climates where temperatures never fall below 10°c, the average annual rainfall is 1,500mm or more and the driest month has 25mm or more rain. The coconut palm thrives in a wide range of soils, from coarse sand to clay, so long as the soils have adequate drainage and aeration.  Requires a well-drained soil with a high water table. Plants grow well in full sun, even when small. Plants can tolerate at least some maritime exposure with salt spray and somewhat saline soil conditions. Coconut palms are halophytic and tolerate salt in the soil well. Plants are intolerant of drought. ', " +
                "'An oil obtained from the seed contains fatty alcohol and glycerine. It is widely used in making goods such as soaps, detergents, cosmetics, candles, pharmaceuticals etc. and to a lesser extent as a lubricant. The oil can be used as a substitute for diesel oils, for electric generating plants and motor vehicles. This use, however, depends on the price of other fuels being high if it is to be economic. The leaves are interwoven and used as a roofing or thatching material for walls of huts. They can also be woven into mats, baskets etc. The midribs of the leaflets are used for brooms. The root may be used as a toothbrush. The fibrous material that surrounds the seed is known as coir. There are three types of fiber obtained from the husks Mat fiber or yarn fiber. This is used in making mats. Bristle fiber. This is used for brush making. Mattress fiber. Used in stuffing mattresses and in upholstery. The fiber can also be used for making ropes and cordage. The hard, woody shell surrounding the seed can be used as cups, bowls, in craft work, buttons, combs, bangles, musical instruments, etc. Coconut-shell flour, obtained from grinding clean, mature coconut shells to fine powder, is used as a filler in the thermoplastic industry and as an abrasive for cleaning machinery. A good quality charcoal is made from the shell of the seed.  It gives off an intense heat when burnt. The charcoal is very absorptive and has been used in gas masks.  Coconut-shell charcoal may be processed further into activated carbon that has many industrial applications, including general water purification, crystalline sugar preparation and gold purification. The high moisture content of the wood and the difficulty of splitting it has made it relatively unpopular as fuel. ', " +
                R.drawable.tree_arecaceae_niogpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 10, 'Buri', 'Coryapha utan', " +
                "'description Gebang Palm is a massive, solitary-stemmed, evergreen fan palm growing to about 20 meters tall with leaves from 4 - 6 meters across. The bole can be 1 meter in diameter. One of the largest of all the palms.  It provides a wide range of food and materials for the local people. ', " +
                "'Flat, low-lying land in woodlands and forests in monsoonal areas. Open grasslands, and along rivers and wetlands. ', " +
                "'Plants succeed in moist tropical climates where temperatures never fall below 10°c, the average annual rainfall is 1,500mm or more and the driest month has 25mm or more rain. They can also succeed in drier areas with an annual rainfall as low as 250mm and one month or more where rainfall is below 25mm. Plants grow well in full sun, even when small. Plants are monocarpic - living for many years without flowering, but then dying after they flower. Like all members of this genus, these palms only flower at the end of their life, sending up a massive inflorescence, up to 5 meters high, and with up to 1 million flowers. Plants are slow growing when young. ', " +
                "'The leaves have a wide range of uses, including thatching for roofs and walls, weaving into baskets, mats, hats etc. The ribs of the leaves is used for making brooms. A fiber known as buntal, is obtained from the leaf petioles.  It is used for making Lucban and Baliuag hats, and for making rope. A very fine fiber is obtained from the unfolded leaves. Used for cloth, fancy articles and as a string. Fibers from the ribs of unfolded leaves are used for making Calasiao hats. The mature seeds are made into buttons or used as beads on rosaries. ', " +
                R.drawable.tree_arecaceae_buripalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 11, 'Red palm', 'Cyrtostachys renda', " +
                "'description A clumping palm, up to 12 m tall, with characteristically bright red leaf sheaths (each about 60 cm long) around the stems. Naturally growing in swamps and highly tolerant of flooding. Cultivated as an ornamental palm for its attractive bright red stems and leaf stalks. Leaves, measuring about 1.5 m long and 0.6 m wide, have bright red stalks and mid-ribs and are pinnate and alternately-arranged. Each leaf consists of leaflets that are boat-shaped, slightly grey on the underside and about 45 cm long and 4 cm wide. Crown shaft is distinctively red in color. Its branched flowering shoot is first green before turning to red, with two large spathes (modified leaves) that are 60 cm by 60 cm. Flowers are pollinated by bees. Its tiny one-seeded fruits are ellipsoidal in shape, 8-10 by 4-5 mm. ', " +
                "'It grows near the sea, by tidal rivers, and in freshwater or peat swamp forests. ', " +
                "'Preferring rich loamy soil, that has to be kept moist as this palm is not drought-tolerant, quickly withering with water stress. Suitable for garden, parks and roadside planting. Also can be grown at the edges of ponds or reservoirs as it is tolerant of water-logged conditions. The outer wood of the stem is hard and used to make darts. This palm is also the symbol of the Singapore Botanic Gardens. ', " +
                "'The hard outer wood of the stem is used to make darts. This palm is the symbol of the Singapore Botanic Gardens. ', " +
                R.drawable.img_no_resource));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 12, 'Palmera', 'Dypsis lutescens', " +
                "'description Dypsis lutescens is an evergreen plant, producing a clump of stems 4 - 9 meters tall and 10 - 13cm in diameter, often with small prop roots at the base. Each stem is unbranched, and is topped by a crown of 6 - 8 large, feather-shaped leaves. The plant is often grown as an ornamental and sometimes as a hedge or screen. The main threats to this species are habitat loss from expanding agriculture and harvesting of plants from the wild to supply the local horticultural markets. The plant is classified as Near Threatened in the IUCN Red List of Threatened Species(2013). ', " +
                "'Widespread in the littoral area of the east coast, where thousands of individuals form thick tufts along the dunes or in swampy areas. Mainly found in swampy areas in the littoral, it is also found on alluvium at higher elevations up to 300 meters. ', " +
                "'A plant of the humid, lowland tropics, where it is found at elevations below 500 meters. One report says that mature trees can tolerate temperatures down to around freezing - this might kill the top growth but the plant usually resprouts from the roots. Succeeds in full sun and in moderate shade. Prefers a moist, well-drained soil. Grows best in a slightly acidic, sandy soil. Established plants are drought tolerant. A dioecious species, both male and female forms need to be grown if fruit and seed are required. ', " +
                "'None known. ', " +
                R.drawable.tree_arecaceae_palmerapalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 13, 'African oil palm', 'Elaeis guineensis', " +
                "'description African oil palm is a handsome evergreen, single-stemmed palm tree that can grow up to a height of 20 - 30 meters. The erect, cylindrical, unbranched stem can be 22 - 75cm in diameter, it is topped by a crown of about 40 - 60 live dark green leaves that can be up to 8 meters long, and a skirt of dead leaves. The oil palm is a multi-purpose tree of major importance in Africa, where it supplies food, medicines and many other products to the local population. Increasingly coming under cultivation, this species is rapidly becoming one of the worlds most cultivated plants, being grown especially for its oil-bearing seeds and fruits. The tree is sometimes planted as a garden ornamental and along avenues. ', " +
                "'More or less open forest in moist, sandy soils that are often poorly drained. Often found along the edges of rivers. ', " +
                "'Plants succeed in moist to very wet tropical climates up to elevations of 1,300 meters, though commercial cultivation is restricted to areas below 700 meters and preferably lower than 300 meters. It grows best in areas where annual daytime temperatures are within the range 20 - 35°c, but can tolerate 12 - 38°c. The plant is quite tolerant, though, and succeeds in southern China where there are light frosts and mean daily temperatures can drop below 10°c for weeks on end.  It prefers a mean annual rainfall in the range 1,500 - 3,000mm, but tolerates 1,000 - 8,000mm.  Optimally, there should be at least 150 mm of rain each month of the year, ideally falling mostly at night. Plants grow well in full sun, even when small. Grows and thrives on wide range of tropical soils, provided they have adequate water supply. Requires a humus-rich soil. Waterlogged, highly lateritic, extremely sandy, stony or peaty soils should be avoided. Tolerant of temporary flooding, provided the water is not stagnant. The root system is adventitious, forming a dense mat with a radius of 3 - 5 meters in the upper 40 - 60cm of the soil. Some primary roots are directly below the base of the trunk descending for anchorage for more than 1.5 meters, the roots produce pneumatodes under very moist conditions. The African oil palm is a succession species favoured by slash and burn, and its gene pool has expanded as farmers clear land and create more open habitat for the germination of its seeds. Plants can commence bearing just 3 years after the seed has germinated. The plant produces both male and female flowers, but not usually at the same time. An individual inflorescence will be all male or all female flowers; after a series of inflorescences of one sex the plant will then produce a series of inflorescences of the opposite sex. ', " +
                "'Two types of oil are obtained from the plant. Palm oil is obtained from the fruit. About 10% of all palm oil, the inferior grades in particular and also refining residues, is used to manufacture soaps, detergents, candles, resins, lubricating greases, cosmetics, glycerol and fatty acids. Palm oil is employed in the steel industry (for sheet-steel manufacturing and tin plating, where it protects the iron before the tin is applied) and epoxidized palm oil is a plasticizer and stabilizer in PVC plastics. Palm kernel oil, obtained from the seed, is a non-drying oil. It is used as an alternative to coconut oil in making high quality soaps, as a lubricant etc. It is a source of short-chain and medium-chain fatty acids. These acids are chemical intermediates in the production of fatty alcohols, esters, amines, amides and more sophisticated chemicals, which are components of many products such as surface-active agents, plastics, lubricants and cosmetics. Both oils also have a wide range of other uses, including making detergents, shampoos, cosmetics, lubricating oil additives and fluxes. It is technically possible to produce from palm oil either carbohydrates for conversion to alcohol or a methanolizable oil as a diesel substitute. In Togo, the pressed fruits are dried and fashioned into cakes for cooking fuel. The empty bunches, fiber and also the effluent (0.5 t sludge for each t of milled fruit bunches) from the oil mills can be converted into products such as organic fertilizers. Palm fronds are useful for thatch. The entire palm fronds of this species are less suitable for thatching than those of the coconut palm, because of irregular leaflet insertion. However, the leaflets are often woven into baskets and mats; the leaflet midribs are made into brooms and the rachises used for fencing. Young leaflets produce a fine strong fibre, used for making fishing lines, snares and strainers. The seed shells are polished and carved into ornamental rings and beads. Palm trunks, available at replanting, provide excellent material for paper and board production, but this has not yet attracted much commercial interest. The seed shells are much appreciated by local blacksmiths as a high calorific fuel for furnaces. ', " +
                R.drawable.tree_arecaceae_africanoilpalm));

        db.execSQL(insertQuery(TBL_TREES, TBL_TREES_ROW, "1, 14, 'Date palm', 'Phoenix dactylifera', " +
                "'description Date palm is a single-stemmed, evergreen palm tree growing 15 - 40 meters tall. The unbranched stem is topped by a terminal crown of 100 - 120 leaves that can each be 4 - 7 meters long on a short stem up to 50cm long. The date palm is one of the longest cultivated plants in the world, having been grown at least 5,000 years ago. It is an enormously important crop in many dry tropical and subtropical areas, where its fruit often forms a staple food for long periods of the year. The plant is also widely exploited for many other purposes and, outside its natural arid zone, is commonly grown as an ornamental even though it may not fruit. ', " +
                "'The tree has been cultivated for so long that it is not known in a truly wild situation. ', " +
                "'Date palm is a plant of drier areas in the tropics, where it is found at elevations up to 1,500 meters. Hot dry conditions are required for free fruiting, the fruit not forming very readily in cooler or moister climates. It grows best in areas where annual daytime temperatures are within the range 26 - 45°c, but can tolerate 10 - 52°c. When dormant, the plant can survive temperatures down to about -15°c, but the leaves and young growth can be severely damaged at -4°c.  It prefers a mean annual rainfall in the range 200 - 300mm, but tolerates 100 - 400mm. The tree transpires large quantities of moisture and the amount of available rainfall is often little, or entirely absent in the production areas. The water requirement of the palm must be provided for by ground water (the roots of the tree can reach 2 - 6 meters deep) or by irrigation. Plants are tolerant of a range of soil types, so long as they are well-drained.  Plants grow well in full sun, even when small. Tolerant of salty soils, though fruit quality might be adversely affected. Prefers a pH in the range 6.5 - 8, tolerating 6 - 8.5. Seedlings begin to develop a stem when about 4 - 5 years old and will usually start flowering soon afterwards. Plants propagated from suckers can commence fruiting within 2 - 4 years and normally reach full production at 5 - 8 years, although productivity may increase up to 9 - 15 years. Pollination is critical for good fruiting; therefore, pollen is usually artificially introduced to the female flowers by cutting a male inflorescence and placing it strategically within a female inflorescence - this may be thinned a little to accommodate it. It is important that male trees are planted with females in ratios of about 1:50 in order to provide sufficient pollen. An average well-managed palm can produce about 60 - 70 kilos of fresh dates per year. Commercially, yields of dates are often restricted to about 50 kilos per tree in order to ensure high quality, though yields of 100 kilos have been recorded. Yields decline after 40 - 50 years, but the tree will continue to produce until about the age of 75 years. When fruit yields are poor, the tree is often tapped for its sap. The yield varies with management and site conditions, but it is in the range of 4 - 8 liters per day. There are many named forms. 	A dioecious species, at least one male plant for every 6 females is necessary to ensure fertilization. ', " +
                "'The leaves are widely used for a variety of purposes. They make an excellent thatch, being used to make roofs and walls of huts. A fiber obtained from the leaves, base of the leaves and bark can be used to make ropes, baskets, hats and mats. A fiber obtained from the leaf petiole, combined with other suitable material, is used for making insulating boards. Dried leaves, with their stiff, woody rachis, are used for fencing. The wood in the outer portion of the stem is strong and resistant to termites. It is much valued for use in construction. The stems are used for fuel. ', " +
                R.drawable.tree_arecaceae_datepalm));


    }
}
