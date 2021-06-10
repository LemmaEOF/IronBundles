package space.bbkr.ironbundles.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public class ItemMixin {
	// Add the bundle item back in the creative tab.
	@Inject(method = "appendStacks", at = @At("HEAD"))
	private void onAppendStacks(ItemGroup group, DefaultedList<ItemStack> stacks, CallbackInfo ci) {
		// noinspection ConstantConditions
		if (((Object) this) == Items.BUNDLE && group == ItemGroup.TOOLS) {
			stacks.add(new ItemStack((Item) (Object) this));
		}
	}
}
