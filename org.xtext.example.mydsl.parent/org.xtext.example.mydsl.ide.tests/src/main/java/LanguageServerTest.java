package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;

import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.xtext.testing.AbstractLanguageServerTest;
import org.eclipse.xtext.testing.TestCompletionConfiguration;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

public class LanguageServerTest extends AbstractLanguageServerTest {

	public LanguageServerTest() {
		super("mydsl");
		// TODO Auto-generated constructor stub
	}
	@Test
	public void test_initialize() {
		ServerCapabilities capabilities = initialize().getCapabilities();
		
		Assert.assertTrue(capabilities.getDefinitionProvider() && capabilities.getDocumentFormattingProvider());
	}
	@Test
	public void test_openfile() {
		initialize();
		try {
			Files.deleteIfExists(Paths.get("","test.mydsl"));
			Path file = Files.createFile(Paths.get("","test.mydsl").toAbsolutePath());
			Files.write(file, "Hello Xtext!".getBytes(),StandardOpenOption.CREATE);
			//Keine Probleme
			Assert.assertTrue("There're issues in file 'hello.mydsl'",!Optional.ofNullable(this.getDiagnostics().get(file)).isPresent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_completion() {
		TestCompletionConfiguration completionConfiguration = new TestCompletionConfiguration();
		completionConfiguration.setColumn(2);
		completionConfiguration.setLine(0);
		completionConfiguration.setModel("ty");
		completionConfiguration.setExpectedCompletionItems("");
		Procedure1<TestCompletionConfiguration> comProcedure1 = new Procedure1<TestCompletionConfiguration>() {

			@Override
			public void apply(TestCompletionConfiguration p) {
				
			}
		};
		comProcedure1.apply(completionConfiguration);
		testCompletion(comProcedure1);
		
	}

}
