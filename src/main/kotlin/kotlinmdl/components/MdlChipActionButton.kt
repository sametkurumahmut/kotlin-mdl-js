package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.empty
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlChipActionButton(
        element: HTMLButtonElement,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty) : MdlChipActionBase<HTMLButtonElement>(element, icon, classes) {

    constructor(
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = ButtonType.button,
            icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
            classes: String = String.empty)
            : this(document.create.button(formEncType, formMethod, name, type), icon, classes)
}
