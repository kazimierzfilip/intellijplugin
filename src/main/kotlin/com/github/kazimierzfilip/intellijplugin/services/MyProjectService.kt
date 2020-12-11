package com.github.kazimierzfilip.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.kazimierzfilip.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
