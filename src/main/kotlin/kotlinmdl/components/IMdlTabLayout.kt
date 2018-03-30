package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTabLayout<out T : Element> : IMdlLayout<T> {

    var tabMode: MdlTabLayoutTabMode

    companion object {

        const val FIXED_TABS_MODIFIER_NAME = "mdl-layout--fixed-tabs"
    }
}
