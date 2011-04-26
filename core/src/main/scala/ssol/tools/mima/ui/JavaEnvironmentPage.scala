package ssol.tools.mima.ui

import scala.swing._
import Swing._

import scala.tools.nsc.{ util, io }
import util._

import ssol.tools.mima.Config

class JavaEnvironmentPage extends GridBagPanel with WithConstraints {

  import ClassPath._

  protected val cpEditor = new ClassPathEditor(split(Config.baseClassPath.asClasspathString)) {
    classpathLabel.text = "Make sure that the right Java environment is selected"
  }
  
  import GridBagPanel._
  import java.awt.GridBagConstraints
  import GridBagConstraints._
  
  
  withConstraints(gridx = 0, gridy = 1, fill = Fill.Both, weightx = 1.0, weighty = 1.0)(add(cpEditor, _))
}