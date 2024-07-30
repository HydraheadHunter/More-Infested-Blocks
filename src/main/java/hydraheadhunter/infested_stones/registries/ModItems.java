package hydraheadhunter.infested_stones.registries;

import hydraheadhunter.infested_stones.InfestedStonesHome;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static hydraheadhunter.infested_stones.InfestedStonesHome.MOD_ID;

public class ModItems {
	
	public static void registerModItems(){
		InfestedStonesHome.LOGGER.info("Items");
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrediantItemGroup);
		
	}
	
	private static Item registerItem(String name, Item item){
		return Registry.register( Registries.ITEM, Identifier.of(MOD_ID, name), item);
	}
	
	private static void addItemsToIngrediantItemGroup( FabricItemGroupEntries entries){
	
	}
}
