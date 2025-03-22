plugins {
  alias(libs.plugins.spring.boot)
  alias(libs.plugins.dependency.management)
  alias(libs.plugins.java)
}

repositories {
  mavenCentral()
}

dependencies {  
  // see version: [projectRoot]/gradle/libs.versions.toml
  // restapi
  implementation(libs.starter.web)
  testImplementation(libs.starter.test)
  // monitor
  implementation(libs.starter.actuator)
  // template engine
  implementation(libs.starter.thymeleaf)
  // graphql
  implementation(libs.starter.graphql)
  testImplementation(libs.starter.graphql.test)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
  toolchain {
      languageVersion = JavaLanguageVersion.of(23)
  }
}

group = "org.example"
version = "0.0.1-SNAPSHOT"
