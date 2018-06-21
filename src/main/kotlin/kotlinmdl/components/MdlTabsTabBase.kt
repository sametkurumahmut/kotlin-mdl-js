package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlTabsTabBase<out T : Element> protected constructor(
        element: T,
        isActive: Boolean = false,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTabsTab.ELEMENT_NAME) }, classes), IMdlTabsTab<T> {

    override var isActive by this.toggleClassOfThis(element, IMdlTabsTab.IS_ACTIVE_MODIFIER_NAME, isActive)
}
