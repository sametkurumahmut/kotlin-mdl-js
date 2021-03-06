package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinmdl.style.IMdlButtonColor
import org.w3c.dom.Element

abstract class MdlFloatingActionButtonBase<out T : Element> protected constructor(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlButtonBase<T>(
        element.apply { classList.add(IMdlFloatingActionButton.MODIFIER_NAME) },
        buttonColor,
        hasRippleEffect,
        classes), IMdlFloatingActionButton<T> {

    override var icon by this.replaceOrAppendExistingChildOfThis(element, icon)
}
