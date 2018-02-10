package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinmdl.extensions.invertToggleClass
import kotlinmdl.extensions.replaceChildOfThis
import kotlinmdl.extensions.toggleClass
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayout(classes: String = String.empty)
    : MdlComponent<HTMLDivElement>(document.create.div(BLOCK_NAME), classes) {

    open var drawer: MdlLayoutDrawer? by this.replaceChildOfThis(null)
    open var header: MdlLayoutHeader? by this.replaceChildOfThis(null)
    open var content: MdlLayoutContent? by this.replaceChildOfThis(null)

    open var hasDesktopDrawerButton by this.invertToggleClass(NO_DESKTOP_DRAWER_BUTTON_MODIFIER_NAME, true)
    open var hasDrawerButton by this.invertToggleClass(NO_DRAWER_BUTTON_MODIFIER_NAME, true)
    open var hasFixedDrawer by this.toggleClass(FIXED_DRAWER_MODIFIER_NAME)
    open var hasFixedHeader by this.toggleClass(FIXED_HEADER_MODIFIER_NAME)

    companion object {

        const val BLOCK_NAME = "mdl-layout mdl-js-layout"
        const val FIXED_DRAWER_MODIFIER_NAME = "mdl-layout--fixed-drawer"
        const val FIXED_HEADER_MODIFIER_NAME = "mdl-layout--fixed-header"
        const val NO_DESKTOP_DRAWER_BUTTON_MODIFIER_NAME = "mdl-layout--no-desktop-drawer-button"
        const val NO_DRAWER_BUTTON_MODIFIER_NAME = "mdl-layout--no-drawer-button"
    }
}
