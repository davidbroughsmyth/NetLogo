// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim

import org.nlogo.agent.AgentSet
import org.nlogo.nvm.{ Context, Reporter }

class _count extends Reporter {
  override def report(context: Context): java.lang.Double =
    Double.box(report_1(context, argEvalAgentSet(context, 0)))
  def report_1(context: Context, arg0: AgentSet): Double =
    arg0.count
}
