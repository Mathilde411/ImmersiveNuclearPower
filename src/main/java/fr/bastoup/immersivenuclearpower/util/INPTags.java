/*
 Copyright 2020 BastouP.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package fr.bastoup.immersivenuclearpower.util;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ItemTags;

public class INPTags {

    // Items
    public static final INamedTag<Item> GEMS_FLUORITE = forgeItemTag("gems/fluorite");

    //Fliuds
    public static final INamedTag<Fluid> HYDROFLUORIC_ACID = forgeFluidTag("hydrofluoric_acid");
    public static final INamedTag<Fluid> NITRIC_ACID = forgeFluidTag("nitric_acid");
    public static final INamedTag<Fluid> SULFURIC_ACID = forgeFluidTag("sulfuric_acid");
    public static final INamedTag<Fluid> SULFUR_DIOXIDE = forgeFluidTag("sulfur_dioxide");
    public static final INamedTag<Fluid> SULFUR_TRIOXIDE = forgeFluidTag("sulfur_trioxide");
    public static final INamedTag<Fluid> URANIUM_DIOXIDE = forgeFluidTag("uranium_dioxide");
    public static final INamedTag<Fluid> URANIUM_HEXAFLUORIDE = forgeFluidTag("uranium_hexafluoride");
    public static final INamedTag<Fluid> OXYGEN = forgeFluidTag("oxygen");
    public static final INamedTag<Fluid> HYDROGEN = forgeFluidTag("hydrogen");

    //Blocks
    public static final INamedTag<Block> SALTPETER_ORE = forgeBlockTag("ores/saltpeter");
    public static final INamedTag<Block> FLUORITE_ORE = forgeBlockTag("ores/fluorite");
    public static final INamedTag<Block> FLUORITE_BLOCK = forgeBlockTag("fluorite");

    private static INamedTag<Item> forgeItemTag(String name) {
        return ItemTags.makeWrapperTag("forge:" + name);
    }

    private static INamedTag<Fluid> forgeFluidTag(String name) {
        return FluidTags.makeWrapperTag("forge:" + name);
    }

    private static INamedTag<Block> forgeBlockTag(String name) {
        return BlockTags.makeWrapperTag("forge:" + name);
    }
}
