package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardCell<out T : Element> : IMdlCell<T>, IMdlCard<T>
