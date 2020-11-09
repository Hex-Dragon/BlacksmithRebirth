package com.hexdragon.enchrebirth.registry;

import com.hexdragon.enchrebirth.Main;
import com.hexdragon.enchrebirth.block.GrindstoneContainerRe;
import com.hexdragon.enchrebirth.block.anvil.AnvilContainerRe;
import com.hexdragon.enchrebirth.block.anvil.AnvilTileEntity;
import com.hexdragon.enchrebirth.block.anvil.NetheriteAnvilItem;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.network.PacketBuffer;
import net.minecraft.state.IntegerProperty;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegMain {

    // 物品
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    public static final RegistryObject<Item> itemPerfectNetheriteAnvil = ITEMS.register("netherite_anvil", NetheriteAnvilItem.PerfectNetheriteAnvilItem::new);
    public static final RegistryObject<Item> itemChippedNetheriteAnvil = ITEMS.register("chipped_netherite_anvil", NetheriteAnvilItem.ChippedNetheriteAnvilItem::new);
    public static final RegistryObject<Item> itemDamagedNetheriteAnvil = ITEMS.register("damaged_netherite_anvil", NetheriteAnvilItem.DamagedNetheriteAnvilItem::new);

    // Container
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Main.MODID);
    public static final RegistryObject<ContainerType<GrindstoneContainerRe>> containerGrindstone = CONTAINERS.register("grindstone", () -> IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) -> new GrindstoneContainerRe(windowId, inv)));
    public static final RegistryObject<ContainerType<AnvilContainerRe>> containerAnvil = CONTAINERS.register("anvil", () -> IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) -> new AnvilContainerRe(windowId, inv)));

    // TileEntity
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Main.MODID);
    public static RegistryObject<TileEntityType<AnvilTileEntity.PerfectAnvilTileEntity>> tileEntityPerfectAnvil = TILE_ENTITIES.register("anvil_tileentity", () -> TileEntityType.Builder.create(AnvilTileEntity.PerfectAnvilTileEntity::new, Blocks.ANVIL).build(null));
    public static RegistryObject<TileEntityType<AnvilTileEntity.ChippedAnvilTileEntity>> tileEntityChippedAnvil = TILE_ENTITIES.register("chipped_anvil_tileentity", () -> TileEntityType.Builder.create(AnvilTileEntity.ChippedAnvilTileEntity::new, Blocks.CHIPPED_ANVIL).build(null));
    public static RegistryObject<TileEntityType<AnvilTileEntity.DamagedAnvilTileEntity>> tileEntityDamagedAnvil = TILE_ENTITIES.register("damaged_anvil_tileentity", () -> TileEntityType.Builder.create(AnvilTileEntity.DamagedAnvilTileEntity::new, Blocks.DAMAGED_ANVIL).build(null));

    // BlockState
    public static final IntegerProperty MATERIAL = IntegerProperty.create("material", 0, 1);

}
