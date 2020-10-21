package com.github.476106017.solidoctocarnival.services

import com.intellij.openapi.project.Project
import com.github.476106017.solidoctocarnival.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
