package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.*
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlCardCell(
        element: HTMLDivElement,
        colSize: IMdlCellColSize? = null,
        colSizeOnDesktop: IMdlDesktopCellColSize? = null,
        colSizeOnTablet: IMdlTabletCellColSize? = null,
        colSizeOnPhone: IMdlPhoneCellColSize? = null,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty)
    : MdlCardCellBase<HTMLDivElement>(
        element,
        colSize,
        colSizeOnDesktop,
        colSizeOnTablet,
        colSizeOnPhone,
        shadow,
        classes) {

    constructor(
            colSize: IMdlCellColSize? = null,
            colSizeOnDesktop: IMdlDesktopCellColSize? = null,
            colSizeOnTablet: IMdlTabletCellColSize? = null,
            colSizeOnPhone: IMdlPhoneCellColSize? = null,
            shadow: IMdlShadow? = MdlShadow.DP2,
            classes: String = String.empty)
            : this(document.create.div(), colSize, colSizeOnDesktop, colSizeOnTablet, colSizeOnPhone, shadow, classes)
}
