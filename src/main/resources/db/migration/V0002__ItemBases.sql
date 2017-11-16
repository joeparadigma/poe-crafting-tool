-- Types of items
INSERT INTO ITEM_TYPES(ID, ITEM_TYPE, ITEM_SUBTYPE)
	VALUES(1, 'Weapon', 'Claw');

-- Implicit mods
INSERT INTO IMPLICIT_MODS(ID, NAME, MIN_RANGE, MAX_RANGE, TEMPLATE_TEXT)
	VALUES(1, 'Life gain on hit', 3, 3, '+{} Life gained for each Enemy hit by Attacks');

-- All available item bases
INSERT INTO ITEM_BASES(ID, ITEM_TYPE, ITEM_IMPLICIT, NAME, REQUIRED_STR, REQUIRED_DEX, REQUIRED_INT, REQUIRED_LEVEL)
	VALUES(1, 1, 1, 'Nailed Fist', 0, 11, 11, 3);