package afraidmonster.metaldecorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class metaldecorationsclient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.GOLD_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.DIAMOND_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.GOLD_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.DIAMOND_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.LAPIS_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.LAPIS_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COPPER_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COPPER_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.NETHERITE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.NETHERITE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.EMERALD_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.EMERALD_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.REDSTONE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.REDSTONE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COAL_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COAL_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.ANDESITE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.ANDESITE_TRAPDOOR, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.POLISHED_DEEPSLATE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.POLISHED_DEEPSLATE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.GRANITE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.NETHER_BRICK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.PRISMARINE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.BASALT_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.SANDSTONE_DOOR, RenderLayer.getTranslucent());



                                                                                                                                                                              
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.SANDSTONE_TRAPDOOR, RenderLayer.getTranslucent());
        
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.RED_SANDSTONE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.RED_SANDSTONE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.PURPUR_DOOR, RenderLayer.getTranslucent());
        
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.BRICK_DOOR, RenderLayer.getTranslucent());
        
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.NETHERRACK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.NETHERRACK_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.SMOOTH_STONE_DOOR, RenderLayer.getTranslucent());
        
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.ICE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.CALCITE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.CALCITE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.GRANITE_TRAPDOOR, RenderLayer.getTranslucent());
        
        
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COBBLESTONE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.COBBLED_DEEPSLATE_TRAPDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(metaldecorations.BASALT_TRAPDOOR, RenderLayer.getTranslucent());
        
        

        

        
    }

    
    
}
