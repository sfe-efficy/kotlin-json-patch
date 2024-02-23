plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("maven-publish.conventions")
}

group = "io.github.sfe-efficy"
version = "1.0.0"

kotlin {
    jvm {
        // …
    }
    js(IR) {
        // …
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(libs.kotlinx.serialization.json)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}