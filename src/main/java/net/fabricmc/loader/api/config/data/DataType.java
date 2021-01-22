/*
 * Copyright 2016 FabricMC
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

package net.fabricmc.loader.api.config.data;

import net.fabricmc.loader.api.config.value.ValueKey;
import net.fabricmc.loader.config.Identifiable;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a type of data that can be attached to a specific config value or config definition.
 * See {@link ValueKey#getData(DataType)}.
 */
public class DataType<T> extends Identifiable {
	public static final DataType<String> COMMENT = new DataType<>("fabric", "comment");

	public DataType(@NotNull String namespace, @NotNull String name) {
		super(namespace, name);
	}
}
