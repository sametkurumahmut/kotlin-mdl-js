package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlTabsTab(
        element: HTMLAnchorElement,
        hrefId: String,
        isActive: Boolean = false,
        classes: String = String.empty) : MdlTabsTabBase<HTMLAnchorElement>(element, isActive, classes) {

    constructor(hrefId: String, isActive: Boolean = false, classes: String = String.empty)
            : this(document.create.a(), hrefId, isActive, classes)

    init {
        element.href = "#$hrefId"
    }
}
