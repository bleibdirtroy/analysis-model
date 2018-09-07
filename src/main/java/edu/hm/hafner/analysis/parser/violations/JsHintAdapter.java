package edu.hm.hafner.analysis.parser.violations;

import se.bjurr.violations.lib.parsers.JSHintParser;

/**
 * Parses JSHint files.
 *
 * @author Ullrich Hafner
 */
public class JsHintAdapter extends AbstractViolationAdapter {
    private static final long serialVersionUID = 2981825338893917845L;

    @Override
    protected JSHintParser createParser() {
        return new JSHintParser();
    }
}
