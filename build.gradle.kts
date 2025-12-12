buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        // This forces the correct Bouncy Castle version for the build system
        classpath("org.bouncycastle:bcutil-jdk18on:1.79")
    }
}