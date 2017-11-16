package org.internna.poecrafttool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOD_TIERS")
public class ModTier {

	@Id
	private Integer id;

	@Column(name = "TIER")
	private Integer tier;

	@Column(name = "ILEVEL")
	private Integer itemLevel;

	@Column(name = "PERCENT")
	private Double percent;

	@Column(name = "MIN_RANGE")
	private Integer minRangeValue;

	@Column(name = "MAX_RANGE")
	private Integer maxRangeValue;

	@ManyToOne(optional = false, fetch = FetchType.EAGER) 
    @JoinColumn(name = "MOD", nullable = false, updatable = false)
	private Mod mod;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Mod getMod() {
		return mod;
	}

	public void setMod(final Mod mod) {
		this.mod = mod;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(final Integer tier) {
		this.tier = tier;
	}

	public Integer getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(final Integer itemLevel) {
		this.itemLevel = itemLevel;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(final Double percent) {
		this.percent = percent;
	}

	public Integer getMinRangeValue() {
		return minRangeValue;
	}

	public void setMinRangeValue(final Integer minRangeValue) {
		this.minRangeValue = minRangeValue;
	}

	public Integer getMaxRangeValue() {
		return maxRangeValue;
	}

	public void setMaxRangeValue(final Integer maxRangeValue) {
		this.maxRangeValue = maxRangeValue;
	}

}
