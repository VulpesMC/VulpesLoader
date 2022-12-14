/*
 * Copyright 2022 Vulpes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sh.talonfox.vulpesloader

import org.spongepowered.asm.launch.MixinBootstrap
import org.spongepowered.asm.mixin.Mixins
import sh.talonfox.vulpesloader.mod.VulpesModLoader

fun main(args: Array<String>?) {
    println("Vulpes Loader is now starting...")
    VulpesModLoader.loadMods()
    MixinBootstrap.init()
    VulpesModLoader.Mixins.forEach(Mixins::addConfiguration)
}