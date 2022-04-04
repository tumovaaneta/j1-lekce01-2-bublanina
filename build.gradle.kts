plugins {
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.miglayout:miglayout-swing:5.0")
    implementation("net.sevecek:sevecek-net-utils:0.9.1")
}

application {
    mainClass.set("cz.czechitas.intro.engine.Main")
}

