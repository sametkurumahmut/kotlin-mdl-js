package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlButtonColor
import org.w3c.dom.Element

abstract class MdlRaisedButtonBase<out T : Element> protected constructor(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlButtonBase<T>(
        element.apply { classList.add(IMdlRaisedButton.MODIFIER_NAME) },
        buttonColor,
        hasRippleEffect,
        classes), IMdlRaisedButton<T>
