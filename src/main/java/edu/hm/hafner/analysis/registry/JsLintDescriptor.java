package edu.hm.hafner.analysis.registry;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.LintParser;
import edu.hm.hafner.analysis.parser.violations.JsHintAdapter;

/**
 * A descriptor for JSLint.
 *
 * @author Lorenz Munsch
 */
class JsLintDescriptor extends ParserDescriptor {
    private static final String ID = "jslint";
    private static final String NAME = "JSLint";

    JsLintDescriptor() {
        super(ID, NAME);
    }

    @Override
    public IssueParser createParser() {
        return new LintParser();
    }
}
