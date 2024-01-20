pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "beef"
for (name in listOf("Leaf-API", "Leaf-Server")) {
    val projName = name.lowercase()
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
