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
  implementation(libs.starter.web)
  testImplementation(libs.starter.test)
}

group = "org.example"
version = "0.0.1-SNAPSHOT"
