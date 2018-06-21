package kotlinmdl.components

import kotlinmdl.style.IMdlBackgroundColor
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

interface IMdlChipBasicContact<out T : Element> : IMdlChipContact<T> {

    var color: IMdlTextColor?
    var backgroundColor: IMdlBackgroundColor?
    var text: String
}
