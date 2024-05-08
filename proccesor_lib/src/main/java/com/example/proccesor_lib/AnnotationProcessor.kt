package com.example.proccesor_lib

import com.example.proccesor_lib.annotations.ToString
import java.awt.PageAttributes.MediaType.NOTE
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

@SupportedAnnotationTypes("com.example.proccesor_lib.annotations.ToString")
class AnnotationProcessor: AbstractProcessor() {
    override fun process(set: MutableSet<out TypeElement>?, roundEnvironment: RoundEnvironment): Boolean {
        val set  = roundEnvironment.getElementsAnnotatedWith(ToString::class.java)
        set.forEach {
            processingEnv.messager.printMessage(Diagnostic.Kind.NOTE,it.toString())
        }
        return true
    }
    override fun getSupportedSourceVersion(): SourceVersion {
        return SourceVersion.RELEASE_8
    }
}