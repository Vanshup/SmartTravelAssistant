pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    repositories {
        google()
        mavenCentral()

        // Mapbox Maven repository
        maven { url = uri("https://api.mapbox.com/downloads/v2/releases/maven") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            credentials {
                username = "mapbox"
                password = "sk.eyJ1IjoidmFuc2hpdGFwMTQ3IiwiYSI6ImNtOGZzM3AzdzBiN3Qya3F0Y2kxaTltbzkifQ.PRlYRY8bDvPzbC1DRUC3Tg"
            }
        }
    }
}

rootProject.name = "SmartTravelAssistant"
include(":app")




