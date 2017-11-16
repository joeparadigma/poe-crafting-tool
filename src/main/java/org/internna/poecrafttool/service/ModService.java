package org.internna.poecrafttool.service;

import java.util.List;

import org.internna.poecrafttool.model.Item;
import org.internna.poecrafttool.model.Mod;
import org.springframework.data.util.Pair;

public interface ModService {

	Pair<List<Mod>, List<Mod>> obtainMods(Item item);

}
