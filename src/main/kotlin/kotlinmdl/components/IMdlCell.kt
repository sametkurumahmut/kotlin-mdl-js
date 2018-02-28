package kotlinmdl.components

import kotlinmdl.style.*
import org.w3c.dom.Element

interface IMdlCell<out T : Element> : IMdlComponent<T> {

    var colSize: IMdlCellColSize?
    var colSizeOnDesktop: IMdlDesktopCellColSize?
    var colSizeOnPhone: IMdlPhoneCellColSize?
    var colSizeOnTablet: IMdlTabletCellColSize?
    var isHideableOnDesktop: Boolean
    var isHideableOnPhone: Boolean
    var isHideableOnTablet: Boolean
    var offset: IMdlCellOffset?
    var offsetOnDesktop: IMdlDesktopCellOffset?
    var offsetOnPhone: IMdlPhoneCellOffset?
    var offsetOnTablet: IMdlTabletCellOffset?
    var order: IMdlCellOrder?
    var orderOnDesktop: IMdlDesktopCellOrder?
    var orderOnPhone: IMdlPhoneCellOrder?
    var orderOnTablet: IMdlTabletCellOrder?
    var verticalAlignment: IMdlCellVerticalAlignment?

    companion object {

        const val BLOCK_NAME = "mdl-cell"
        const val HIDE_DESKTOP_MODIFIER_NAME = "mdl-cell--hide-desktop"
        const val HIDE_PHONE_MODIFIER_NAME = "mdl-cell--hide-phone"
        const val HIDE_TABLET_MODIFIER_NAME = "mdl-cell--hide-tablet"
    }
}
