package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlShadow
import kotlinmdl.style.MdlShadow
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlCard(element: HTMLDivElement, shadow: IMdlShadow? = MdlShadow.DP2, classes: String = String.empty)
    : MdlCardBase<HTMLDivElement>(element, shadow, classes) {

    constructor(shadow: IMdlShadow? = MdlShadow.DP2, classes: String = String.empty)
            : this(document.create.div(), shadow, classes)
}
