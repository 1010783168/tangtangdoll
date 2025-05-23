package org.hiedacamellia.tangtangdoll.registries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.common.block.DollBlock;
//注册方块
public class TTDBlock {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TangTangDoll.MODID);

	public static final DeferredBlock<Block> DOLL = BLOCKS.register("doll", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));

	public static final DeferredBlock<Block> DOLL_SMALL = BLOCKS.register("doll_small", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));

	public static final DeferredBlock<Block> DOLL_SMALL_HD = BLOCKS.register("doll_small_hd", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));
	public static final DeferredBlock<Block> MISS_HEIHU = BLOCKS.register("miss_heihu", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));
	public static final DeferredBlock<Block> BILIBILI_3739055 = BLOCKS.register("bilibili_3739055", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));
	public static final DeferredBlock<Block> DOLL_HD = BLOCKS.register("doll_hd", ()->new DollBlock(BlockBehaviour.Properties.of()
			.noOcclusion().sound(SoundType.WOOL).strength(1f, 100f).pushReaction(PushReaction.IGNORE)));
}
