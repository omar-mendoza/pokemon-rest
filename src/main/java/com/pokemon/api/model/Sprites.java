package com.pokemon.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites {


    @JsonProperty("front_default")
    private String frontDefault;
//    private String backDefault;
//    private String backFemale;
//    private String backShiny;
//    private Object backShinyFemale;
//    private Object frontFemale;
//    private String frontShiny;
//    private Object frontShinyFemale;
//    private Other other;
//    private Versions versions;
//    private Sprites animated;

    public Sprites() {}

//    public String getBackDefault() { return backDefault; }
//    public void setBackDefault(String value) { this.backDefault = value; }
//
//    public Object getBackFemale() { return backFemale; }
//    public void setBackFemale(Object value) { this.backFemale = value; }
//
//    public String getBackShiny() { return backShiny; }
//    public void setBackShiny(String value) { this.backShiny = value; }
//
//    public Object getBackShinyFemale() { return backShinyFemale; }
//    public void setBackShinyFemale(Object value) { this.backShinyFemale = value; }
//
    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }
//
//    public Object getFrontFemale() { return frontFemale; }
//    public void setFrontFemale(Object value) { this.frontFemale = value; }
//
//    public String getFrontShiny() { return frontShiny; }
//    public void setFrontShiny(String value) { this.frontShiny = value; }
//
//    public Object getFrontShinyFemale() { return frontShinyFemale; }
//    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }
//
//    public Other getOther() { return other; }
//    public void setOther(Other value) { this.other = value; }
//
//    public Versions getVersions() { return versions; }
//    public void setVersions(Versions value) { this.versions = value; }
//
//    public Sprites getAnimated() { return animated; }
//    public void setAnimated(Sprites value) { this.animated = value; }
//	@Override
//	public String toString() {
//		return "Sprites [backDefault=" + backDefault + ", backFemale=" + backFemale + ", backShiny=" + backShiny
//				+ ", backShinyFemale=" + backShinyFemale + ", frontDefault=" + frontDefault + ", frontFemale="
//				+ frontFemale + ", frontShiny=" + frontShiny + ", frontShinyFemale=" + frontShinyFemale + ", other="
//				+ other + ", versions=" + versions + ", animated=" + animated + "]";
//	}
//

	@Override
	public String toString() {
		return "Sprites [frontDefault=" + frontDefault + "]";
	}
}
