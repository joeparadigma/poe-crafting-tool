package org.internna.poecrafttool.service.impl;

import org.internna.poecrafttool.model.Item;
import org.internna.poecrafttool.model.enums.ORBS;
import org.internna.poecrafttool.service.CraftingService;
import org.springframework.stereotype.Service;

@Service
public class CraftingServiceImpl implements CraftingService{

	@Override public Item craft(final Item item, final ORBS orb) {
		return item;
	}

}
