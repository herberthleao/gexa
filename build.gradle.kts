plugins {
    java
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.openjfx.javafxplugin") version "0.0.13"
}

group = "me.herberthleao"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
    developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")
    runtimeOnly("org.postgresql:postgresql:42.5.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.4")
}

javafx {
    version = "17"
    modules("javafx.controls", "javafx.base", "javafx.graphics", "javafx.fxml")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
