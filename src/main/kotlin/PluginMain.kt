package org.example.mirai.plugin


import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info


object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "mirai-gourp-speech-statistics",
        name = "群聊发言统计",
        version = "0.1.0"
    ) {
        author("huvz")
        info(
            """
            本插件主要用于群成员的发言统计与整理
        """
        )
        dependsOn("xyz.cssxsh.mirai.plugin.mirai-skia-plugin", ">= 1.1.0", false)
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }

    }

}
