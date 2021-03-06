package universalelectricity;

import net.minecraft.server.ItemBlock;
import net.minecraft.server.ItemStack;
import universalelectricity.ore.UEOreManager;


/**
 * The Class ItemUniversalOre0.
 */
public class ItemUniversalOre0 extends ItemBlock
{
    
    /**
     * Instantiates a new item universal ore0.
     *
     * @param i the i
     */
    public ItemUniversalOre0(int i)
    {
        super(i);
        setMaxDurability(0);
        a(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place.
     *
     * @param i the i
     * @return the int
     */
    public int filterData(int i)
    {
        return i;
    }

    /* (non-Javadoc)
     * @see net.minecraft.server.ItemBlock#a(net.minecraft.server.ItemStack)
     */
    public String a(ItemStack itemstack)
    {
        return (new StringBuilder()).append(super.getName()).append(".").append(UEOreManager.BlockOre[0].ores[itemstack.getData()].name).toString();
    }
}
