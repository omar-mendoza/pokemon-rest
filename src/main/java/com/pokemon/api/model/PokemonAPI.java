package com.pokemon.api.model;

import java.util.List;
import java.util.Map;

public class PokemonAPI {

//    private List<Ability> abilities;
//    private long baseExperience;
//    private List<Species> forms;
//    private List<GameIndex> gameIndices;
//    private long height;
//    private List<Object> heldItems;
    private int id;
    private boolean isDefault;
    private String locationAreaEncounters;
//    private List<Move> moves;
    private String name;
//    private long order;
//    private Species species;
    private Sprites sprites;
//    private List<Stat> stats;
//    private List<Type> types;
//    private long weight;

//    public List<Ability> getAbilities() { return abilities; }
//    public void setAbilities(List<Ability> value) { this.abilities = value; }
//
//    public long getBaseExperience() { return baseExperience; }
//    public void setBaseExperience(long value) { this.baseExperience = value; }
//
//    public List<Species> getForms() { return forms; }
//    public void setForms(List<Species> value) { this.forms = value; }
//
//    public List<GameIndex> getGameIndices() { return gameIndices; }
//    public void setGameIndices(List<GameIndex> value) { this.gameIndices = value; }
//
//    public long getHeight() { return height; }
//    public void setHeight(long value) { this.height = value; }
//
//    public List<Object> getHeldItems() { return heldItems; }
//    public void setHeldItems(List<Object> value) { this.heldItems = value; }

    public int getID() { return id; }
    public void setID(int value) { this.id = value; }

    public boolean getIsDefault() { return isDefault; }
    public void setIsDefault(boolean value) { this.isDefault = value; }

    public String getLocationAreaEncounters() { return locationAreaEncounters; }
    public void setLocationAreaEncounters(String value) { this.locationAreaEncounters = value; }

//    public List<Move> getMoves() { return moves; }
//    public void setMoves(List<Move> value) { this.moves = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

//    public long getOrder() { return order; }
//    public void setOrder(long value) { this.order = value; }
//
//    public Species getSpecies() { return species; }
//    public void setSpecies(Species value) { this.species = value; }

    public Sprites getSprites() { return sprites; }
    public void setSprites(Sprites value) { this.sprites = value; }

//    public List<Stat> getStats() { return stats; }
//    public void setStats(List<Stat> value) { this.stats = value; }
//
//    public List<Type> getTypes() { return types; }
//    public void setTypes(List<Type> value) { this.types = value; }
//
//    public long getWeight() { return weight; }
//    public void setWeight(long value) { this.weight = value; }
    
    

}

class Ability {
    private Species ability;
    private boolean isHidden;
    private long slot;

    public Species getAbility() { return ability; }
    public void setAbility(Species value) { this.ability = value; }

    public boolean getIsHidden() { return isHidden; }
    public void setIsHidden(boolean value) { this.isHidden = value; }

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }
}


class Species {
    private String name;
    private String url;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}

class GameIndex {
    private long gameIndex;
    private Species version;

    public long getGameIndex() { return gameIndex; }
    public void setGameIndex(long value) { this.gameIndex = value; }

    public Species getVersion() { return version; }
    public void setVersion(Species value) { this.version = value; }
}

class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;

    public Species getMove() { return move; }
    public void setMove(Species value) { this.move = value; }

    public List<VersionGroupDetail> getVersionGroupDetails() { return versionGroupDetails; }
    public void setVersionGroupDetails(List<VersionGroupDetail> value) { this.versionGroupDetails = value; }
}

class VersionGroupDetail {
    private long levelLearnedAt;
    private Species moveLearnMethod;
    private Species versionGroup;

    public long getLevelLearnedAt() { return levelLearnedAt; }
    public void setLevelLearnedAt(long value) { this.levelLearnedAt = value; }

    public Species getMoveLearnMethod() { return moveLearnMethod; }
    public void setMoveLearnMethod(Species value) { this.moveLearnMethod = value; }

    public Species getVersionGroup() { return versionGroup; }
    public void setVersionGroup(Species value) { this.versionGroup = value; }
}

class GenerationV {
    private Sprites blackWhite;

    public Sprites getBlackWhite() { return blackWhite; }
    public void setBlackWhite(Sprites value) { this.blackWhite = value; }
}

class GenerationIv {
    private Sprites diamondPearl;
    private Sprites heartgoldSoulsilver;
    private Sprites platinum;

    public Sprites getDiamondPearl() { return diamondPearl; }
    public void setDiamondPearl(Sprites value) { this.diamondPearl = value; }

    public Sprites getHeartgoldSoulsilver() { return heartgoldSoulsilver; }
    public void setHeartgoldSoulsilver(Sprites value) { this.heartgoldSoulsilver = value; }

    public Sprites getPlatinum() { return platinum; }
    public void setPlatinum(Sprites value) { this.platinum = value; }
}

