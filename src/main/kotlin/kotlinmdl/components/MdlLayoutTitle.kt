package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlLayoutTitle(element: HTMLSpanElement, title: String, classes: String = String.empty)
    : MdlLayoutTitleBase<HTMLSpanElement>(element, title, classes) {

    constructor(title: String, classes: String = String.empty) : this(document.create.span(), title, classes)
}
