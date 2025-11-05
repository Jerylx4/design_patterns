plugins {
    id("java")
}

group = "com.pdd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.zaxxer:HikariCP:7.0.2")
    implementation("org.xerial:sqlite-jdbc:3.46.1.3")
}

tasks.test {
    useJUnitPlatform()
}