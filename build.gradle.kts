plugins {
    id("java")
}

group = "org.idk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/")
    maven("https://oss.sonatype.org/content/repositories/central/")
    maven("https://maven.enginehub.org/repo/")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
    implementation("net.dv8tion:JDA:5.0.0-beta.12")
    implementation("org.yaml:snakeyaml:2.0")
    implementation("com.sk89q.worldedit:worldedit-bukkit:7.2.12")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}

tasks.test {
    useJUnitPlatform()
}