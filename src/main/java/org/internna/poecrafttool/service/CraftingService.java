package org.internna.poecrafttool.service;

import org.internna.poecrafttool.model.Item;
import org.internna.poecrafttool.model.enums.ORBS;

public interface CraftingService {

	Item craft(Item item, ORBS orb);

}
