package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.invertToggleClassOfThis
import org.w3c.dom.Element

abstract class MdlGridBase<out T : Element> protected constructor(
        element: T,
        hasSpacing: Boolean = true,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlGrid.BLOCK_NAME) }, classes), IMdlGrid<T> {

    override var hasSpacing by this.invertToggleClassOfThis(element, IMdlGrid.NO_SPACING_MODIFIER_NAME, hasSpacing)
}
