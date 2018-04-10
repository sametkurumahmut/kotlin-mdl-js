package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlContactChip<out T : Element> : IMdlBasicChip<T> {

    var contact: IMdlChipContact<Element>
}
