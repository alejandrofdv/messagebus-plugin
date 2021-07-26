package com.github.alejandrofdv.messagebusplugin.services

import com.github.alejandrofdv.messagebusplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
