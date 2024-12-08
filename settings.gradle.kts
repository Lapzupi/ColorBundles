rootProject.name = "LapzupiColorBundles"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://jitpack.io")
    }
    versionCatalogs {
        create("libs") {
            library("spigot-api","org.spigotmc:spigot-api:1.21.1-R0.1-SNAPSHOT")
            library("itemsadder-api","com.github.LoneDev6:api-itemsadder:3.6.3-beta-14")
            plugin("shadow", "com.gradleup.shadow").version("9.0.0-beta4")
            plugin("bukkit-yml","net.minecrell.plugin-yml.bukkit").version("0.6.0")
        }
    }
}