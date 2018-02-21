package kotlinmdl.material.style

interface IMaterialIcon {

    val hexCharacterCode: String

    /**
     * @ see <a href="https://www.w3.org/International/questions/qa-escapes">Hexadecimal numeric character reference</a>
     */
    val hexCharacterReference: String

    val ligature: String
    val name: String
}
