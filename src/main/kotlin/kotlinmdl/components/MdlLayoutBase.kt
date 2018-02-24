package kotlinmdl.components

import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.invertToggleClassOfThis
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlLayoutBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlComponent<T>(element, classes attributeSeparator IMdlLayout.BLOCK_NAME), IMdlLayout<T> {

    override var content: IMdlLayoutContent<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var drawer: IMdlLayoutDrawer<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var header: IMdlLayoutHeader<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var hasDesktopDrawerButton
            by this.invertToggleClassOfThis(element, IMdlLayout.NO_DESKTOP_DRAWER_BUTTON_MODIFIER_NAME, true)

    override var hasDrawerButton
            by this.invertToggleClassOfThis(element, IMdlLayout.NO_DRAWER_BUTTON_MODIFIER_NAME, true)

    override var hasFixedDrawer by this.toggleClassOfThis(element, IMdlLayout.FIXED_DRAWER_MODIFIER_NAME)
    override var hasFixedHeader by this.toggleClassOfThis(element, IMdlLayout.FIXED_HEADER_MODIFIER_NAME)
}
