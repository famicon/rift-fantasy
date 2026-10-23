package net.fantasy.rift.quest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questlines {
    public static final Map<String, List<Quest>> QUESTLINES = new HashMap<>();

    public static void initializeQuestlines() {
        // Questline 1: The Breach of Eternity
        List<Quest> ql1 = new ArrayList<>();
        ql1.add(new Quest("q1_1", "Signs in the Barrows", "Investigate ancient runic barrows in the snowy mountains.", false));
        ql1.add(new Quest("q1_2", "Crossing the Rift", "Craft a Planar Keystone and open your first portal into The Rift.", true));
        ql1.add(new Quest("q1_3", "Spire of the Lost Archmage", "Traverse The Rift islands to uncover the Archmage's Vault.", true));
        ql1.add(new Quest("q1_4", "The Shard-Forged Key", "Combine Rift-infused crystals with netherite at a runic anvil.", true));
        ql1.add(new Quest("q1_5", "Showdown: Rift Harbinger", "Infiltrate the Astral Citadel and defeat the Harbinger.", true));
        QUESTLINES.put("BreachOfEternity", ql1);

        // Questline 2: The Frostfire Accord
        List<Quest> ql2 = new ArrayList<>();
        ql2.add(new Quest("q2_1", "Cryo-Runes of the High Peaks", "Collect frozen slate blocks atop glacier peaks.", false));
        ql2.add(new Quest("q2_2", "Planar Thermals", "Enter The Rift to bottle floating Astral Blue Fire.", true));
        ql2.add(new Quest("q2_3", "The Glacial Catacomb", "Delve into the multi-floor Glacial Catacomb dungeon.", false));
        ql2.add(new Quest("q2_4", "Attuning the Frozen Spire", "Construct an astral beacon in The Rift to shatter the ice barrier.", true));
        ql2.add(new Quest("q2_5", "Showdown: Ymir The Glacial Sovereign", "Defeat the frost titan in his subterranean cavern.", false));
        QUESTLINES.put("FrostfireAccord", ql2);

        // Questline 3: Order of the Obsidian Sun
        List<Quest> ql3 = new ArrayList<>();
        ql3.add(new Quest("q3_1", "Bloodstone Whispers", "Trade with planar archeologists in Skyrim-style taverns.", false));
        ql3.add(new Quest("q3_2", "The Void Forge", "Travel to The Rift's magma-isles to smelt Astral Alloy.", true));
        ql3.add(new Quest("q3_3", "Bastion of the Sunken Citadel", "Explore the deep ocean sunken labyrinth.", false));
        ql3.add(new Quest("q3_4", "Severing the Astral Tether", "Locate and disable the rift anchors feeding the dungeon.", true));
        ql3.add(new Quest("q3_5", "Showdown: Sol-Kada", "Slay Sol-Kada, the solar eclipse warden inside his pocket dimension.", true));
        QUESTLINES.put("ObsidianSun", ql3);

        // Questline 4: The Wilds of Aetheria
        List<Quest> ql4 = new ArrayList<>();
        ql4.add(new Quest("q4_1", "Nature's Distortion", "Document corrupted glowing foliage in the Overworld taiga.", false));
        ql4.add(new Quest("q4_2", "Rift Blossom Extract", "Venture into The Rift's hanging gardens to harvest spores.", true));
        ql4.add(new Quest("q4_3", "The Overgrown Labyrinth", "Conquer the colossal tree-dungeon.", false));
        ql4.add(new Quest("q4_4", "The Seed of Genesis", "Purify the planar seed within the core of The Rift.", true));
        ql4.add(new Quest("q4_5", "Showdown: Sylphira", "Defeat the corrupt guardian Sylphira.", false));
        QUESTLINES.put("WildsOfAetheria", ql4);

        // Questline 5: The Planar Cataclysm
        List<Quest> ql5 = new ArrayList<>();
        ql5.add(new Quest("q5_1", "Echoes of the End", "Decipher the apocalyptic warning etched in the monoliths.", false));
        ql5.add(new Quest("q5_2", "The Void Pilgrimage", "Cross the deepest abyss of The Rift to reach the core rift-well.", true));
        ql5.add(new Quest("q5_3", "The Citadel of Null", "Navigate the final 5-story mechanical planar labyrinth.", true));
        ql5.add(new Quest("q5_4", "Unmaking the Rift Seals", "Channel elemental staffs to break the ultimate seal.", true));
        ql5.add(new Quest("q5_5", "Final Boss: The Null Paradox", "Engage in the multi-stage final boss fight across worlds.", true));
        QUESTLINES.put("PlanarCataclysm", ql5);
    }
}
