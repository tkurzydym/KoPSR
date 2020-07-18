plugins {
    kotlin("jvm") version "1.3.72"
}

group = "me.tkurzydym"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.2")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:4.1.1") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core-jvm:4.1.1") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property-jvm:4.1.1") // for kotest property test
    testImplementation("io.mockk:mockk:1.10.0")
    testImplementation("io.kotest:kotest-runner-console-jvm:4.1.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()
    }
}
