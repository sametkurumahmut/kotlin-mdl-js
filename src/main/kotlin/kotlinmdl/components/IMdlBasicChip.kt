package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicChip<out T : Element> : IMdlChip<T> {

    var text: IMdlChipText<Element>
}
