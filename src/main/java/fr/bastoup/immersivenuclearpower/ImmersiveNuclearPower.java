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

package fr.bastoup.immersivenuclearpower;

import fr.bastoup.immersivenuclearpower.registy.ClientRegistry;
import fr.bastoup.immersivenuclearpower.registy.SharedRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(ImmersiveNuclearPower.MOD_ID)
public class ImmersiveNuclearPower {

    public static final String MOD_ID = "immersivenuclearpower";

    private static final Logger LOGGER = LogManager.getLogger();
    private static IEventBus MOD_EVENT_BUS;

    public ImmersiveNuclearPower() {
        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_EVENT_BUS.register(SharedRegistry.class);
        MOD_EVENT_BUS.register(ClientRegistry.class);
    }
}
