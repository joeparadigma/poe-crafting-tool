package org.internna.poecrafttool.model;

import java.util.List;

import org.internna.poecrafttool.model.enums.RARITIES;

public class Item {

	private RARITIES rarity;
	private ItemBase baseType;
	private Integer implicitValue;
	private List<ModTier> prefixes, sufixes;

	public RARITIES getRarity() {
		return rarity;
	}

	public void setRarity(final RARITIES rarity) {
		this.rarity = rarity;
	}

	public ItemBase getBaseType() {
		return baseType;
	}

	public void setBaseType(final ItemBase baseType) {
		this.baseType = baseType;
	}

	public Integer getImplicitValue() {
		return implicitValue;
	}

	public void setImplicitValue(final Integer implicitValue) {
		this.implicitValue = implicitValue;
	}

	public List<ModTier> getPrefixes() {
		return prefixes;
	}

	public void setPrefixes(final List<ModTier> prefixes) {
		this.prefixes = prefixes;
	}

	public List<ModTier> getSufixes() {
		return sufixes;
	}

	public void setSufixes(final List<ModTier> sufixes) {
		this.sufixes = sufixes;
	}

}
