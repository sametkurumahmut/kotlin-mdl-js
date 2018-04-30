package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlButtonColor
import org.w3c.dom.Element

abstract class MdlMiniFloatingActionButtonBase<out T : Element> protected constructor(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlFloatingActionButtonBase<T>(
        element.apply { classList.add(IMdlMiniFloatingActionButton.MODIFIER_NAME) },
        icon,
        buttonColor,
        hasRippleEffect,
        classes), IMdlMiniFloatingActionButton<T>
