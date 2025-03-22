plugins {
  alias(libs.plugins.spring.boot) apply false
  alias(libs.plugins.dependency.management)
  alias(libs.plugins.java)
}

repositories {
  mavenCentral()
}

dependencies {  
  // see version: [projectRoot]/gradle/libs.versions.toml
  // default
  implementation(platform(libs.boot.bom))
  implementation(libs.starter)
  testImplementation(libs.starter.test)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
  toolchain {
      languageVersion = JavaLanguageVersion.of(23)
  }
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-parameters")
}
