package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

abstract class MdlBasicIconToggleBase<out T : Element> protected constructor(
        element: T,
        id: String,
        labelIcon: IMaterialIcon,
        labelColor: IMdlTextColor? = null,
        isChecked: Boolean = false,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlIconToggleBase<T>(element, hasRippleEffect, classes), IMdlBasicIconToggle<T> {

    override var input: IMdlIconToggleInput<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlIconToggleInput(id, isChecked))

    override var label: IMdlIconToggleLabel<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlIconToggleLabel(labelIcon, labelColor))
}
