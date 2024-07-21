plugins {
    id("io.quarkus.extension")
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:3.12.3"))
    implementation("io.quarkus:quarkus-undertow")
    kapt("io.quarkus:quarkus-extension-processor:3.12.3")
    kaptTest("io.quarkus:quarkus-extension-processor:3.12.3")
}

quarkusExtension {
    deploymentModule.set("my-ext-deployment")
}