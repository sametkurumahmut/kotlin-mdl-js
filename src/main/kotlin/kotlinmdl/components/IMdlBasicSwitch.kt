package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicSwitch<out T : Element> : IMdlSwitch<T> {

    var input: IMdlSwitchInput<Element>
    var label: IMdlSwitchLabel<Element>?
}
