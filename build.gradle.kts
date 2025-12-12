// Root build.gradle.kts
buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        // Define the version once
        val bcVersion = "1.79"
        
        // Force ALL Bouncy Castle modules to the same version to avoid conflicts
        classpath("org.bouncycastle:bcprov-jdk18on:$bcVersion")
        classpath("org.bouncycastle:bcpkix-jdk18on:$bcVersion")
        classpath("org.bouncycastle:bcutil-jdk18on:$bcVersion")
    }
}