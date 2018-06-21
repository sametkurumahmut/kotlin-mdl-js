package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.style.*
import org.w3c.dom.Element

abstract class MdlCardCellBase<out T : Element> protected constructor(
        element: T,
        colSize: IMdlCellColSize? = null,
        colSizeOnDesktop: IMdlDesktopCellColSize? = null,
        colSizeOnTablet: IMdlTabletCellColSize? = null,
        colSizeOnPhone: IMdlPhoneCellColSize? = null,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty)
    : MdlCellBase<T>(
        element.apply { classList.add(IMdlCard.BLOCK_NAME) },
        colSize,
        colSizeOnDesktop,
        colSizeOnTablet,
        colSizeOnPhone,
        classes), IMdlCardCell<T> {

    override var shadow: IMdlShadow? by this.replaceNewClassOfThis(element, shadow)
}
