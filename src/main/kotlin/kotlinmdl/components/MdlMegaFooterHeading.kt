package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.h1
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document

open class MdlMegaFooterHeading(element: HTMLHeadingElement, text: String, classes: String = String.empty)
    : MdlMegaFooterHeadingBase<HTMLHeadingElement>(element, text, classes) {

    constructor(text: String, classes: String = String.empty) : this(document.create.h1(), text, classes)
}
