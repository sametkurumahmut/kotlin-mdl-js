package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlCellColSize
import kotlinmdl.style.IMdlDesktopCellColSize
import kotlinmdl.style.IMdlPhoneCellColSize
import kotlinmdl.style.IMdlTabletCellColSize
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlCell(
        element: HTMLDivElement,
        colSize: IMdlCellColSize? = null,
        colSizeOnDesktop: IMdlDesktopCellColSize? = null,
        colSizeOnTablet: IMdlTabletCellColSize? = null,
        colSizeOnPhone: IMdlPhoneCellColSize? = null,
        classes: String = String.empty)
    : MdlCellBase<HTMLDivElement>(element, colSize, colSizeOnDesktop, colSizeOnTablet, colSizeOnPhone, classes) {

    constructor(
            colSize: IMdlCellColSize? = null,
            colSizeOnDesktop: IMdlDesktopCellColSize? = null,
            colSizeOnTablet: IMdlTabletCellColSize? = null,
            colSizeOnPhone: IMdlPhoneCellColSize? = null,
            classes: String = String.empty)
            : this(document.create.div(), colSize, colSizeOnDesktop, colSizeOnTablet, colSizeOnPhone, classes)
}
