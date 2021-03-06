package kotlinmdl.components.style

import kotlinmdl.internal.extensions.empty
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import kotlinx.html.dom.create
import kotlinx.html.js.i
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlMaterialIcon(
        element: HTMLElement,
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty) : MdlMaterialIconBase<HTMLElement>(element, icon, color, classes) {

    constructor(icon: IMaterialIcon, color: IMdlTextColor? = null, classes: String = String.empty)
            : this(document.create.i(), icon, color, classes)
}
