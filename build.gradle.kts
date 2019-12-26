plugins {
    kotlin("jvm") version "1.3.61"
}

group = "com.scaledifferent"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-client-core:1.2.6")
    implementation("io.ktor:ktor-client-apache:1.2.6")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("commons-io:commons-io:2.6")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}