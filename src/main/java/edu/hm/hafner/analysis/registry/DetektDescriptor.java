package edu.hm.hafner.analysis.registry;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.CppLintParser;
import edu.hm.hafner.analysis.parser.checkstyle.CheckStyleParser;

/**
 * A descriptor for Detekt. Delegates to {@link CheckStyleParser}.
 *
 * @author Lorenz Munsch
 */
class DetektDescriptor extends ParserDescriptor {
    private static final String ID = "detekt";
    private static final String NAME = "Detekt";

    DetektDescriptor() {
        super(ID, NAME);
    }

    @Override
    public IssueParser createParser() {
        return new CheckStyleParser();
    }

    @Override
    public String getHelp() {
        return "Use option --output-format xml.";
    }

    @Override
    public String getUrl() {
        return "https://arturbosch.github.io/detekt/";
    }
}
