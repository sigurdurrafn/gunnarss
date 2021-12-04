package com.gunnarss.web

import org.intellij.markdown.flavours.commonmark.CommonMarkFlavourDescriptor
import org.intellij.markdown.html.HtmlGenerator
import org.intellij.markdown.parser.MarkdownParser

typealias  Markdown = String

class Blog {

        val src = "Some *Markdown*".toHtml()

    fun Markdown.toHtml(): String {
        val flavour = CommonMarkFlavourDescriptor()
        val parsedTree = MarkdownParser(flavour).buildMarkdownTreeFromString(this)
        return HtmlGenerator(this, parsedTree, flavour).generateHtml()
    }
}

