package org.internna.poecrafttool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_TYPES")
public class ItemType {

	@Id
	private Integer id;

	@Column(name = "ITEM_TYPE")
	private String type;

	@Column(name = "ITEM_SUBTYPE")
	private String subtype;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(final String subtype) {
		this.subtype = subtype;
	}

}
