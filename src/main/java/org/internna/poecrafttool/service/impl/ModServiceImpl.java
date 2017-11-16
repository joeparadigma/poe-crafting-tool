package org.internna.poecrafttool.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.internna.poecrafttool.model.Item;
import org.internna.poecrafttool.model.ItemBase;
import org.internna.poecrafttool.model.Mod;
import org.internna.poecrafttool.model.enums.AFFIXES;
import org.internna.poecrafttool.repository.ItemBaseRepository;
import org.internna.poecrafttool.service.ModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ModServiceImpl implements ModService {

	@Autowired private ItemBaseRepository repository;

	@Override public Pair<List<Mod>, List<Mod>> obtainMods(final Item item) {
		List<Mod> mods = null;
		if ((item != null) && (item.getBaseType() != null) && (item.getBaseType().getId() != null)) {
			final Optional<ItemBase> base = repository.findById(item.getBaseType().getId());
			if (base.isPresent()) {
				mods = base.get().getAvailableAffixes();
			}
		}
		return CollectionUtils.isEmpty(mods) ? Pair.of(Collections.emptyList(), Collections.emptyList()): splitMods(mods);
	}

	protected final Pair<List<Mod>, List<Mod>> splitMods(final List<Mod> mods) {
		final List<Mod> sufixes = new ArrayList<>();
		final List<Mod> prefixes = new ArrayList<>();
		mods.forEach(mod -> {
			if (AFFIXES.PREFIX.equals(mod.getAffix())) {
				prefixes.add(mod);
			} else {
				sufixes.add(mod);
			}
		});
		return Pair.of(prefixes, sufixes);
	}

}
