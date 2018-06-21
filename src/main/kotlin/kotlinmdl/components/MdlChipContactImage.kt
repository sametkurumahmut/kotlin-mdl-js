package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.img
import org.w3c.dom.HTMLImageElement
import kotlin.browser.document

open class MdlChipContactImage(element: HTMLImageElement, classes: String = String.empty)
    : MdlChipContactBase<HTMLImageElement>(element, classes) {

    constructor(alt: String? = null, src: String? = null, classes: String = String.empty)
            : this(document.create.img(alt, src), classes)
}
