package utils

package object string {
  def indentWith(c: Char)(n: Int)(s: String) = s"${c.toString * n}${s}"
  def indentSpace: Int => String => String = indentWith(' ')
  def indent: String => String = indentWith(' ')(2)
}
