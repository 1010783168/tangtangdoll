package org.hiedacamellia.tangtangdoll.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.hiedacamellia.tangtangdoll.TangTangDoll;
import org.hiedacamellia.tangtangdoll.registries.TTDBlock;

public class ChineseLanguageProvider extends LanguageProvider {

    public ChineseLanguageProvider(PackOutput output) {
        super(output, TangTangDoll.MODID, "zh_cn");
    }
//玩偶名字和标签 中文
    @Override
    protected void addTranslations() {

        add("item_group.tangtangdoll", "糖糖玩偶");

        addWithTooltip(TTDBlock.DOLL.get(), "示例","这是一个示例");
        addWithTooltip(TTDBlock.DOLL_SMALL.get(), "小号示例","糖糖");
        addWithTooltip(TTDBlock.DOLL_SMALL_HD.get(), "小号示例（高清）","§l§b示例");
        addWithTooltip(TTDBlock.MISS_HEIHU.get(), "§l§b玩偶","§l§bcv:Miss_Heihu");
        addWithTooltip(TTDBlock.BILIBILI_3739055.get(), "§l§c玩偶","§l§cCV:Bilibili_3739055");
        addWithTooltip(TTDBlock.DOLL_HD.get(), "§l§b玩偶","§l§bcv:Bilibili_3739055");

    }

    public void addWithTooltip(Block key, String name, String tooltip) {
        this.add(key.getDescriptionId(), name);
        this.add(key.getDescriptionId()+".desc", tooltip);
    }
}

