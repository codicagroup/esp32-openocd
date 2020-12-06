package com.github.codicagroup.esp32openocd.services

import com.intellij.openapi.project.Project
import com.github.codicagroup.esp32openocd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
