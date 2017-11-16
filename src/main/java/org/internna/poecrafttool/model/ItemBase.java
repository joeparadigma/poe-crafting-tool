package org.internna.poecrafttool.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_BASES")
public class ItemBase {

	@Id
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne(optional = false) 
    @JoinColumn(name = "ITEM_TYPE", nullable = false, updatable = false)
	private ItemType itemType;

	@ManyToOne(optional = true) 
    @JoinColumn(name = "ITEM_IMPLICIT", nullable = true, updatable = false)
	private ImplicitMod implicitMod;

	@Column(name = "REQUIRED_LEVEL")
	private Integer requiredLevel;

	@Column(name = "REQUIRED_STR")
	private Integer requiredStrengh;

	@Column(name = "REQUIRED_DEX")
	private Integer requiredDexterity;

	@Column(name = "REQUIRED_INT")
	private Integer requiredIntelligence;

	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "MODS_BASES", joinColumns = {
    	@JoinColumn(name = "MOD", nullable = false, insertable = false, updatable = false)
    }, inverseJoinColumns = {
		@JoinColumn(name = "ITEM_BASE", nullable = false, insertable = false, updatable = false)
    })
	private List<Mod> availableAffixes;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(final ItemType itemType) {
		this.itemType = itemType;
	}

	public ImplicitMod getImplicitMod() {
		return implicitMod;
	}

	public void setImplicitMod(final ImplicitMod implicitMod) {
		this.implicitMod = implicitMod;
	}

	public Integer getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(final Integer requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public Integer getRequiredStrengh() {
		return requiredStrengh;
	}

	public void setRequiredStrengh(final Integer requiredStrengh) {
		this.requiredStrengh = requiredStrengh;
	}

	public Integer getRequiredDexterity() {
		return requiredDexterity;
	}

	public void setRequiredDexterity(final Integer requiredDexterity) {
		this.requiredDexterity = requiredDexterity;
	}

	public Integer getRequiredIntelligence() {
		return requiredIntelligence;
	}

	public void setRequiredIntelligence(final Integer requiredIntelligence) {
		this.requiredIntelligence = requiredIntelligence;
	}

	public List<Mod> getAvailableAffixes() {
		return availableAffixes;
	}

	public void setAvailableAffixes(final List<Mod> availableAffixes) {
		this.availableAffixes = availableAffixes;
	}

}
