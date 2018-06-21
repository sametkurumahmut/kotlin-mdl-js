package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlChipActionBase<out T : Element> protected constructor(
        element: T,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlChipAction.ELEMENT_NAME) }, classes), IMdlChipAction<T> {

    override var icon: IMdlMaterialIcon<Element>? by this.replaceOrAppendExistingChildOfThis(element, icon)
}
