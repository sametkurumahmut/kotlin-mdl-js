package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayout<out T : Element> : IMdlComponent<T> {

    var content: IMdlLayoutContent<Element>?
    var drawer: IMdlLayoutDrawer<Element>?
    var header: IMdlLayoutHeader<Element>?

    var hasDesktopDrawerButton: Boolean
    var hasDrawerButton: Boolean
    var hasFixedDrawer: Boolean
    var hasFixedHeader: Boolean

    companion object {

        const val BLOCK_NAME = "mdl-layout mdl-js-layout"
        const val FIXED_DRAWER_MODIFIER_NAME = "mdl-layout--fixed-drawer"
        const val FIXED_HEADER_MODIFIER_NAME = "mdl-layout--fixed-header"
        const val NO_DESKTOP_DRAWER_BUTTON_MODIFIER_NAME = "mdl-layout--no-desktop-drawer-button"
        const val NO_DRAWER_BUTTON_MODIFIER_NAME = "mdl-layout--no-drawer-button"
    }
}
