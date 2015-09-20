package com.jfixby.r3.fokker.api;

import com.jfixby.cmns.api.assets.AssetID;
import com.jfixby.cmns.api.components.ComponentInstaller;
import com.jfixby.r3.api.ui.unit.Unit;

public class UnitsSpawner {
	static private ComponentInstaller<UnitSpawnerComponent> componentInstaller = new ComponentInstaller<UnitSpawnerComponent>(
			"UnitSpawnerComponent");

	public static final void installComponent(UnitSpawnerComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static final UnitSpawnerComponent invoke() {
		return componentInstaller.invokeComponent();
	}

	public static final UnitSpawnerComponent component() {
		return componentInstaller.getComponent();
	}

	public static Unit spawnUnit(AssetID unitClassId) {
		return invoke().spawnUnit(unitClassId);
	}
}