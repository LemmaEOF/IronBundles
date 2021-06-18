package space.bbkr.ironbundles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronBundles implements ModInitializer {
	public static final String MODID = "ironbundles";

	public static final CustomBundleItem IRON_BUNDLE = register("iron_bundle",
			new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 128));

	public static final CustomBundleItem GOLD_BUNDLE = register("gold_bundle",
			new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 256));

	public static final CustomBundleItem DIAMOND_BUNDLE = register("diamond_bundle",
			new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 512));

	public static final CustomBundleItem NETHERITE_BUNDLE = register("netherite_bundle",
			new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 1024));

	@Override
	public void onInitialize() {

	}

	public static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
	}
}
