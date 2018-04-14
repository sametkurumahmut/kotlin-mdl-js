package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlDeletableChip<out T : Element> : IMdlBasicChip<T> {

    var action: IMdlChipAction<Element>
}
