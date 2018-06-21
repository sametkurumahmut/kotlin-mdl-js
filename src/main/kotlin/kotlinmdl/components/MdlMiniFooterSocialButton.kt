package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlMiniFooterSocialButton(element: HTMLButtonElement, classes: String = String.empty)
    : MdlComponent<HTMLButtonElement>(
        element.apply { classList.add(IMdlMiniFooterSocialButton.ELEMENT_NAME) },
        classes), IMdlMiniFooterSocialButton<HTMLButtonElement> {

    constructor(
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = null,
            classes: String = String.empty) : this(document.create.button(formEncType, formMethod, name, type), classes)
}
