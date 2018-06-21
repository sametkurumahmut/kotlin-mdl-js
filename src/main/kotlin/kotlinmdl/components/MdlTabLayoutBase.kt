package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfWhen
import org.w3c.dom.Element

abstract class MdlTabLayoutBase<out T : Element> protected constructor(
        element: T,
        tabMode: MdlTabLayoutTabMode = MdlTabLayoutTabMode.SCROLLABLE,
        classes: String = String.empty) : MdlLayoutBase<T>(element, classes), IMdlTabLayout<T> {

    override var tabMode by this.toggleClassOfWhen(
            element,
            IMdlTabLayout.FIXED_TABS_MODIFIER_NAME,
            MdlTabLayoutTabMode.FIXED,
            tabMode)
}
