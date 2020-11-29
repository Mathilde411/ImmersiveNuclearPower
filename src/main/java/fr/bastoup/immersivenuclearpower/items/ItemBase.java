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

package fr.bastoup.immersivenuclearpower.items;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import fr.bastoup.immersivenuclearpower.init.INPItems;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name) {
        super(new Item.Properties().group(ImmersiveEngineering.itemGroup));
        setRegistryName(name);

        INPItems.ITEMS.add(this);
    }

    public ItemBase(String name, int stackSize) {
        super(new Item.Properties().maxStackSize(stackSize).group(ImmersiveEngineering.itemGroup));
        setRegistryName(name);

        INPItems.ITEMS.add(this);
    }
}
