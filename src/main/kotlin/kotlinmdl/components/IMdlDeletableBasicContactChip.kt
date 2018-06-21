package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlDeletableBasicContactChip<out T : Element> : IMdlBasicContactChip<T>, IMdlDeletableChip<T>
