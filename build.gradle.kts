plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Source: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.40.0")
    // Source: https://mvnrepository.com/artifact/io.cucumber/cucumber-java

    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.2")
    // Source: https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation("io.github.bonigarcia:webdrivermanager:6.3.3")

        testImplementation("org.junit.platform:junit-platform-suite:1.10.0")

    testImplementation ("io.qameta.allure:allure-cucumber7-jvm:2.24.0")
    testImplementation ("io.qameta.allure:allure-junit-platform:2.24.0")

    testImplementation("io.cucumber:cucumber-java:7.14.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")



}
allure {
    version.set("2.24.0")
}
tasks.test {
    useJUnitPlatform()
}