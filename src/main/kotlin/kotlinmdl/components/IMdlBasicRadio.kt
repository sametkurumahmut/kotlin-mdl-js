package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicRadio<out T : Element> : IMdlRadio<T> {

    var button: IMdlRadioButton<Element>
    var label: IMdlRadioLabel<Element>?
}
