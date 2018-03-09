package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooterVerticalSection<out T : Element> : IMdlMegaFooterSection<T> {

    var leftSection: IMdlMegaFooterLeftSection<Element>?
    var rightSection: IMdlMegaFooterRightSection<Element>?
}
