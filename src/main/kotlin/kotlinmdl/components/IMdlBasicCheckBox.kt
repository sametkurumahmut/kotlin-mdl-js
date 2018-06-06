package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicCheckBox<out T : Element> : IMdlCheckBox<T> {

    var input: IMdlCheckBoxInput<Element>
    var label: IMdlCheckBoxLabel<Element>?
}
