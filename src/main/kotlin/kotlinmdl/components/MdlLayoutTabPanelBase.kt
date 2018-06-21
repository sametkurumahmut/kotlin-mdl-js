package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlLayoutTabPanelBase<out T : Element> protected constructor(
        element: T,
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutTabPanel.ELEMENT_NAME) }, classes),
        IMdlLayoutTabPanel<T> {

    init {
        element.id = id
    }

    override var isActive by this.toggleClassOfThis(element, IMdlLayoutTabPanel.IS_ACTIVE_MODIFIER_NAME, isActive)
}
