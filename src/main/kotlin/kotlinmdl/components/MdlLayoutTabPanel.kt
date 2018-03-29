package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.section
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlLayoutTabPanel(
        element: HTMLElement,
        id: String, isActive: Boolean = false,
        classes: String = String.empty) : MdlLayoutTabPanelBase<HTMLElement>(element, id, isActive, classes) {

    constructor(id: String, isActive: Boolean = false, classes: String = String.empty)
            : this(document.create.section(), id, isActive, classes)
}
