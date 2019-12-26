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

    //Ktor
    implementation("io.ktor:ktor-client-core:1.2.6")
    implementation("io.ktor:ktor-client-apache:1.2.6")

    //Utils
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("commons-io:commons-io:2.6")

    //Logging
    implementation("io.github.microutils:kotlin-logging:1.7.8")
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("org.apache.logging.log4j:log4j-core:2.13.0")
    implementation("org.apache.logging.log4j:log4j-api:2.13.0")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.13.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}
