package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlTabLayout(
        element: HTMLDivElement,
        tabMode: MdlTabLayoutTabMode = MdlTabLayoutTabMode.SCROLLABLE,
        classes: String = String.empty) : MdlTabLayoutBase<HTMLDivElement>(element, tabMode, classes) {

    constructor(tabMode: MdlTabLayoutTabMode = MdlTabLayoutTabMode.SCROLLABLE, classes: String = String.empty)
            : this(document.create.div(), tabMode, classes)
}
