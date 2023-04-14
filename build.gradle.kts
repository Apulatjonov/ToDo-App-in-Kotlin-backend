import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.7.22"
    kotlin("plugin.spring") version "1.7.22"
    kotlin("plugin.jpa") version "1.7.22"
    kotlin("plugin.lombok") version "1.8.20"
    id("io.freefair.lombok") version "5.3.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.flywaydb:flyway-core")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation ("org.springframework.boot:spring-boot-starter-security:2.6.7")

    implementation("org.springframework.security:spring-security-config:6.0.2")


    implementation ("org.springframework.boot:spring-boot-starter-mail")
    annotationProcessor ("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation ("junit:junit:4.13.1")

//    implementation ("org.springframework.boot', name: 'spring-boot-starter-oauth2-resource-server")
    implementation ("org.springframework.boot:spring-boot-starter-validation:2.7.5")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
//    implementation ("org.liquibase:liquibase-core")
    implementation ("org.springframework.boot:spring-boot-starter-hateoas")
    implementation ("org.modelmapper:modelmapper:2.3.7")
//    implementation("com.google.code.gson', name: 'gson', version: '2.10")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
