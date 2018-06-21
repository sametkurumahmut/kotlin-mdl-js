package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

abstract class MdlIconToggleBase<out T : Element> protected constructor(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlComponent<T>(element, classes attributeSeparator IMdlIconToggle.BLOCK_NAME), IMdlIconToggle<T> {

    override var hasRippleEffect by this.toggleClassOfThis(element, HasMdlRippleEffect.MODIFIER_NAME, hasRippleEffect)
}
