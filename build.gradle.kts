plugins {
    java
    alias(libs.plugins.shadow)
    alias(libs.plugins.bukkit.yml)
}

group = "com.solarrabbit.colorbundles"
version = "1.8"


dependencies {
    compileOnly(libs.spigot.api)
    compileOnly(libs.itemsadder.api)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}

bukkit {
    name = "ColorBundles"
    main = "com.solarrabbit.colorbundles.ColorBundles"
    version = project.version.toString()
    author = "SolarRabbit"
    apiVersion = "1.21"

    softDepend = listOf("ItemsAdder")

    permissions {
        create("colorbundles.craft") {
            description = "User able to craft color bundles."
            default = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.Permission.Default.TRUE
        }
    }
}
