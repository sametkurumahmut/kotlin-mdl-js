package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.nav
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlNav(element: HTMLElement, classes: String = String.empty) : MdlNavBase<HTMLElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.nav(), classes)
}
