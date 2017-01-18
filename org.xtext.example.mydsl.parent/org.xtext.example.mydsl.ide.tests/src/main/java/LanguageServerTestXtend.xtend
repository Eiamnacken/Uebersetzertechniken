package main.java

import org.eclipse.xtext.testing.AbstractLanguageServerTest
import org.junit.Test
import org.junit.Assert

class LanguageServerTestXtend extends AbstractLanguageServerTest {

	new() {
		super("mydsl")
	}

	@Test
	def void test01_initialization() {
		val capabilities = initialize().capabilities
		Assert.assertTrue(capabilities.definitionProvider && capabilities.documentFormattingProvider)
	}

	@Test
	def void test02_openFile() {
		initialize()

		val file = 'hello.mydsl'.writeFile("")
		file.open('''
			Hello Xtext!
		''')

		Assert.assertTrue("There're issues in file 'hello.mydsl'.", !diagnostics.get(file).empty)
	}
	

	@Test
	def void test03_completion() {
		testCompletion [
			model = 'ty'
			line = 0
			column = 2
			expectedCompletionItems = '''
				type -> type [[0, 0] .. [0, 2]]
			'''
		]
	}

	@Test
	def void test04_rightSyntax() {
		initialize()

		val file = 'hello.mydsl'.writeFile("")
		file.open('''
			type A{}
		''')

		Assert.assertTrue("There're issues in file 'hello.mydsl'.", diagnostics.get(file).empty)
	}
}
