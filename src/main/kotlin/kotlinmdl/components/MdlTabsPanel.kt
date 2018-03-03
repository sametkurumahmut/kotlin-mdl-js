package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlTabsPanel(element: HTMLDivElement, id: String, isActive: Boolean = false, classes: String = String.empty)
    : MdlTabsPanelBase<HTMLDivElement>(element, id, isActive, classes) {

    constructor(id: String, isActive: Boolean = false, classes: String = String.empty)
            : this(document.create.div(), id, isActive, classes)
}
