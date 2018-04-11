package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicContactChip<out T : Element> : IMdlBasicChip<T> {

    var contact: IMdlChipBasicContact<Element>
}
