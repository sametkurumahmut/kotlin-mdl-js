package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import kotlinx.html.dom.create
import kotlinx.html.js.label
import org.w3c.dom.HTMLLabelElement
import kotlin.browser.document

open class MdlBasicIconToggle(
        element: HTMLLabelElement,
        id: String,
        labelIcon: IMaterialIcon,
        labelColor: IMdlTextColor? = null,
        isChecked: Boolean = false,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlBasicIconToggleBase<HTMLLabelElement>(
        element,
        id,
        labelIcon,
        labelColor,
        isChecked,
        hasRippleEffect,
        classes) {

    constructor(
            id: String,
            labelIcon: IMaterialIcon,
            labelColor: IMdlTextColor? = null,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) :
            this(
                    document.create.label().also { it.htmlFor = id },
                    id,
                    labelIcon,
                    labelColor,
                    isChecked,
                    hasRippleEffect,
                    classes)
}
