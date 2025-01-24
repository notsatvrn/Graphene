pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
        mavenLocal()
    }
}

rootProject.name = "Graphene"
include("Graphene-API", "Graphene-Server")
