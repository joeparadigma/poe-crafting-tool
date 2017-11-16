package org.internna.poecrafttool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IMPLICIT_MODS")
public class ImplicitMod {

	@Id
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TEMPLATE_TEXT")
	private String template;

	@Column(name = "MIN_RANGE")
	private Integer minRangeValue;

	@Column(name = "MAX_RANGE")
	private Integer maxRangeValue;

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
