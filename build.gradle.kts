group = "org.remusrd"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.3.72" apply true

    id("io.kotless") version "0.1.5" apply true
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.kotless", "lang", "0.1.5")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