class Versions {
    private GenerationI generationI;
    private GenerationIi generationIi;
    private GenerationIii generationIii;
    private GenerationIv generationIv;
    private GenerationV generationV;
    private Map<String, GenerationVi> generationVi;
    private GenerationVii generationVii;
    private GenerationViii generationViii;

    public GenerationI getGenerationI() { return generationI; }
    public void setGenerationI(GenerationI value) { this.generationI = value; }

    public GenerationIi getGenerationIi() { return generationIi; }
    public void setGenerationIi(GenerationIi value) { this.generationIi = value; }

    public GenerationIii getGenerationIii() { return generationIii; }
    public void setGenerationIii(GenerationIii value) { this.generationIii = value; }

    public GenerationIv getGenerationIv() { return generationIv; }
    public void setGenerationIv(GenerationIv value) { this.generationIv = value; }

    public GenerationV getGenerationV() { return generationV; }
    public void setGenerationV(GenerationV value) { this.generationV = value; }

    public Map<String, GenerationVi> getGenerationVi() { return generationVi; }
    public void setGenerationVi(Map<String, GenerationVi> value) { this.generationVi = value; }

    public GenerationVii getGenerationVii() { return generationVii; }
    public void setGenerationVii(GenerationVii value) { this.generationVii = value; }

    public GenerationViii getGenerationViii() { return generationViii; }
    public void setGenerationViii(GenerationViii value) { this.generationViii = value; }
}

class GenerationI {
    private RedBlue redBlue;
    private RedBlue yellow;

    public RedBlue getRedBlue() { return redBlue; }
    public void setRedBlue(RedBlue value) { this.redBlue = value; }

    public RedBlue getYellow() { return yellow; }
    public void setYellow(RedBlue value) { this.yellow = value; }
}

class RedBlue {
    private String backDefault;
    private String backGray;
    private String frontDefault;
    private String frontGray;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public String getBackGray() { return backGray; }
    public void setBackGray(String value) { this.backGray = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontGray() { return frontGray; }
    public void setFrontGray(String value) { this.frontGray = value; }
}

class GenerationIi {
    private Crystal crystal;
    private Crystal gold;
    private Crystal silver;

    public Crystal getCrystal() { return crystal; }
    public void setCrystal(Crystal value) { this.crystal = value; }

    public Crystal getGold() { return gold; }
    public void setGold(Crystal value) { this.gold = value; }

    public Crystal getSilver() { return silver; }
    public void setSilver(Crystal value) { this.silver = value; }
}

class Crystal {
    private String backDefault;
    private String backShiny;
    private String frontDefault;
    private String frontShiny;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }
}

class GenerationIii {
    private Emerald emerald;
    private Crystal fireredLeafgreen;
    private Crystal rubySapphire;

    public Emerald getEmerald() { return emerald; }
    public void setEmerald(Emerald value) { this.emerald = value; }

    public Crystal getFireredLeafgreen() { return fireredLeafgreen; }
    public void setFireredLeafgreen(Crystal value) { this.fireredLeafgreen = value; }

    public Crystal getRubySapphire() { return rubySapphire; }
    public void setRubySapphire(Crystal value) { this.rubySapphire = value; }
}

class Emerald {
    private String frontDefault;
    private String frontShiny;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }
}

class GenerationVi {
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public Object getFrontShinyFemale() { return frontShinyFemale; }
    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }
}

class GenerationVii {
    private DreamWorld icons;
    private GenerationVi ultraSunUltraMoon;

    public DreamWorld getIcons() { return icons; }
    public void setIcons(DreamWorld value) { this.icons = value; }

    public GenerationVi getUltraSunUltraMoon() { return ultraSunUltraMoon; }
    public void setUltraSunUltraMoon(GenerationVi value) { this.ultraSunUltraMoon = value; }
}

class DreamWorld {
    private String frontDefault;
    private Object frontFemale;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }
}

class GenerationViii {
    private DreamWorld icons;

    public DreamWorld getIcons() { return icons; }
    public void setIcons(DreamWorld value) { this.icons = value; }
}

class Other {
    private DreamWorld dreamWorld;
    private OfficialArtwork officialArtwork;

    public DreamWorld getDreamWorld() { return dreamWorld; }
    public void setDreamWorld(DreamWorld value) { this.dreamWorld = value; }

    public OfficialArtwork getOfficialArtwork() { return officialArtwork; }
    public void setOfficialArtwork(OfficialArtwork value) { this.officialArtwork = value; }
}

class OfficialArtwork {
    private String frontDefault;

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }
}

class Stat {
    private long baseStat;
    private long effort;
    private Species stat;

    public long getBaseStat() { return baseStat; }
    public void setBaseStat(long value) { this.baseStat = value; }

    public long getEffort() { return effort; }
    public void setEffort(long value) { this.effort = value; }

    public Species getStat() { return stat; }
    public void setStat(Species value) { this.stat = value; }
}

class Type {
    private long slot;
    private Species type;

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }

    public Species getType() { return type; }
    public void setType(Species value) { this.type = value; }
}
