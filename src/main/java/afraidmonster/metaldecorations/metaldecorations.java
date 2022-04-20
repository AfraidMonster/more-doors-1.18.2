package afraidmonster.metaldecorations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class metaldecorations implements ModInitializer {

	public static final String MOD_ID = "metaldecorations";

	public static final ItemGroup METAL_DOORS = FabricItemGroupBuilder.create(
            new Identifier("metaldecorations", "metal_decorations"))
            .icon(() -> new ItemStack(metaldecorations.GOLD_DOOR)) 
            .build();
	//Metal Doors
	public static final Block GOLD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));
	public static final Block GOLD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK));
	
	public static final Block DIAMOND_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));
	public static final Block DIAMOND_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));
	
	public static final Block LAPIS_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));
	public static final Block LAPIS_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK));
	
	public static final Block COPPER_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK));
	public static final Block COPPER_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COPPER_BLOCK));
	
	public static final Block NETHERITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
	public static final Block NETHERITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
	
	public static final Block EMERALD_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));
	public static final Block EMERALD_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK));
	
	public static final Block REDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));
	public static final Block REDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.REDSTONE_BLOCK));
	
	public static final Block COAL_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COAL_BLOCK));
	public static final Block COAL_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COAL_BLOCK));

	//Stone Doors
	public static final Block STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.STONE));
	public static final Block STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.STONE));

	public static final Block COBBLESTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE));
	public static final Block COBBLESTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE));

	public static final Block ANDESITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.ANDESITE));
	public static final Block ANDESITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.ANDESITE));

	public static final Block DIORITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.DIORITE));
	public static final Block DIORITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.DIORITE));

	public static final Block GRANITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.GRANITE));
	public static final Block GRANITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.GRANITE));

	public static final Block SANDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.SANDSTONE));
	public static final Block SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.SANDSTONE));

	public static final Block RED_SANDSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE));
	public static final Block RED_SANDSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE));

	public static final Block COBBLED_DEEPSLATE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE));
	public static final Block COBBLED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE));

	public static final Block CALCITE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.CALCITE));
	public static final Block CALCITE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.CALCITE));

	public static final Block POLISHED_DEEPSLATE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE));
	public static final Block POLISHED_DEEPSLATE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE));

	public static final Block BASALT_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BASALT));
	public static final Block BASALT_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BASALT));

	public static final Block BLACKSTONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE));
	public static final Block BLACKSTONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE));

	public static final Block NETHERRACK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHERRACK));
	public static final Block NETHERRACK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHERRACK));

	public static final Block END_STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.END_STONE));
	public static final Block END_STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.END_STONE));

	public static final Block PURPUR_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));
	public static final Block PURPUR_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK));

	public static final Block QUARTZ_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK));
	public static final Block QUARTZ_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK));

	public static final Block NETHER_BRICK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS));
	public static final Block NETHER_BRICK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS));

	public static final Block PRISMARINE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.PRISMARINE));
	public static final Block PRISMARINE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.PRISMARINE));

	public static final Block BOOKSHELF_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BOOKSHELF));
	public static final Block BOOKSHELF_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BOOKSHELF));

	public static final Block AMETHYST_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));
	public static final Block AMETHYST_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK));

	//Smooth Stone Doors
	public static final Block SMOOTH_STONE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE));
	public static final Block SMOOTH_STONE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE));

	//Brick Doors
	public static final Block OBSIDIAN_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));
	public static final Block OBSIDIAN_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.OBSIDIAN));

	public static final Block BRICK_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.BRICKS));
	public static final Block BRICK_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.BRICKS));

	public static final Block ICE_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.ICE));
	public static final Block ICE_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.ICE));

	

	

	
	@Override
	public void onInitialize() {
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_door"), GOLD_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_door"), new BlockItem(GOLD_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "gold_trapdoor"), GOLD_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "gold_trapdoor"), new BlockItem(GOLD_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_door"), DIAMOND_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_door"), new BlockItem(DIAMOND_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diamond_trapdoor"), DIAMOND_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diamond_trapdoor"), new BlockItem(DIAMOND_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_door"), LAPIS_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_door"), new BlockItem(LAPIS_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "lapis_trapdoor"), LAPIS_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "lapis_trapdoor"), new BlockItem(LAPIS_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_door"), COPPER_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_door"), new BlockItem(COPPER_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "copper_trapdoor"), COPPER_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "copper_trapdoor"), new BlockItem(COPPER_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_door"), NETHERITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_door"), new BlockItem(NETHERITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherite_trapdoor"), NETHERITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherite_trapdoor"), new BlockItem(NETHERITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_door"), EMERALD_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_door"), new BlockItem(EMERALD_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "emerald_trapdoor"), EMERALD_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "emerald_trapdoor"), new BlockItem(EMERALD_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_door"), REDSTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_door"), new BlockItem(REDSTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "redstone_trapdoor"), REDSTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "redstone_trapdoor"), new BlockItem(REDSTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_door"), COAL_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_door"), new BlockItem(COAL_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "coal_trapdoor"), COAL_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "coal_trapdoor"), new BlockItem(COAL_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "stone_door"), STONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "stone_door"), new BlockItem(STONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "stone_trapdoor"), STONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "stone_trapdoor"), new BlockItem(STONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "cobblestone_door"), COBBLESTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "cobblestone_door"), new BlockItem(COBBLESTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "cobblestone_trapdoor"), COBBLESTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "cobblestone_trapdoor"), new BlockItem(COBBLESTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "andesite_door"), ANDESITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "andesite_door"), new BlockItem(ANDESITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "andesite_trapdoor"), ANDESITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "andesite_trapdoor"), new BlockItem(ANDESITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diorite_door"), DIORITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diorite_door"), new BlockItem(DIORITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "diorite_trapdoor"), DIORITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "diorite_trapdoor"), new BlockItem(DIORITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "granite_door"), GRANITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "granite_door"), new BlockItem(GRANITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "granite_trapdoor"), GRANITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "granite_trapdoor"), new BlockItem(GRANITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "sandstone_door"), SANDSTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "sandstone_door"), new BlockItem(SANDSTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "sandstone_trapdoor"), SANDSTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "sandstone_trapdoor"), new BlockItem(SANDSTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "red_sandstone_door"), RED_SANDSTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "red_sandstone_door"), new BlockItem(RED_SANDSTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "red_sandstone_trapdoor"), RED_SANDSTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "red_sandstone_trapdoor"), new BlockItem(RED_SANDSTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "cobbled_deepslate_door"), COBBLED_DEEPSLATE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "cobbled_deepslate_door"), new BlockItem(COBBLED_DEEPSLATE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "cobbled_deepslate_trapdoor"), COBBLED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "cobbled_deepslate_trapdoor"), new BlockItem(COBBLED_DEEPSLATE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "calcite_door"), CALCITE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "calcite_door"), new BlockItem(CALCITE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "calcite_trapdoor"), CALCITE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "calcite_trapdoor"), new BlockItem(CALCITE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "polished_deepslate_door"), POLISHED_DEEPSLATE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "polished_deepslate_door"), new BlockItem(POLISHED_DEEPSLATE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "polished_deepslate_trapdoor"), POLISHED_DEEPSLATE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "polished_deepslate_trapdoor"), new BlockItem(POLISHED_DEEPSLATE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "basalt_door"), BASALT_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "basalt_door"), new BlockItem(BASALT_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "basalt_trapdoor"), BASALT_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "basalt_trapdoor"), new BlockItem(BASALT_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "blackstone_door"), BLACKSTONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "blackstone_door"), new BlockItem(BLACKSTONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "blackstone_trapdoor"), BLACKSTONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "blackstone_trapdoor"), new BlockItem(BLACKSTONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherrack_door"), NETHERRACK_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherrack_door"), new BlockItem(NETHERRACK_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "netherrack_trapdoor"), NETHERRACK_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "netherrack_trapdoor"), new BlockItem(NETHERRACK_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "end_stone_door"), END_STONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "end_stone_door"), new BlockItem(END_STONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "end_stone_trapdoor"), END_STONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "end_stone_trapdoor"), new BlockItem(END_STONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "purpur_door"), PURPUR_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "purpur_door"), new BlockItem(PURPUR_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "purpur_trapdoor"), PURPUR_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "purpur_trapdoor"), new BlockItem(PURPUR_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "quartz_door"), QUARTZ_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "quartz_door"), new BlockItem(QUARTZ_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "quartz_trapdoor"), QUARTZ_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "quartz_trapdoor"), new BlockItem(QUARTZ_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "nether_brick_door"), NETHER_BRICK_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "nether_brick_door"), new BlockItem(NETHER_BRICK_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "nether_brick_trapdoor"), NETHER_BRICK_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "nether_brick_trapdoor"), new BlockItem(NETHER_BRICK_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "prismarine_door"), PRISMARINE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "prismarine_door"), new BlockItem(PRISMARINE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "prismarine_trapdoor"), PRISMARINE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "prismarine_trapdoor"), new BlockItem(PRISMARINE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "bookshelf_door"), BOOKSHELF_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "bookshelf_door"), new BlockItem(BOOKSHELF_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "bookshelf_trapdoor"), BOOKSHELF_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "bookshelf_trapdoor"), new BlockItem(BOOKSHELF_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "amethyst_door"), AMETHYST_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "amethyst_door"), new BlockItem(AMETHYST_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "amethyst_trapdoor"), AMETHYST_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "amethyst_trapdoor"), new BlockItem(AMETHYST_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "smooth_stone_door"), SMOOTH_STONE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "smooth_stone_door"), new BlockItem(SMOOTH_STONE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "smooth_stone_trapdoor"), SMOOTH_STONE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "smooth_stone_trapdoor"), new BlockItem(SMOOTH_STONE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "obsidian_door"), OBSIDIAN_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "obsidian_door"), new BlockItem(OBSIDIAN_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "obsidian_trapdoor"), OBSIDIAN_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "obsidian_trapdoor"), new BlockItem(OBSIDIAN_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "brick_door"), BRICK_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "brick_door"), new BlockItem(BRICK_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "brick_trapdoor"), BRICK_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "brick_trapdoor"), new BlockItem(BRICK_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));

		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "ice_door"), ICE_DOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "ice_door"), new BlockItem(ICE_DOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));
		Registry.register(Registry.BLOCK, new Identifier("metaldecorations", "ice_trapdoor"), ICE_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("metaldecorations", "ice_trapdoor"), new BlockItem(ICE_TRAPDOOR, new Item.Settings().group(metaldecorations.METAL_DOORS)));


		
















		

















		
















































		
	}

	}

