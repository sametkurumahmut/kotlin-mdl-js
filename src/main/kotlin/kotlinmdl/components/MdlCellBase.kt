package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.internal.extensions.toggleClassOfThis
import kotlinmdl.style.*
import org.w3c.dom.Element

abstract class MdlCellBase<out T : Element> protected constructor(
        element: T,
        colSize: IMdlCellColSize? = null,
        colSizeOnDesktop: IMdlDesktopCellColSize? = null,
        colSizeOnTablet: IMdlTabletCellColSize? = null,
        colSizeOnPhone: IMdlPhoneCellColSize? = null,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlCell.BLOCK_NAME) }, classes), IMdlCell<T> {

    override var colSize by this.replaceNewClassOfThis(element, colSize)
    override var colSizeOnDesktop by this.replaceNewClassOfThis(element, colSizeOnDesktop)
    override var colSizeOnPhone by this.replaceNewClassOfThis(element, colSizeOnPhone)
    override var colSizeOnTablet by this.replaceNewClassOfThis(element, colSizeOnTablet)
    override var isHideableOnDesktop by this.toggleClassOfThis(element, IMdlCell.HIDE_DESKTOP_MODIFIER_NAME)
    override var isHideableOnPhone by this.toggleClassOfThis(element, IMdlCell.HIDE_PHONE_MODIFIER_NAME)
    override var isHideableOnTablet by this.toggleClassOfThis(element, IMdlCell.HIDE_TABLET_MODIFIER_NAME)
    override var offset: IMdlCellOffset? by this.replaceNewClassOfThis(element, initialValue = null)
    override var offsetOnDesktop: IMdlDesktopCellOffset? by this.replaceNewClassOfThis(element, initialValue = null)
    override var offsetOnPhone: IMdlPhoneCellOffset? by this.replaceNewClassOfThis(element, initialValue = null)
    override var offsetOnTablet: IMdlTabletCellOffset? by this.replaceNewClassOfThis(element, initialValue = null)
    override var order: IMdlCellOrder? by this.replaceNewClassOfThis(element, initialValue = null)
    override var orderOnDesktop: IMdlDesktopCellOrder? by this.replaceNewClassOfThis(element, initialValue = null)
    override var orderOnPhone: IMdlPhoneCellOrder? by this.replaceNewClassOfThis(element, initialValue = null)
    override var orderOnTablet: IMdlTabletCellOrder? by this.replaceNewClassOfThis(element, initialValue = null)
    override var verticalAlignment: IMdlCellVerticalAlignment?
            by this.replaceNewClassOfThis(element, MdlCellVerticalAlignment.STRETCH, false)
}
