package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.internal.extensions.toggleClassOfThis
import kotlinmdl.style.HasMdlRippleEffect
import kotlinmdl.style.IMdlButtonColor
import org.w3c.dom.Element

abstract class MdlButtonBase<out T : Element> protected constructor(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlComponent<T>(element, classes attributeSeparator IMdlButton.BLOCK_NAME), IMdlButton<T> {

    override var buttonColor by this.replaceNewClassOfThis(element, buttonColor)
    override var hasRippleEffect by this.toggleClassOfThis(element, HasMdlRippleEffect.MODIFIER_NAME, hasRippleEffect)
    override var isDisabled by this.toggleClassOfThis(element, IMdlButton.DISABLED_MODIFIER_NAME)
}
