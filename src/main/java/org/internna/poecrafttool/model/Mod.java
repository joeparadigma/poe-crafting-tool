package org.internna.poecrafttool.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.internna.poecrafttool.model.enums.AFFIXES;

@Entity
@Table(name = "MODS")
public class Mod {

	@Id
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TEMPLATE_TEXT")
	private String template;

	@Column(name = "AFFIX_TYPE")
	private AFFIXES affix;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "mod")
	private List<ModTier> tiers;

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

	public String getTemplate() {
		return template;
	}

	public void setTemplate(final String template) {
		this.template = template;
	}

	public AFFIXES getAffix() {
		return affix;
	}

	public void setAffix(final AFFIXES affix) {
		this.affix = affix;
	}

	public List<ModTier> getTiers() {
		return tiers;
	}

	public void setTiers(final List<ModTier> tiers) {
		this.tiers = tiers;
	}

}
