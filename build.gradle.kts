plugins {
    val kotlinVersion = "1.9.22"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.16.0"
}

group = "io.huvz"
version = "0.1.0"
dependencies {
    compileOnly("xyz.cssxsh.mirai:mirai-skia-plugin:1.3.2")
    compileOnly("xyz.cssxsh.mirai:mirai-hibernate-plugin:2.8.1")
}
repositories {
    if (System.getenv("CI")?.toBoolean() != true) {
        maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    }
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")

}
