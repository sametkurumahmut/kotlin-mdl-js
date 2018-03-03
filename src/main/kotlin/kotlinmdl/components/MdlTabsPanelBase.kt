package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlTabsPanelBase<out T : Element> protected constructor(
        element: T,
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTabsPanel.ELEMENT_NAME) }, classes), IMdlTabsPanel<T> {

    init {
        element.id = id
    }

    override var isActive by this.toggleClassOfThis(element, IMdlTabsPanel.IS_ACTIVE_MODIFIER_NAME, isActive)
}
