package kotlinmdl.components

import kotlinmdl.style.HasMdlRippleEffect
import org.w3c.dom.Element

interface IMdlLayoutTabBar<out T : Element> : IMdlLayoutElement<T>, HasMdlRippleEffect {

    var isTabManualSwitchEnabled: Boolean

    companion object {

        const val ELEMENT_NAME = "mdl-layout__tab-bar"
        const val TAB_MANUAL_SWITCH_MODIFIER_NAME = "mdl-layout__tab-manual-switch"
    }
}
