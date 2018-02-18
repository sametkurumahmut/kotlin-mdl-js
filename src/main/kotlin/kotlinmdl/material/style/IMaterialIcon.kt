package kotlinmdl.material.style

interface IMaterialIcon {

    val codepoint: String

    /**
     * @ see <a href="https://www.w3.org/International/questions/qa-escapes">Hexadecimal numeric character reference</a>
     */
    val hexadecimalReference: String

    val ligature: String
    val name: String
}
