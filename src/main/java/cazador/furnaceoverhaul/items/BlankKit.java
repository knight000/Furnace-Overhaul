package cazador.furnaceoverhaul.items;

import java.util.List;

import cazador.furnaceoverhaul.FurnaceOverhaul;
import cazador.furnaceoverhaul.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlankKit extends Item {
	
	public BlankKit(String unlocalizedname) {
		this.setUnlocalizedName(unlocalizedname);
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedname));
		this.setMaxDamage(0);
		this.setCreativeTab(FurnaceOverhaul.FurnaceOverhaulTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.RED + "Right-click function not implemented");
	}
	
}
