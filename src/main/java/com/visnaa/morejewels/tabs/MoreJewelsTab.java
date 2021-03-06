package com.visnaa.morejewels.tabs;

import com.visnaa.morejewels.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoreJewelsTab extends ItemGroup
{

    public MoreJewelsTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.RUBY.get());
    }

    @Override
    public boolean hasSearchBar() {
        return false;
    }

    @Override
    public boolean isOnTopRow() {
        return true;
    }

    @Override
    public boolean hasScrollbar() {
        return true;
    }
}
