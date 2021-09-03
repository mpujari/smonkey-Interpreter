// (c) 2021 Mahesh Pujari
// This code is licensed under MIT license (see LICENSE for details)

package ast

import token.Token

case class FunctionLiteral(token: Token, parameters: List[Identifier], body: BlockStatement) extends Expression {

  override def expressionNode(): Unit = {}

  override def tokenLiteral(): String = token.literal

  override def toString: String = s"${tokenLiteral()}(${parameters.mkString(", ")})${body.toString}"

}
