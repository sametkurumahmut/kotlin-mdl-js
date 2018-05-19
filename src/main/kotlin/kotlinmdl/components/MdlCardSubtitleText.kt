package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.h2
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document

open class MdlCardSubtitleText(element: HTMLHeadingElement, text: String, classes: String = String.empty)
    : MdlCardSubtitleTextBase<HTMLHeadingElement>(element, text, classes) {

    constructor(text: String, classes: String = String.empty) : this(document.create.h2(), text, classes)
}
