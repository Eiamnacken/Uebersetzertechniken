package main.java;

import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.AbstractLanguageServerTest;
import org.eclipse.xtext.testing.TestCompletionConfiguration;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class LanguageServerTestXtend extends AbstractLanguageServerTest {
  public LanguageServerTestXtend() {
    super("mydsl");
  }
  
  @Test
  public void test01_initialization() {
    final ServerCapabilities capabilities = this.initialize().getCapabilities();
    Assert.assertTrue(((capabilities.getDefinitionProvider()).booleanValue() && (capabilities.getDocumentFormattingProvider()).booleanValue()));
  }
  
  @Test
  public void test02_openFile() {
    this.initialize();
    final String file = this.writeFile("hello.mydsl", "");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello Xtext!");
    _builder.newLine();
    this.open(file, _builder.toString());
    boolean _isEmpty = this.getDiagnostics().get(file).isEmpty();
    boolean _not = (!_isEmpty);
    Assert.assertTrue("There\'re issues in file \'hello.mydsl\'.", _not);
  }
  
  @Test
  public void test03_completion() {
    final Procedure1<TestCompletionConfiguration> _function = (TestCompletionConfiguration it) -> {
      it.setModel("ty");
      it.setLine(0);
      it.setColumn(2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("type -> type [[0, 0] .. [0, 2]]");
      _builder.newLine();
      it.setExpectedCompletionItems(_builder.toString());
    };
    this.testCompletion(_function);
  }
  
  @Test
  public void test04_rightSyntax() {
    this.initialize();
    final String file = this.writeFile("hello.mydsl", "");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type A{}");
    _builder.newLine();
    this.open(file, _builder.toString());
    Assert.assertTrue("There\'re issues in file \'hello.mydsl\'.", this.getDiagnostics().get(file).isEmpty());
  }
}
