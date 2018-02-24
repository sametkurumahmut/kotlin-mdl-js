package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayoutContent(
        element: HTMLDivElement,
        title: String = String.empty,
        classes: String = String.empty,
        body: MdlLayoutContent.() -> Unit = {}) : MdlLayoutContentBase<HTMLDivElement>(element, title, classes) {

    constructor(title: String = String.empty, classes: String = String.empty, body: MdlLayoutContent.() -> Unit = {})
            : this(document.create.div(), title, classes, body)

    init {
        this.body()
    }
}
