package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.MdlButtonColor
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlColoredRaisedButton(
        element: HTMLButtonElement,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlRaisedButtonBase<HTMLButtonElement>(element, MdlButtonColor.COLORED, hasRippleEffect, classes) {

    constructor(
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = ButtonType.button,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(document.create.button(formEncType, formMethod, name, type), hasRippleEffect, classes)
}
