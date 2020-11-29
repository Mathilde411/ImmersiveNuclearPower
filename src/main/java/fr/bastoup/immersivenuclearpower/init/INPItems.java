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

package fr.bastoup.immersivenuclearpower.init;

import fr.bastoup.immersivenuclearpower.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class INPItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item FLUORITE = new ItemBase("fluorite");
    public static final Item ENRICHED_URANIUM = new ItemBase("enriched_uranium");
    public static final Item MILITARY_GRADE_URANIUM = new ItemBase("military_grade_uranium");
    public static final Item PELLET_MOLD = new ItemBase("pellet_mold");
    public static final Item FUEL_ROD_MOLD = new ItemBase("fuel_rod_mold");
    public static final Item FUEL_PELLET = new ItemBase("fuel_pellet", 1);
    public static final Item EMPTY_FUEL_ROD = new ItemBase("empty_fuel_rod", 16);
    public static final Item FUEL_ROD = new ItemBase("fuel_rod", 1);
}
