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

package fr.bastoup.immersivenuclearpower.registy;

import fr.bastoup.immersivenuclearpower.ImmersiveNuclearPower;
import fr.bastoup.immersivenuclearpower.init.INPBlocks;
import fr.bastoup.immersivenuclearpower.init.INPFluids;
import fr.bastoup.immersivenuclearpower.init.INPItems;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = ImmersiveNuclearPower.MOD_ID
)
public class SharedRegistry {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(INPItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(INPBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onFluidRegister(RegistryEvent.Register<Fluid> event) {
        event.getRegistry().registerAll(INPFluids.FLUIDS.toArray(new Fluid[0]));
    }
}
