package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.MdlButtonColor
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlColoredMiniFloatingActionButton(
        element: HTMLButtonElement,
        icon: IMdlMaterialIcon<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlMiniFloatingActionButtonBase<HTMLButtonElement>(
        element,
        icon,
        MdlButtonColor.COLORED,
        hasRippleEffect,
        classes) {

    constructor(
            icon: IMdlMaterialIcon<Element>? = null,
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = ButtonType.button,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(document.create.button(formEncType, formMethod, name, type), icon, hasRippleEffect, classes)
}
